package com.example.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BeerExpert {

    HashMap<String, ArrayList<Beer>> beersData = new HashMap<>();

    public BeerExpert() {
        beersData.put(
                "jasne", new ArrayList<>(
                        Arrays.asList(
                                new Beer("perla export", 1),
                                new Beer("perla chmielowa", 2),
                                new Beer("harnas", 3)
                ))
        );
        beersData.put(
                "ciemne", new ArrayList<>(
                        Arrays.asList(
                                new Beer("debowe", 1),
                                new Beer("kuflowe", 2),
                                new Beer("namyslow", 3)
                        ))
        );
        beersData.put(
                "brązowe", new ArrayList<>(
                        Arrays.asList(
                                new Beer("krolewskie", 1),
                                new Beer("zywiec biale", 2),
                                new Beer("beczkowe", 3)
                        ))
        );
        beersData.put(
                "bursztynowe", new ArrayList<>(
                        Arrays.asList(
                                new Beer("debowe", 1),
                                new Beer("guiness", 2),
                                new Beer("imperator", 3)
                        ))
        );
    }

    public ArrayList<Beer> getBrands(String beerType) {
        return beersData.get(beerType);
    }
}
