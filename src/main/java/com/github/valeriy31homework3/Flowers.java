package com.github.valeriy31homework3;

public class Flowers {
    String flowerName;
    String flowerColor;
    int flowerAge;
    String flowerSize;
    boolean flowerWatered;
    boolean flowerTransplanted;
    double flowerPrice;
    boolean flowerDied;
    int flowerWateredCount;

    public Flowers(String flowerName, String flowerColor, int flowerAge, String flowerSize, boolean flowerWatered, boolean flowerTransplanted, double flowerPrice, boolean flowerDied, int flowerWateredCount){
        this.flowerName = flowerName;
        this.flowerColor = flowerColor;
        this.flowerAge = flowerAge;
        this.flowerSize = flowerSize;
        this.flowerWatered = flowerWatered;
        this.flowerTransplanted = flowerTransplanted;
        this.flowerPrice = flowerPrice;
        this.flowerDied = flowerDied;
        this.flowerWateredCount=flowerWateredCount;
    }

    void waterPlant(){
        flowerWateredCount++;
        flowerWatered = true;

        if (flowerWateredCount < 3){
                System.out.println("Flower was water");
        }
        else if (flowerWateredCount ==3){
            flowerDied = true;
            System.out.println("Flower is died");
        }
    }

    void trasplantPlant(){
        flowerWatered = false;
        flowerSize = "Medium";
        flowerAge+=10;
        flowerTransplanted = true;
    }

    void printInformation() {
        System.out.println("Flower name: " + flowerName);
        System.out.println("Color: " + flowerColor);
        System.out.println("Age: " + flowerAge);
        System.out.println("Size: " + flowerSize);
        System.out.println("Watered: " + flowerWatered);
        System.out.println("Transplanted: " + flowerTransplanted);
        System.out.println("Price: " + flowerPrice);
        System.out.println("Died: " + flowerDied);
        System.out.println("Watered count: " + flowerWateredCount);
        System.out.println("-------------------------");
    }
}
