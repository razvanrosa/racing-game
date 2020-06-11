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
        if (speed > maxSpeed){
            System.out.println("Max speed exceeded");
            return 0;
        }else if(speed == maxSpeed){
            System.out.println("Careful!Max speed reached!");
        }else{
            System.out.println("Valid speed entered.");
        }
        if(damaged){
            System.out.println("The vehicle is damaged.You cannot accelerate!");
            return 0;
        }

        System.out.println(make + " is accelerating " + speed + " km/h " + durationInHours + " h");
        double distance = speed * durationInHours;

        totalTraveledDistance = totalTraveledDistance + distance;
        System.out.println("Total traveled distance : " + totalTraveledDistance);


        //use more fuel if speed > 120 km/h
        double mileageMultiplier = 1;
        if (speed > 120){
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage / 100;
        fuelLevel = fuelLevel - usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

    public void makeSound(){
        System.out.println("Make Way!!!!");
    }
}
