package weather.reporter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import weather.reporter.outgoing.sdk.YahooWeatherSDK;

@Configuration
public class MainConfiguration{
//  @Bean
//  public SpringRestInvokerProxyFactoryBean<YahooWeatherSDK> weatherSdk(){
//    RestTemplate restTemplate = new RestTemplate();
//    SpringRestInvokerProxyFactoryBean<YahooWeatherSDK> bean = new SpringRestInvokerProxyFactoryBean<YahooWeatherSDK>();
//
//    bean.setBaseUrl("https://query.yahooapis.com");
//    bean.setRemoteServiceInterfaceClass(YahooWeatherSDK.class);
//    bean.setRestTemplate(restTemplate);
//    return bean;
//  }

}
