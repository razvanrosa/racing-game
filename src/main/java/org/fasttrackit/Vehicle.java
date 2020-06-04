package org.fasttrackit;

public class Vehicle {

    //instance variable
    String make;
    String model;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTraveledDistance;
    boolean damaged;

    public double accelerate(double speed,double durationInHours){
        System.out.println(make + " is accelerating " + speed + " km/h " + durationInHours + " h");
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;
        System.out.println("Total traveled distance : " + totalTraveledDistance);

        double usedFuel = distance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;
        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }
}
