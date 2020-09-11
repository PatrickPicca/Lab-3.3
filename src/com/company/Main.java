package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int y1, y2;

        for (int n = 0; n <= 100; n+=10)
        {
            y1 = 100*n+10;
            y2 = 5*n*n+2;
            if (y1 > y2)
            {
                System.out.printf("y1 (" + y1 + ") > y2 (" + y2 + "). Does the result surprise you?");
                System.out.println();
            }
            else if (y1 < y2)
            {
                System.out.printf("y1 (" + y1 + ") < y2 (" + y2 + "). Does the result surprise you?");
                System.out.println();
            }
            else
            {
                System.out.printf("y1 (" + y1 + ") = y2 (" + y2 + "). Does the result surprise you?");
                System.out.println();
            }
        }

    }
}

/**
 * DetectiveJill.java : Your job is to ask your AssistantJack and get the correct
 * answer in <= 20 tries.  RandomClue is ONE solution to the problem,
 * where a set of random numbers is generated every attempt until all three
 * random numbers match the solution from the AssistantJack object.
 *
 * This is a sample solution, a driver using random number implementation.
 * You can use this file as a guide to create your own SEPARATE driver for
 * your implementation that can solve it in <= 20 times consistently.
 *
 * @author Nery Chapeton-Lamas (material from Kevin Lewis)
 * @version 1.0
 *
 */

    /*
     * ALGORITHM:
     *
     * PROMPT "Which theory to test? (1, 2, 3[random]): "
     * READ answerSet
     * INSTANTIATE jack = new AssistantJack(answerSet)
     * DO
     *      weapon = random int between 1 and 6
     *      location = random int between 1 and 10
     *      murder = random int between 1 and 6
     *      solution = jack.checkAnswer(weapon, location, murder)
     * WHILE solution != 0
     *
     * OUTPUT "Total checks = " + jack.getTimesAsked()
     * IF jack.getTimesAsked() is greater than 20 THEN
     *      OUTPUT "FAILED"
     * ELSE
     *      OUTPUT "PASSED"
     * END IF
     */
