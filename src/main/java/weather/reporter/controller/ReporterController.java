package weather.reporter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import weather.reporter.service.ReporterService;

@RestController
//@Slf4j
public class ReporterController{
  //  @Autowired
  //  private YahooWeatherSDK weatherSdk;

  @Autowired
  private ReporterService reporter;

  public String getWeatherUpdates(String query, String format, String store){
    return reporter.getWeatherUpdates(query, format, store);
    //return weatherSdk.getWeatherUpdates(query, "json", "store://datatables.org/alltableswithkeys");
  }

  @PostMapping("/")
  public String index(){
    return "{\" text \":\" this is a text in post controller \"}";
  }

  @ExceptionHandler(Exception.class)
  public void exceptionHandler(Exception exception){
    Logger logger = LoggerFactory.getLogger(this.getClass());
    logger.error(exception.getMessage(), exception);

  }

  @GetMapping("/")
  public String getIndex(){
    return getWeatherUpdates("select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"ny, ny\")", "", "");

//    return "this is a text in get controller";
  }
}
