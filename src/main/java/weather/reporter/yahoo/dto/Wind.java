package weather.reporter.yahoo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"chill", "direction", "speed"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind{

  @JsonProperty("chill")
  private String chill;
  @JsonProperty("direction")
  private String direction;
  @JsonProperty("speed")
  private String speed;

  @JsonProperty("chill")
  public String getChill(){
    return chill;
  }

  @JsonProperty("chill")
  public void setChill(String chill){
    this.chill = chill;
  }

  @JsonProperty("direction")
  public String getDirection(){
    return direction;
  }

  @JsonProperty("direction")
  public void setDirection(String direction){
    this.direction = direction;
  }

  @JsonProperty("speed")
  public String getSpeed(){
    return speed;
  }

  @JsonProperty("speed")
  public void setSpeed(String speed){
    this.speed = speed;
  }

}
