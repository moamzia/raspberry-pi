package weather.reporter.yahoo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel{
  @JsonProperty("astronomy")
  private Astronomy astronomy;
  @JsonProperty("atmosphere")
  private Atmosphere atmosphere;
  @JsonProperty("description")
  private String description;
  @JsonProperty("image")
  private Image image;
  @JsonProperty("item")
  private Item item;
  @JsonProperty("language")
  private String language;
  @JsonProperty("lastBuildDate")
  private String lastBuildDate;
  @JsonProperty("link")
  private String link;
  @JsonProperty("location")
  private Location location;
  @JsonProperty("title")
  private String title;
  @JsonProperty("ttl")
  private String ttl;
  @JsonProperty("units")
  private Units units;
  @JsonProperty("wind")
  private Wind wind;

  @JsonProperty("astronomy")
  public Astronomy getAstronomy(){
    return astronomy;
  }

  @JsonProperty("astronomy")
  public void setAstronomy(Astronomy astronomy){
    this.astronomy = astronomy;
  }

  @JsonProperty("atmosphere")
  public Atmosphere getAtmosphere(){
    return atmosphere;
  }

  @JsonProperty("atmosphere")
  public void setAtmosphere(Atmosphere atmosphere){
    this.atmosphere = atmosphere;
  }

  @JsonProperty("description")
  public String getDescription(){
    return description;
  }

  @JsonProperty("description")
  public void setDescription(String description){
    this.description = description;
  }

  @JsonProperty("image")
  public Image getImage(){
    return image;
  }

  @JsonProperty("image")
  public void setImage(Image image){
    this.image = image;
  }

  @JsonProperty("item")
  public Item getItem(){
    return item;
  }

  @JsonProperty("item")
  public void setItem(Item item){
    this.item = item;
  }

  @JsonProperty("language")
  public String getLanguage(){
    return language;
  }

  @JsonProperty("language")
  public void setLanguage(String language){
    this.language = language;
  }

  @JsonProperty("lastBuildDate")
  public String getLastBuildDate(){
    return lastBuildDate;
  }

  @JsonProperty("lastBuildDate")
  public void setLastBuildDate(String lastBuildDate){
    this.lastBuildDate = lastBuildDate;
  }

  @JsonProperty("link")
  public String getLink(){
    return link;
  }

  @JsonProperty("link")
  public void setLink(String link){
    this.link = link;
  }

  @JsonProperty("location")
  public Location getLocation(){
    return location;
  }

  @JsonProperty("location")
  public void setLocation(Location location){
    this.location = location;
  }

  @JsonProperty("title")
  public String getTitle(){
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title){
    this.title = title;
  }

  @JsonProperty("ttl")
  public String getTtl(){
    return ttl;
  }

  @JsonProperty("ttl")
  public void setTtl(String ttl){
    this.ttl = ttl;
  }

  @JsonProperty("units")
  public Units getUnits(){
    return units;
  }

  @JsonProperty("units")
  public void setUnits(Units units){
    this.units = units;
  }

  @JsonProperty("wind")
  public Wind getWind(){
    return wind;
  }

  @JsonProperty("wind")
  public void setWind(Wind wind){
    this.wind = wind;
  }

}
