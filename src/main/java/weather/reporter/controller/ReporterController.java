package weather.reporter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import weather.reporter.service.ReporterService;
import weather.reporter.service.WeatherConditionCategory;

@RestController
//@Slf4j
public class ReporterController{
  @Autowired
  private ReporterService reporter;

  @ExceptionHandler(Exception.class)
  public void exceptionHandler(Exception exception){
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.error(exception.getMessage(), exception);
  }

  @GetMapping("/")
  public String getIndex(){
    return reporter.getWeatherUpdates("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"ny, ny\")", "", "");
  }

  @GetMapping("/help")
  public WeatherConditionCategory[] help(){
    return WeatherConditionCategory.values();
  }

  @GetMapping("/{condition}")
  public String getLinkToWeatherConditionGif(@PathVariable("condition") String category) {
    return WeatherConditionCategory.getLink(category);
  }
}
