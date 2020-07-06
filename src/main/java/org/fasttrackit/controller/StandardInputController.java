package org.fasttrackit.controller;

import org.fasttrackit.controller.utils.ScannerUtil;

import java.util.InputMismatchException;

public class StandardInputController {

    public int getPlayerCountFromUser() {
        System.out.println("Please enter number of players: ");
        return ScannerUtil.readNexSingleInt();
    }

    public int getTrackNumberFromUser() {
        System.out.println("Please select track: ");
        return ScannerUtil.readNexSingleInt();
    }

    public String getVehicleMakeFromUser() {
        System.out.println("Please enter vehicle make: ");
        return ScannerUtil.SCANNER.nextLine();
    }

    public double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed: ");
        try {
            return ScannerUtil.readNexSingleDouble();
        } catch (InputMismatchException e) {
            System.out.println("You have entered an invalid value. Please try again.");

            //recursion
            return getAccelerationSpeedFromUser();
        }
    }
}
