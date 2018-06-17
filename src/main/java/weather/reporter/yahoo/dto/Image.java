package weather.reporter.yahoo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"height", "link", "title", "url", "width"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Image{

  @JsonProperty("height")
  private String height;
  @JsonProperty("link")
  private String link;
  @JsonProperty("title")
  private String title;
  @JsonProperty("url")
  private String url;
  @JsonProperty("width")
  private String width;

  @JsonProperty("height")
  public String getHeight(){
    return height;
  }

  @JsonProperty("height")
  public void setHeight(String height){
    this.height = height;
  }

  @JsonProperty("link")
  public String getLink(){
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link){
    this.link = link;
  }

  @JsonProperty("title")
  public String getTitle(){
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title){
    this.title = title;
  }

  @JsonProperty("url")
  public String getUrl(){
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url){
    this.url = url;
  }

  @JsonProperty("width")
  public String getWidth(){
    return width;
  }

  @JsonProperty("width")
  public void setWidth(String width){
    this.width = width;
  }

}
