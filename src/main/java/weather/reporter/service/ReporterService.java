package weather.reporter.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.reporter.yahoo.dto.Channel;
import weather.reporter.yahoo.dto.Condition;
import weather.reporter.yahoo.dto.Weather;

@Service
public class ReporterService {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public String getWeatherUpdates(String query, String format, String store){
    RestTemplate restTemplate = new RestTemplate();
    Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=" + query + "&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);
    Channel channel = weather.getQuery().getResults().getChannel();

    Condition condition = channel.getItem().getCondition();

    logger.info("Weather Status Code is: " + condition.getCode());

    return WeatherCondition.getImagePathForCode(condition.getCode());
  }
}
