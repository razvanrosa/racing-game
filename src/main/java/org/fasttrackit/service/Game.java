package org.fasttrackit.service;

import org.fasttrackit.controller.StandardInputController;
import org.fasttrackit.domain.Track;

public class Game {

    private Track[] tracks = new Track[3];

    private StandardInputController controller = new StandardInputController();

    public void start() {

        System.out.println("Welcome to the Racing Game!");

        int playerCount =controller.getPlayerCountFromUser();
        System.out.println("Player count : " + playerCount);

        initializeTracks();
        displayTracks();

    }

    private void initializeTracks() {
        Track track1 = new Track();
        track1.setName("Street Circuit");
        track1.setLength(300);

        tracks[0] = track1;

        Track track2 = new Track();
        track2.setName("Forest Circuit");
        track2.setLength(100);

        tracks[1] = track2;
    }

    private void displayTracks() {

        System.out.println("Available tracks: ");
        // classic for loop
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] != null) {
                System.out.println(i + 1 + ". " + tracks[i].getName() + " : " + tracks[i].getLength());
            }

        }
    }
}
