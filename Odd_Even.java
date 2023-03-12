import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        for (; ; ) {
            double num;
            double ans = 0;
            char op;
            Scanner n = new Scanner(System.in);
            System.out.print("\nEnter integer number: ");
            num = n.nextDouble();

            if ((num % 2) == 0) {
                System.out.print("Inputing number " + num + " is EVEN");
            } else {
                System.out.print("Inputing number " + num + " is ODD");
            }
            System.out.println();
        }
    }
}