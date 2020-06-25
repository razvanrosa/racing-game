package org.fasttrackit.controller;

import java.util.Scanner;

public class StandardInputController {

    public int getPlayerCountFromUser() {
        System.out.println("Please enter number of players: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public int getTrackNumberFromUser() {
        System.out.println("Please select track: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}
