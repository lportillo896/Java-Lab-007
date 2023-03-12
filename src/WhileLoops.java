/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;
        int odd = 0;
        int count = 0;

        while(true){
            System.out.println("Enter some numbers to be counted: Press 0 to see the count.");
            int n = s.nextInt();
            count = n;
            if(count == 0){
                System.out.println("Even Numbers: "+even+" Odd Numbers: "+odd);
                return;
            }
            if (n % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
    }

    public static void mean() {
        int in = 0;
        int total = 0;

        while(true){
            System.out.println("Input a number to be calculated: Press 0 to see the answer.");
            int user = s.nextInt();
            if(user == 0){
                break;
            }
            if ((user > 0) && (user != 0)){
                in = in + user;
                total = total + 1;
            }
            if (user < 0){
                continue;
            }
        }
        int avg = in / total;
        System.out.println("Mean: "+avg);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
