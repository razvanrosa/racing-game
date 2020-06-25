package org.fasttrackit;

import org.fasttrackit.service.Game;

import java.util.*;

public class App {

    public static void main(String[] args) {

        //Game game = new Game();
        //game.start();

 /*       Map< String,String> descriptionTranslation = new HashMap<>();
        descriptionTranslation.put("en","Some description");
        descriptionTranslation.put("ro","O descriere");

        System.out.println(descriptionTranslation.size());

        for (Map.Entry<String,String> entry : descriptionTranslation.entrySet());
        System.out.println(entry.getKey() + ": " + entry.getValue());*/

    /*    Set<String> cities = new HashSet<>();
        cities.add("Cluj-Napoca");
        cities.add("Oradea");
        cities.add("London");
        cities.add("London");

        System.out.println("Number of unique cities: " + cities.size());

        Iterator<String> citiesIterator = cities.iterator();

        while (citiesIterator.hasNext()){
            System.out.println(citiesIterator.next());
        }

        do{
            System.out.println(citiesIterator.next());
        }while(citiesIterator.hasNext());*/

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
