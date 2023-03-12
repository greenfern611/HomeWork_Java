package L4HW_Java_Tasks5;


import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        for (; ; ) {
            double num1;
            double num2;
            double ans = 0;
            char op;
            Scanner reader = new Scanner(System.in);
            System.out.print("\nEnter first number: ");
            num1 = reader.nextDouble();

            System.out.print("Enter second number: ");
            num2 = reader.nextDouble();
            //1-сумма чисел
            //2-среднее значение
            //3-сравнение
            System.out.print("Enter an operator (1, 2, 3): ");

            op = reader.next().charAt(0);
            switch (op) {
                case '1':
                    ans = num1 + num2;
                    System.out.print("Sum num1 + num2 = " + ans);
                    break;
                case '2':
                    ans = (num1 + num2) / 2;
                    System.out.print("Average value num1 and num2 = " + ans);
                    break;
                case '3':
                    if (num1 > num2) {
                        System.out.print("Number num1 > num2");
                    } else if (num1 < num2) {
                        System.out.print("Number num1 < num2");
                    } else if (num1 == num2) {
                        System.out.print("Number num1 == num2");
                    }
                    break;
                default:
                    System.out.printf("Error! Enter correct operator's number");
                    return;
            }

        }
    }
}