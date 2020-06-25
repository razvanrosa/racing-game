package org.fasttrackit.domain;

public interface Mobile {

    double accelerate(double speed,double durationInHours);
    String getName();
    boolean canMove();
    double getTotalTraveledDistance();

    void accelerate(double speed);
}
