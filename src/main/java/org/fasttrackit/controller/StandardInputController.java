package org.fasttrackit.controller;

import org.fasttrackit.controller.utils.ScannerUtil;

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
        return ScannerUtil.readNexSingleDouble();
    }
}
