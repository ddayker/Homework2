package com.dayker;

import com.dayker.car.Car;
import com.dayker.car.CarMovement;
import com.dayker.util.CarArrayUtil;
import com.dayker.util.InputUtil;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arrayLength;
        int choice;
        Car[] carArray = new Car[0];

        while (true) {
            System.out.print("""
                                        
                    Select action:
                    1. Generate an array of cars
                    2. Output an array of cars
                    3. Sort an array of cars
                    4. Run interface methods
                    0. Exit
                    """);
            choice = InputUtil.enterInteger(); // Utility method for entering an non-negative integer.

            switch (choice) {
                case 1:
                    if (CarArrayUtil.arrayRegeneration()) { // Checking if the array was generated earlier.
                        System.out.println("Enter the length of the array:");
                        arrayLength = InputUtil.enterInteger();
                        carArray = CarArrayUtil.generateArray(arrayLength);
                    }
                    break;
                case 2:
                    CarArrayUtil.printArray(carArray);
                    break;
                case 3:
                    if (CarArrayUtil.arrayGeneratedCheck(carArray)) { // Checking for an empty array
                        Arrays.sort(carArray);
                        System.out.println("The array of cars was sorted by engine volume.");
                    }
                    break;
                case 4:
                    CarMovement carMovementInterfaceLink = new Car();
                    carMovementInterfaceLink.move();
                    int speed = 70;
                    carMovementInterfaceLink.movingWithSpeed(speed);
                    carMovementInterfaceLink.stop();
                    int averageSpeed = 60;
                    int time = 2;
                    carMovementInterfaceLink.coveredDistance(averageSpeed, time);
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    System.exit(0);
                default:
                    System.out.println("Incorrect input! Try again.");

            }

        }
    }
}
