import org.example.Beans;
import org.example.entities.Continent;
import org.example.entities.Country;
import org.example.entities.Planet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Locale;

public class Tests {

    @Nested
    @ExtendWith(SpringExtension.class)
    @ContextConfiguration(locations = {"classpath:/beans.config.xml"})
    public class BeansTests {

        @Autowired
        ApplicationContext applicationContext;

        @Test
        public void testPlanetExists(){
            Planet planet = (Planet) applicationContext.getBean("planet");
            Assertions.assertNotNull(planet);
        }

        @Test
        public void testPlanetName(){
            Planet planet = (Planet) applicationContext.getBean("planet");
            Assertions.assertEquals("Earth", planet.getName());
        }
    }

    @Nested
    @ExtendWith(SpringExtension.class)
    @ContextConfiguration(locations = {"classpath:/beans.config.xml"})
    public class LanguageTests {

        @Autowired
        ApplicationContext applicationContext;

        @Test
        public void testDefault(){
            String message = applicationContext.getMessage("welcome", null, Locale.getDefault());
            Assertions.assertEquals("Hello", message);
        }
        @Test
        public void testFrench(){
            String message = applicationContext.getMessage("welcome", null, Locale.FRENCH);
            Assertions.assertEquals("Bonjour", message);
        }
    }
}
