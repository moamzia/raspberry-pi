package weather.reporter.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import weather.reporter.yahoo.dto.Weather;

@Service
public class ReporterService {
  private static final String RESOURCES = "/Users/aziae0129/WeatherReporter/src/main/resources";

  public String getWeatherUpdates(String query, String format, String store){
    RestTemplate restTemplate = new RestTemplate();
    Weather weather = restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=" + query + "&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);
    return weather.toString();
  }
}
