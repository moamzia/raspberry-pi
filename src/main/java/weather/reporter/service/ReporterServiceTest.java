package weather.reporter.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import weather.reporter.configuration.MainConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MainConfiguration.class)
class ReporterServiceTest {
    @Autowired
    private ReporterService service;

    @Test
    void testSomething() {
        assertEquals(WeatherConditionCategory.GENERAL_ERROR.link, service.getProperErrorGifLink());
    }
}