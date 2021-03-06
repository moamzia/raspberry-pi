package weather.reporter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Query{
  private Integer count;
  private String created;
  private String lang;
  private Results results;

  public Integer getCount(){
    return count;
  }

  public void setCount(Integer count){
    this.count = count;
  }

  public String getCreated(){
    return created;
  }

  public void setCreated(String created){
    this.created = created;
  }

  public String getLang(){
    return lang;
  }

  public void setLang(String lang){
    this.lang = lang;
  }

  public Results getResults(){
    return results;
  }

  public void setResults(Results results){
    this.results = results;
  }
}
