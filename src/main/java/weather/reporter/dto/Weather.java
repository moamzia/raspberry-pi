package weather.reporter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather{
  private Query query;

  public Query getQuery(){
    return query;
  }

  public void setQuery(Query query){
    this.query = query;
  }
}
