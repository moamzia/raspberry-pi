package weather.reporter.service;

public enum WeatherConditionCategory{
  SNOW("https://media.giphy.com/media/XcsdCc78BtNBu/giphy.gif"),//
  RAIN("https://media.giphy.com/media/3osxYzIQRqN4DOEddC/giphy.gif"),//
  CLOUDY("https://media.giphy.com/media/3o7rc6sa2RvKo8K5EI/giphy.gif"),//
  SUNNY("https://media.giphy.com/media/o7R0zQ62m8Nk4/giphy.gif"),//
  UNKNOWN("https://media.giphy.com/media/kaq6GnxDlJaBq/giphy.gif");

  public final String link;

  WeatherConditionCategory(String link){
    this.link = link;
  }

  public static String getLink(String category){
    try{
      return valueOf(category.toUpperCase()).link;
    }catch(IllegalArgumentException e){
      return UNKNOWN.link;
    }
  }
}
