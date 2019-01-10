package weather.reporter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.reporter.yahoo.dto.Channel;
import weather.reporter.yahoo.dto.Condition;
import weather.reporter.yahoo.dto.Weather;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.net.InetAddress;

import static weather.reporter.service.WeatherConditionCategory.GENERAL_ERROR;
import static weather.reporter.service.WeatherConditionCategory.INTERNET_CONNECTION_ERROR;

@Service
public class ReporterService {

    public static final String MAIN_WEATHER_QUERY = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"ny, ny\")";
    private static final int INTERNET_REACHABLE_TIMEOUT_IN_MILLIS = 15000; //15 seconds timeout
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public String getWeatherUpdates(String query, String format, String store) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=" + query + "&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);

            if (weather != null && weather.getQuery() != null && weather.getQuery().getResults() != null && weather.getQuery().getResults().getChannel() != null) {
                Channel channel = weather.getQuery().getResults().getChannel();
                Condition condition = channel.getItem().getCondition();
                logger.info("Weather Status Code is: " + condition.getCode());
                return WeatherCondition.getImagePathForCode(condition.getCode());
            }

            return null;
        } catch (Exception e) {
            logger.error("Something is being fishy", e);
            return getProperErrorGifLink();
        }
    }

    /**
     * Checks google as a benchmark to see if it can reach it. If not, then throws
     * {@link WeatherConditionCategory#INTERNET_CONNECTION_ERROR}, otherwise {@link WeatherConditionCategory#GENERAL_ERROR}
     */
    String getProperErrorGifLink() {
        try {
            InetAddress.getByName("www.google.com").isReachable(INTERNET_REACHABLE_TIMEOUT_IN_MILLIS);
        } catch (IOException e) {
            return INTERNET_CONNECTION_ERROR.link;
        }
        return GENERAL_ERROR.link;
    }

    //  @Scheduled(fixedRate = 2000L) //TODO uncomment this and probably put it every 5 minutes or so.
    @PostConstruct
    public void mainWeatherUpdater() {
        try {
            final String currentWeather = getWeatherUpdates(MAIN_WEATHER_QUERY, null, null);
            Runtime.getRuntime().exec("sudo ./led-image-viewer --led-gpio-mapping=adafruit-hat -C nyanCat.gif");//TODO: add the actual command line for showing the gifs
        } catch (IOException e) {
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

    //  @Scheduled(fixedRate = 2000L)
    public void testingSchedule() {
        System.out.println("I RAN! YAY!");
    }
}
