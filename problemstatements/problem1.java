
import java.util.*;

public class problem1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.print("This is Good");

            } else if (marks >= 60 && marks <= 89) {
                System.out.print("This is also Good");

            } else if (marks >= 0 && marks <= 60) {
                System.out.print("This is Good as well");

            } else {
                System.out.print("Invalid");
            }

            System.out.print("If the user enters 1 then enter 0 stopped");
            input = sc.nextInt();

        } while (input == 1);
    }

}
