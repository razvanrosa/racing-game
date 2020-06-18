package org.fasttrackit;

import org.fasttrackit.cheater.CheatingVehicle;
import org.w3c.dom.ls.LSOutput;

public class App {

    public static void main(String[] args) {

        Game game = new Game();
        game.start();

    /*    //polymorphism
        CheatingVehicle vehicle = new CheatingVehicle();
        vehicle.setMake("Cheating vehicle");

        //object type determines method implementation
        vehicle.accelerate(60,1);

        System.out.println("Accelerate with 1 param");
        vehicle.accelerate(60);

        //variable type determines what methods can be invoke
         vehicle.cheat();

         //type casting
        if (vehicle instanceof CheatingVehicle){

        }
        ((CheatingVehicle) vehicle).cheat();

        CheatingVehicle cheatingVehicle = new CheatingVehicle();
        CheatingVehicle resetResult = cheatingVehicle.reset();
        resetResult.cheat();*/

/*        Vehicle vehicle1 = new Vehicle();
        vehicle1.setTotalVehicleCount(1);

        Vehicle vehicle2  = new Vehicle();
        vehicle2.setTotalVehicleCount(4);

        System.out.println("Total count from vehicle1: " + vehicle1.getTotalVehicleCount());
        System.out.println("Total count from vehicle2: " + vehicle2.getTotalVehicleCount());
        System.out.println("Total count from vehicle class: "  + Vehicle.getTotalVehicleCount());

        Engine engine = new Engine();
        engine.manufacturer = "Renault";

        Car car = new Car(engine);
        car.setMake("Dacia");
        System.out.println(car.getMake());*


   /*     Car carReference = new Car();
        carReference.make = "Skoda";
        carReference.model = "Octavia";
        carReference.mileage = 7.5;
        carReference.fuelLevel = 60;
        carReference.color = "Green";
        carReference.maxSpeed = 240.0;


        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.color);
        System.out.println(carReference.maxSpeed);

        System.out.println(carReference.totalTraveledDistance);
        System.out.println(carReference.damaged);
        System.out.println(carReference.doorCount);

        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model = "CLK";
        car2.color = "Black";

        System.out.println(car2.make + " " + carReference.make);
        System.out.println("First car is: " + carReference.make + " " + "Second car is :" + car2.make);


        car2.make = "Audi";
        System.out.println("Updated name: " + car2.make);

        carReference.accelerate(110,1);
        car2.accelerate(160,1);

        System.out.println("Total traveled distance before repair: " + carReference.totalTraveledDistance);
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);
        System.out.println("Total traveled distance after repair: " + carReference.totalTraveledDistance);*/

    }
}
