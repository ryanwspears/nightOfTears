package com.example.nightoftears;

public class Story {

    public int currentEventNumber = 0;
    public String story;

    public String Y = "Y";
    public String N = "N";


    public String nextEvent(String input) {

        if (currentEventNumber == 0) {

            story = ("Night of Tears\n" + "Build: Alpha 1.4\n" + "Leviathan Studios\n" + "Play the game?");

        }

        if (currentEventNumber == 0) {

            if (input.equalsIgnoreCase(Y)) {

                story = "You are walking along a dark, beaten path. It's cold. You left your coat at home because you thought you were going to be back home quickly. You never expected to get lost. As you're walking, you come across a split in the path. Your instincts are telling you to turn right. Do you go right?";
                currentEventNumber = currentEventNumber + 1;

            }
            if (input.equalsIgnoreCase(N)) {

                story = ("You suck...\n" + "You wouldn't be here unless you wanted to play.\n" + "Type Y to start the game.");

            }

        }

        else if (currentEventNumber == 1) {

            if (input.equalsIgnoreCase(Y)) {

                story = "You trust your instincts and go right. About twenty minutes down the path, you come across an old cabin. You figure you might as well stay the night since it's late. Do you decide to sleep in the cabin?";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "Ignoring all natural instincts, you go left. About ten minutes down the path, a bobcat lunges out at you. Your fear sets in and you turn to run. Just as you turn around, you slip and fall in the mud next to the stream. On your way down you smash your head against a large rock in the stream and die. You suck...";
                currentEventNumber = currentEventNumber - 1;

            }

        }

        else if (currentEventNumber == 2) {

            if (input.equalsIgnoreCase(Y)){

                story = "You decided to sleep in the cabin for the night. You step on to the front porch of the cabin and see that the cabin is pretty much empty. You open the door and step inside. As soon as you open the door a foul stank fills your nostrils. You cover your nose with your shirt trying not to retch. You look over in the corner and see what appears to be a person. Do you investigate?";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "You decided to not sleep in the cabin and instead you curl up under a tree outside. You eventually get too cold and freeze to death. You suck...";
                currentEventNumber = currentEventNumber - 2;

            }

        }

        else if (currentEventNumber == 3) {

            if (input.equalsIgnoreCase(Y)){

                story = "You creep over to the person in the corner and give them a little push with the tip of your shoe. You assume that the person is dead. You turn to walk away, but something latches on to your leg. You look down to see the person on the floor staring up into your eyes. He thrusts his jaw towards your leg and bites deeply into your flesh. You are eaten by a cannibal and die. You suck...";
                currentEventNumber = currentEventNumber - 3;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "You decided not to investigate the person. Instead you turn to explore the cabin. After about thirty minutes of looking around, you finally decide that you are ready to go to sleep. You look around for a bed and see two bedrooms. One of the doors has a stop sign hanging on it. The other door has a cross hanging on it. Do you go into the door with the cross?";
                currentEventNumber = currentEventNumber + 1;

            }

        }

        else if (currentEventNumber == 4) {

            if (input.equalsIgnoreCase(Y)){

                story = "You open the door with the cross on it and enter inside. You lie down onto the bed and hear a clicking sound from below the bed. Before you can react, you are encased in a trap! An iron maiden closes around you and you are impaled and die. You suck...";
                currentEventNumber = currentEventNumber - 4;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "You decide to sleep in the room with the stop sign on the door. When you enter into the room, it kind of reminds you of your own room back home. After sitting on the bed, you hear sobbing coming from the closet. Do you open the closet?";
                currentEventNumber = currentEventNumber + 1;

            }

        }

        else if (currentEventNumber == 5) {

            if (input.equalsIgnoreCase(Y)){

                story = "You open the closet door and a small girl lunges out at you with a knife. She runs the knife through your stomach. You bleed out and die. You suck...";
                currentEventNumber = currentEventNumber - 5;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "You don't open the closet, but instead call out to whoever is in the closet and tell them that it's going to be okay. You tell them that no one is going to hurt them. The crying stop and a small girl walk out of the closet. You ask her what's wrong and she tells you that her brother is being mean to her. She asks you if you want to help her get revenge on her brother. Do you agree to help her?";
                currentEventNumber = currentEventNumber + 1;

            }

        }

        else if (currentEventNumber == 6) {

            if (input.equalsIgnoreCase(Y)){

                story = "You tell her that you will help her. She said that her brother is a psycho, and that he's the reason that her mommy and daddy aren't around anymore. She said that if you go to her parents room, then you can get one of the weapons that she's collected. She tells you to choose wisely. You are led by the girl to her parent room. On the bed is a baseball bat and a gun. Do you choose the gun?";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "You tell her no. She gets angry and lashes out at you with the knife. You suffer many stabs and cuts. You fall to the floor and die. You suck...";
                currentEventNumber = currentEventNumber - 6;

            }

        }

        else if (currentEventNumber == 7) {

            if (input.equalsIgnoreCase(Y)){

                story = "This is the end of the first chapter. Keep on the lookout for more chapters. Clear the text below, and click NEXT to return to the title screen.";
                currentEventNumber = currentEventNumber - 7;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "This is the end of the first chapter. Keep on the lookout for more chapters. Clear the text below, and click NEXT to return to the title screen.";
                currentEventNumber = currentEventNumber - 7;

            }

        }
        /*

        // TODO everything below this line is for future updates.

        else if (currentEventNumber == 8) {

            if (input.equalsIgnoreCase(Y)){

                story = "";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "";
                currentEventNumber = currentEventNumber - 8;

            }

        }

        else if (currentEventNumber == 8) {

            if (input.equalsIgnoreCase(Y)){

                story = "";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "";
                currentEventNumber = currentEventNumber - 8;

            }

        }

        else if (currentEventNumber == 8) {

            if (input.equalsIgnoreCase(Y)){

                story = "";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "";
                currentEventNumber = currentEventNumber - 8;

            }

        }

        else if (currentEventNumber == 8) {

            if (input.equalsIgnoreCase(Y)){

                story = "";
                currentEventNumber = currentEventNumber + 1;

            }

            if (input.equalsIgnoreCase(N)) {

                story = "";
                currentEventNumber = currentEventNumber - 8;

            }

        }

        */

        return story;
    }

}



