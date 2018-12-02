package weather.reporter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.reporter.yahoo.dto.Channel;
import weather.reporter.yahoo.dto.Condition;
import weather.reporter.yahoo.dto.Weather;

import java.io.IOException;

@Service
public class ReporterService{

  public static final String MAIN_WEATHER_QUERY = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"ny, ny\")";
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public String getWeatherUpdates(String query, String format, String store){
    RestTemplate restTemplate = new RestTemplate();
    Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=" + query + "&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);
    Channel channel = weather.getQuery().getResults().getChannel();

    Condition condition = channel.getItem().getCondition();

    logger.info("Weather Status Code is: " + condition.getCode());

    return WeatherCondition.getImagePathForCode(condition.getCode());
  }

//  @Scheduled(fixedRate = 2000L) //TODO uncomment this and probably put it every 5 minutes or so.
  private void mainWeatherUpdater(){
    try{
      final String currentWeather = getWeatherUpdates(MAIN_WEATHER_QUERY, null, null);
      Runtime.getRuntime().exec("ifconfig");//TODO: add the actual command line for showing the gifs
    }catch(IOException e){
      e.printStackTrace();
    }
    //    final Process p;
    //    try{
    //      p = Runtime.getRuntime().exec("ifconfig");
    //
    //      // From here on, is only needed if we need the output of the command line.
    //      new Thread(() -> {
    //        BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
    //        String line = null;
    //
    //        try{
    //          while((line = input.readLine()) != null)
    //            System.out.println(line);
    //        }catch(IOException e){
    //          e.printStackTrace();
    //        }
    //      }).start();
    //
    //      p.waitFor();
    //    }catch(IOException | InterruptedException e){
    //      e.printStackTrace();
    //    }
  }

  @Scheduled(fixedRate = 2000L)
  public void testingSchedule() {
    System.out.println("I RAN! YAY!");
  }
}
