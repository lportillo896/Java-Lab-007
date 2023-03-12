/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int sum = 0;
        int num = 0;

        System.out.println("Type a number to be added: Press 0 to see answer");

        int in = s.nextInt();

        for(sum = 0;sum < in;sum++){
            num = num+sum;
            if(in == 0){
                break;
            }
        }
        System.out.println("Number? "+in);
        System.out.println("Sum: "+(num + in));
    }

    public static void rangeSum() {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum;
        int last = 0;

        System.out.println("Enter your first number: ");
        num1 = s.nextInt();

        System.out.println("Enter your second number: ");
        num2 = s.nextInt();

        if (num1 > num2){
            num3 = num2;
            num4 = num1;
        }
        if (num1 < num2){
            num3 = num1;
            num4 = num2;
        }
        for(sum = num3; sum < num4;sum = sum + 1){
            last = last + sum;
        }

        System.out.println("Range start: "+num3);
        System.out.println("Range end: "+num4);
        System.out.println("Sum: "+ (last + num4));
    }

    public static void factorial() {
        System.out.println("Type a number to be factored: ");

        int in = s.nextInt();
        int factorial = 1;

        for (int n = 1; n <= in; n++){
            factorial *= n;
        }
        System.out.println("Factorial: "+factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
