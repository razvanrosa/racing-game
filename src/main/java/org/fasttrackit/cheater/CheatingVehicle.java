package org.fasttrackit.cheater;

import org.fasttrackit.Vehicle;

public class CheatingVehicle extends Vehicle {

    //constant
    public static final String TYPE = "Cheater";

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getMake() + " is accelerating " + speed + " km/h " + durationInHours + " h");
        System.out.println("Cheating...");
        double distance = speed * durationInHours * 2;
        totalTraveledDistance +=distance;
        return distance;
    }

    // co-variant return type
    // overriding method can be more permissive
    @Override
    public CheatingVehicle reset() {
        super.reset();
        return this;
    }

    public void cheat(){
        totalTraveledDistance *= 2;
    }
}
