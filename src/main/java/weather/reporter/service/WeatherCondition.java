package weather.reporter.service;

import java.util.HashMap;
import java.util.Map;

import static weather.reporter.service.WeatherConditionCategory.RAIN;
import static weather.reporter.service.WeatherConditionCategory.UNKNOWN;

public enum WeatherCondition{
  TORNADO(0),//
  TROPICAL_STORM(1, WeatherConditionCategory.CLOUDY),//
  HURRICANE(2),//
  SEVERE_THUNDERSTORMS(3, WeatherConditionCategory.CLOUDY),//
  THUNDERSTORMS(4, WeatherConditionCategory.CLOUDY),//
  MIXED_RAIN_AND_SNOW(5, WeatherConditionCategory.SNOW),//
  MIXED_RAIN_AND_SLEET(6, RAIN),//
  MIXED_SNOW_AND_SLEET(7, WeatherConditionCategory.SNOW),//
  FREEZING_DRIZZLE(8, RAIN),//
  DRIZZLE(9, RAIN),//
  FREEZING_RAIN(10, RAIN),//
  SHOWERS(11, RAIN),//
  SHOWERS_1(12, RAIN),//
  SNOW_FLURRIES(13, WeatherConditionCategory.SNOW),//
  LIGHT_SNOW_SHOWERS(14, WeatherConditionCategory.SNOW),//
  BLOWING_SNOW(15, WeatherConditionCategory.SNOW),//
  SNOW(16, WeatherConditionCategory.SNOW),//
  HAIL(17),//
  SLEET(18, WeatherConditionCategory.SNOW),//
  DUST(19),//
  FOGGY(20),//
  HAZE(21),//
  SMOKY(22),//
  BLUSTERY(23),//
  WINDY(24),//
  COLD(25),//
  CLOUDY(26, WeatherConditionCategory.CLOUDY),//
  MOSTLY_CLOUDY_NIGHT(27),//
  MOSTLY_CLOUDY_DAY(28, WeatherConditionCategory.CLOUDY),//
  PARTLY_CLOUDY_NIGHT(29),//
  PARTLY_CLOUDY_DAY(30, WeatherConditionCategory.CLOUDY),//
  CLEAR_NIGHT(31),//
  SUNNY(32, WeatherConditionCategory.SUNNY),//
  FAIR_NIGHT(33),//
  FAIR_DAY(34),//
  MIXED_RAIN_AND_HAIL(35, RAIN),//
  HOT(36, WeatherConditionCategory.SUNNY),//
  ISOLATED_THUNDERSTORMS(37, WeatherConditionCategory.CLOUDY),//
  SCATTERED_THUNDERSTORMS(38, WeatherConditionCategory.CLOUDY),//
  SCATTERED_THUNDERSTORMS_1(39, WeatherConditionCategory.CLOUDY),//
  SCATTERED_SHOWERS(40, RAIN),//
  HEAVY_SNOW(41, WeatherConditionCategory.SNOW),//
  SCATTERED_SNOW_SHOWERS(42, WeatherConditionCategory.SNOW),//
  HEAVY_SNOW_1(43, WeatherConditionCategory.SNOW),//
  PARTLY_CLOUDY(44, WeatherConditionCategory.CLOUDY),//
  THUNDERSHOWERS(45, RAIN),//
  SNOW_SHOWERS(46, WeatherConditionCategory.SNOW),//
  ISOLATED_THUNDERSHOWERS(47, RAIN);

  private static final String RESOURCES = "/Users/aziae0129/WeatherReporter/src/main/resources";

  private static final Map<Integer, WeatherConditionCategory> cachedCodeToCategory = new HashMap<>();

  static {
    for(WeatherCondition condition : values()) {
      cachedCodeToCategory.put(condition.code, condition.category);
    }
  }

  public final int code;
  public final WeatherConditionCategory category;

  WeatherCondition(int code, WeatherConditionCategory category){
    this.code = code;
    this.category = category;
  }

  WeatherCondition(int code){
    this.code = code;
    this.category = UNKNOWN;
  }

  public static String getImagePathForCode(int code) {
    return cachedCodeToCategory.get(code).link;
  }
}
