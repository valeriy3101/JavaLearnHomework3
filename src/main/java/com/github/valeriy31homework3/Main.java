package com.github.valeriy31homework3;

public class Main {
    public static void main(String[] args) {
        Flowers Aglaonema = new Flowers("Aglaonema", "light-green", 1,"small",false,false,2500.00,false,0);

        Aglaonema.waterPlant();
        Aglaonema.printInformation();

        Aglaonema.waterPlant();
        Aglaonema.printInformation();

        Aglaonema.waterPlant();
        Aglaonema.printInformation();


    }
}
