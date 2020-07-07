package org.fasttrackit.domain.vehicle;

import org.fasttrackit.domain.Mobile;

import java.util.Objects;

public abstract class Vehicle implements Mobile {

    //class variable / static variable
    private static int totalVehicleCount;

    //instance variable
    private String make;
    private String model;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double maxSpeed;
    protected double totalTraveledDistance;
    private boolean damaged;

    public Vehicle() {
        totalVehicleCount++;
    }

    //method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }


    public double accelerate(double speed, double durationInHours) {
        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful!Max speed reached!");
        } else {
            System.out.println("Valid speed entered.");
        }
        if (canMove())
            if (damaged) {
                System.out.println("The vehicle is damaged.You cannot accelerate!");
                return 0;
            }

        System.out.println(make + " is accelerating " + speed + " km/h " + durationInHours + " h");
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;
        System.out.println("Total traveled distance : " + totalTraveledDistance);


        //use more fuel if speed > 120 km/h
        double mileageMultiplier = 1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

    public void makeSound() {
        System.out.println("Make Way!!!!");
    }

    //read-only variable
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", maxSpeed=" + maxSpeed +
                ", totalTraveledDistance=" + totalTraveledDistance +
                ", damaged=" + damaged +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.mileage, mileage) == 0 &&
                Double.compare(vehicle.fuelLevel, fuelLevel) == 0 &&
                Double.compare(vehicle.maxSpeed, maxSpeed) == 0 &&
                Double.compare(vehicle.totalTraveledDistance, totalTraveledDistance) == 0 &&
                damaged == vehicle.damaged &&
                Objects.equals(make, vehicle.make) &&
                Objects.equals(model, vehicle.model) &&
                Objects.equals(color, vehicle.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, color, mileage, fuelLevel, maxSpeed, totalTraveledDistance, damaged);
    }

    protected Vehicle reset() {
        totalTraveledDistance = 0;
        fuelLevel = 0;
        damaged = false;
        return this;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public void setTotalVehicleCount(int i) {
    }

    @Override
    public String getName() {
        return make;
    }

    @Override
    public boolean canMove() {
        return fuelLevel > 0 && !damaged;
    }
}
