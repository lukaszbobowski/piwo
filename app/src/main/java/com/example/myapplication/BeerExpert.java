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
                                new Beer("perla chmielowa", R.drawable.perla_chmiel),
                                new Beer("harnas", R.drawable.perla_eksport)
                ))
        );
        beersData.put(
                "ciemne", new ArrayList<>(
                        Arrays.asList(
                                new Beer("debowe", R.drawable.fortuna),
                                new Beer("kuflowe", R.drawable.ksiazece),
                                new Beer("namyslow", R.drawable.okocim)
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
                                new Beer("debowe", R.drawable.perla_eksport),
                                new Beer("guiness", R.drawable.perla_eksport),
                                new Beer("imperator", R.drawable.perla_eksport)
                        ))
        );
        beersData.put(
                "default", new ArrayList<>(
                        Arrays.asList(
                                new Beer("tyskie", R.drawable.perla_eksport),
                                new Beer("zubr", R.drawable.perla_eksport),
                                new Beer("perla", R.drawable.perla_eksport)
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
