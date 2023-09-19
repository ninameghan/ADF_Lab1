package org.example;

import org.example.entities.Continent;
import org.example.entities.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("sa")
public class Beans {

    @Bean
    public Continent sa(){
        return new Continent("South America");
    }
    @Bean
    public Country br(){
        return new Country("Brazil", "Brasilia", 214.3, sa());
    }

    @Bean
    public Country pe() {
        Country peru = new Country();
        peru.setName("Peru");
        peru.setCapitalCity("Lima");
        peru.setPopulationInMillions(33.72);
        peru.setContinent(sa());
        return peru;
    }

    @Bean
    public Country ve() {
        return new Country("Venezuela", "Caracas", 28.2, sa());
    }
}
