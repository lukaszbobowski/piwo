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
                                new Beer("perla export", R.drawable.harnas),
                                new Beer("perla chmielowa", R.drawable.harnas),
                                new Beer("harnas", R.drawable.harnas)
                ))
        );
        beersData.put(
                "ciemne", new ArrayList<>(
                        Arrays.asList(
                                new Beer("debowe", R.drawable.perla_chmiel),
                                new Beer("kuflowe", R.drawable.perla_chmiel),
                                new Beer("namyslow", R.drawable.perla_chmiel)
                        ))
        );
        beersData.put(
                "brązowe", new ArrayList<>(
                        Arrays.asList(
                                new Beer("krolewskie", R.drawable.perla_eksport),
                                new Beer("zywiec biale", R.drawable.perla_eksport),
                                new Beer("beczkowe", R.drawable.perla_eksport)
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
        beersData.put(
                "default", new ArrayList<>(
                        Arrays.asList(
                                new Beer("tyskie", 1),
                                new Beer("zubr", 2),
                                new Beer("perla", 3)
                        ))
        );
    }

    public ArrayList<Beer> getBrands(String beerType) {
        if(beersData.containsKey(beerType)) {
            return beersData.get(beerType);
        }
        return beersData.get("default");
    }
}
