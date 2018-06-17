package weather.reporter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"condition", "description", "forecast", "guid", "lat", "link", "long", "pubDate", "title"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item{

  @JsonProperty("condition")
  private Condition condition;
  @JsonProperty("description")
  private String description;
  @JsonProperty("forecast")
  private List<Forecast> forecast = null;
  @JsonProperty("guid")
  private Guid guid;
  @JsonProperty("lat")
  private String lat;
  @JsonProperty("link")
  private String link;
  @JsonProperty("long")
  private String _long;
  @JsonProperty("pubDate")
  private String pubDate;
  @JsonProperty("title")
  private String title;

  @JsonProperty("condition")
  public Condition getCondition(){
    return condition;
  }

  @JsonProperty("condition")
  public void setCondition(Condition condition){
    this.condition = condition;
  }

  @JsonProperty("description")
  public String getDescription(){
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description){
    this.description = description;
  }

  @JsonProperty("forecast")
  public List<Forecast> getForecast(){
    return forecast;
  }

  @JsonProperty("forecast")
  public void setForecast(List<Forecast> forecast){
    this.forecast = forecast;
  }

  @JsonProperty("guid")
  public Guid getGuid(){
    return guid;
  }

  @JsonProperty("guid")
  public void setGuid(Guid guid){
    this.guid = guid;
  }

  @JsonProperty("lat")
  public String getLat(){
    return lat;
  }

  @JsonProperty("lat")
  public void setLat(String lat){
    this.lat = lat;
  }

  @JsonProperty("link")
  public String getLink(){
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link){
    this.link = link;
  }

  @JsonProperty("long")
  public String getLong(){
    return _long;
  }

  @JsonProperty("long")
  public void setLong(String _long){
    this._long = _long;
  }

  @JsonProperty("pubDate")
  public String getPubDate(){
    return pubDate;
  }

  @JsonProperty("pubDate")
  public void setPubDate(String pubDate){
    this.pubDate = pubDate;
  }

  @JsonProperty("title")
  public String getTitle(){
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title){
    this.title = title;
  }

}
