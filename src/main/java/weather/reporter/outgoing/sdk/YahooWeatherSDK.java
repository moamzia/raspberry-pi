package weather.reporter.outgoing.sdk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface YahooWeatherSDK{
  @GetMapping("/v1/public/yql")
  public String getWeatherUpdates(@RequestBody @RequestParam("q") String query,
                                  @RequestBody @RequestParam(value = "format", defaultValue = "json") String format,
                                  @RequestBody @RequestParam(value = "env", defaultValue = "store://datatables.org/alltableswithkeys") String store);
}
