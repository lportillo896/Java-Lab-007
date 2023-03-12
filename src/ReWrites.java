/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        for(count =0; !(l = s.nextLine()).toUpperCase().equals("Q");count++) {
            try {
                sum += Integer.parseInt(l);
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Average is: %f%n", (sum/count));
    }
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x != 0) {
            try {
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}