package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Continent {
    private String name;

    @Autowired
    private Planet planet;

    public Continent(String name) {
        this.name = name;
    }
}
