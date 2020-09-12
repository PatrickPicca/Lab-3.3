package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner myScanner = new Scanner(System.in);
        int y1, y2;

        for (int n = 0; n <= 100; n+=10)
        {
            y1 = 100*n+10;
            y2 = 5*n*n+2;
            if (y1 > y2)
            {
                System.out.printf("y1 (" + y1 + ") > y2 (" + y2 + "). Does the result surprise you? ");
                String result = myScanner.nextLine();
            }
            else if (y1 < y2)
            {
                System.out.printf("y1 (" + y1 + ") < y2 (" + y2 + "). Does the result surprise you? ");
                String result = myScanner.nextLine();
            }
            else
            {
                System.out.printf("y1 (" + y1 + ") = y2 (" + y2 + "). Does the result surprise you? ");
                String result = myScanner.nextLine();
            }
        }

    }
}
