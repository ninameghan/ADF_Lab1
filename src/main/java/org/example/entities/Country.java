package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    private String name;
    private String capitalCity;
    private Double populationInMillions;
    private Continent continent;
}
