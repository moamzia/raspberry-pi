package weather.reporter.yahoo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results{
  private Channel channel;

  public Channel getChannel(){
    return channel;
  }

  public void setChannel(Channel channel){
    this.channel = channel;
  }
}
