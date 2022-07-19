package com.dayker.car;

public class Car implements CarMovement, Comparable<Car> {

    private String carBrand;

    private String carModel;

    private String transmission;

    private double engineVolume;

    private double fuelTankCapacity;

    private int numOfDoors;

    private int numOfSeats;

    public Car() {
        this.carBrand = "unknown";
        this.carModel = "unknown";
        this.transmission = "unknown";
        this.engineVolume = 0;
        this.fuelTankCapacity = 0;
        this.numOfDoors = 0;
        this.numOfSeats = 0;
    }

    public Car(String carBrand, String carModel, String transmission, double engineVolume, double fuelTankCapacity, int numOfDoors, int numOfSeats) {
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
        this.fuelTankCapacity = fuelTankCapacity;
        this.numOfDoors = numOfDoors;
        this.numOfSeats = numOfSeats;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", transmission='" + transmission + '\'' +
                ", engineVolume=" + String.format("%.1f", engineVolume) +
                ", fuelTankCapacity=" + String.format("%.1f", fuelTankCapacity) +
                ", numOfDoors=" + numOfDoors +
                ", numOfSeats=" + numOfSeats +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.engineVolume, engineVolume) != 0) return false;
        if (Double.compare(car.fuelTankCapacity, fuelTankCapacity) != 0) return false;
        if (numOfDoors != car.numOfDoors) return false;
        if (numOfSeats != car.numOfSeats) return false;
        if (!carBrand.equals(car.carBrand)) return false;
        if (!carModel.equals(car.carModel)) return false;
        return transmission.equals(car.transmission);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = carBrand.hashCode();
        result = 31 * result + carModel.hashCode();
        result = 31 * result + transmission.hashCode();
        temp = Double.doubleToLongBits(engineVolume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(fuelTankCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + numOfDoors;
        result = 31 * result + numOfSeats;
        return result;
    }

    @Override
    public void move() {
        System.out.println("The car is moving...");
    }

    @Override
    public int movingWithSpeed(int speed) {
        System.out.println("The car is moving at a speed of " + speed + " km/h.");
        return speed;
    }

    @Override
    public void stop() {
        System.out.println("The car is stopped!");
    }

    @Override
    public double coveredDistance(int averageSpeed, double time) {
        System.out.println("The car has covered a distance of " + (averageSpeed * time) + " km.");
        return averageSpeed * time;
    }

    @Override
    public int compareTo(Car o) {

        return Double.compare(this.getEngineVolume(), o.getEngineVolume());
    }
}
