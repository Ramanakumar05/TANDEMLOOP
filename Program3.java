import java.util.Scanner;

public class Program3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        System.out.print("Output: ");

        int number = 1; // odd start 1

        for (int i = 1; i <= a; i++) {
            System.out.print(number);

            // Next odd
            number = number + 2;

            // prevents Last comma
            if (i < a) {
                System.out.print(", ");
            }
        }
    }
}
