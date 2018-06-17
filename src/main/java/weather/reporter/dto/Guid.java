package weather.reporter.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"isPermaLink"})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Guid{

  @JsonProperty("isPermaLink")
  private String isPermaLink;

  @JsonProperty("isPermaLink")
  public String getIsPermaLink(){
    return isPermaLink;
  }

  @JsonProperty("isPermaLink")
  public void setIsPermaLink(String isPermaLink){
    this.isPermaLink = isPermaLink;
  }

}
