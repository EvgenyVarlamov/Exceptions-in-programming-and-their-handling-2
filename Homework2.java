package geekbrains;

import java.util.Scanner;

public class Homework2 {
    /*
    Если необходимо, исправьте данный код
    (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
     */
    public static void main(String[] args) {
        int[] intArray = new int[inputNumber()];
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
     public static int inputNumber(){
        boolean flag = true;
        int number = 0;
        while (flag) {
            System.out.println("Input number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                scanner.close();
                flag = !flag;
            }else {
                System.out.println("Please try again.");
            }
        }
        return number;
    }
}
