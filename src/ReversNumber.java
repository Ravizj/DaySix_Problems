import java.util.Scanner;

public class ReversNumber {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scanner.nextInt();
        int reverse = 0, rem;
        while (num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num =num/ 10;
        }
        System.out.println ("Reversed Number: " + reverse);
    }
}
