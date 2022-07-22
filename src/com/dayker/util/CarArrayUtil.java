package com.dayker.util;

import com.dayker.car.Car;

import java.util.ArrayList;
import java.util.List;

import static com.dayker.car.CarBrands.BMW;
import static com.dayker.car.CarBrands.MERCEDES;
import static com.dayker.car.CarBrands.AUDI;
import static com.dayker.car.CarBrands.VOLKSWAGEN;
import static com.dayker.car.CarBrands.CHEVROLET;
import static com.dayker.car.CarBrands.MAZDA;
import static com.dayker.car.CarBrands.MINI;
import static com.dayker.car.CarBrands.TOYOTA;
import static com.dayker.car.CarBrands.FORD;
import static com.dayker.car.CarBrands.KIA;
import static java.lang.Math.*;

public class CarArrayUtil {

    private static boolean arrayIsCreated = false;

    public static Car[] generateArray(int arrayLength) {
        Car[] newArray = new Car[arrayLength];

        List<Car> cars = new ArrayList<>();
        cars.add(new Car(BMW, "X5", "Automatic", 3.0, 85, 5, 5));
        cars.add(new Car(BMW, "X6", "Automatic", 3.5, 83, 5, 5));
        cars.add(new Car(AUDI, "A6", "Automatic", 2.0, 63, 4, 4));
        cars.add(new Car(AUDI, "Q7", "Automatic", 4.2, 85, 5, 5));
        cars.add(new Car(MERCEDES, "SLC", "Automatic", 2.0, 60, 2, 2));
        cars.add(new Car(MERCEDES, "GLE", "Automatic", 3.0, 85, 5, 7));
        cars.add(new Car(MAZDA, "CX-5", "Automatic", 2.5, 58, 5, 5));
        cars.add(new Car(MAZDA, "RX-8", "Manual", 4.0, 60, 2, 2));
        cars.add(new Car(TOYOTA, "Camry XV70", "Automatic", 2.5, 60, 4, 5));
        cars.add(new Car(TOYOTA, "Corolla XI", "Automatic", 2.0, 55, 4, 5));
        cars.add(new Car(FORD, "Mustang", "Automatic", 5.0, 60, 2, 2));
        cars.add(new Car(FORD, "Focus IV", "Automatic", 1.5, 52, 4, 5));
        cars.add(new Car(MINI, "Cooper III", "Automatic", 1.5, 44, 4, 4));
        cars.add(new Car(MINI, "Clubman II", "Automatic", 2.0, 48, 4, 4));
        cars.add(new Car(CHEVROLET, "Cruze", "Automatic", 1.4, 60, 4, 5));
        cars.add(new Car(CHEVROLET, "Camaro V", "Automatic", 6.2, 59, 2, 2));
        cars.add(new Car(VOLKSWAGEN, "Passat B8", "Automatic", 1.6, 66, 4, 5));
        cars.add(new Car(VOLKSWAGEN, "Jetta VI", "Automatic", 1.4, 55, 4, 5));
        cars.add(new Car(KIA, "Rio IV X", "Automatic", 1.6, 50, 4, 5));
        cars.add(new Car(KIA, "Stinger", "Automatic", 3.3, 60, 4, 5));

        for (int i = 0; i < arrayLength; i++) {
            newArray[i] = cars.get((int) (random() * cars.size()));  // add random car from list to array
        }
        System.out.println("Array has been generated!");
        arrayIsCreated = true;
        return newArray;

    }

    public static void printArray(Car[] cars) {
        if (arrayGeneratedCheck(cars)) { // Checking for an empty array

            //output in the form of a "table"
            System.out.println("\n|№ |    Brand   |    Model   | Transmission | Engine Vol.| Fuel Tank Cap.| Doors | Seats |");
            for (int i = 0; i < cars.length; i++) {
                System.out.printf("|%2d| %10s | %10s | %12s | %10.1f | %13.1f | %5d | %5d |\n",
                        (i + 1), cars[i].getCarBrand(), cars[i].getCarModel(), cars[i].getTransmission(), cars[i].getEngineVolume(),
                        cars[i].getFuelTankCapacity(), cars[i].getNumOfDoors(), cars[i].getNumOfSeats());
            }
        }
    }

    public static boolean arrayGeneratedCheck(Car[] cars) {
        final int emptyArrayLength =0;
        if (cars.length == emptyArrayLength) {
            System.out.println("The array has not been generated.");
            return false;
        } else {
            return true;
        }
    }

    public static boolean arrayRegeneration() {
        boolean regenerate = true;
        if (arrayIsCreated) {
            System.out.println("THE ARRAY HAS ALREADY BEEN GENERATED!\n" +
                    "Press \"1\" to regenerate it or \"0\" to exit.");
            int choice = InputUtil.enterInteger(); // Utility method for entering an non-negative integer.
            switch (choice) {
                case 1:
                    break;
                case 0:
                    System.out.println("The array has not been regenerated.");
                    regenerate = false;
                    break;
                default:
                    System.out.println("Unknown command, the array has not been regenerated.");
                    regenerate = false;
                    break;

            }
        }
        return regenerate;
    }
}

