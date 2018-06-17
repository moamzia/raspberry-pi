package weather.reporter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"sunrise", "sunset"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Astronomy{

  @JsonProperty("sunrise")
  private String sunrise;
  @JsonProperty("sunset")
  private String sunset;

  @JsonProperty("sunrise")
  public String getSunrise(){
    return sunrise;
  }

  @JsonProperty("sunrise")
  public void setSunrise(String sunrise){
    this.sunrise = sunrise;
  }

  @JsonProperty("sunset")
  public String getSunset(){
    return sunset;
  }

  @JsonProperty("sunset")
  public void setSunset(String sunset){
    this.sunset = sunset;
  }

}
