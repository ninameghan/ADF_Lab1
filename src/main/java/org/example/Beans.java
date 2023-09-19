package org.example;

import org.example.entities.Country;
import org.springframework.context.annotation.Bean;

public class Beans {
    @Bean
    public Country br(){
        return new Country("Brazil", "Brasilia", 214.3);
    }

    @Bean
    public Country pe() {
        Country peru = new Country();
        peru.setName("Peru");
        peru.setCapitalCity("Lima");
        peru.setPopulationInMillions(33.72);
        return peru;
    }

    @Bean
    public Country ve() {
        return new Country("Venezuela", "Caracas", 28.2);
    }
}
