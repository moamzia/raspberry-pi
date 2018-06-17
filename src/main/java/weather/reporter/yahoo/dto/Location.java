package weather.reporter.yahoo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"city", "country", "region"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location{

  @JsonProperty("city")
  private String city;
  @JsonProperty("country")
  private String country;
  @JsonProperty("region")
  private String region;

  @JsonProperty("city")
  public String getCity(){
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city){
    this.city = city;
  }

  @JsonProperty("country")
  public String getCountry(){
    return country;
  }

  @JsonProperty("country")
  public void setCountry(String country){
    this.country = country;
  }

  @JsonProperty("region")
  public String getRegion(){
    return region;
  }

  @JsonProperty("region")
  public void setRegion(String region){
    this.region = region;
  }

}
