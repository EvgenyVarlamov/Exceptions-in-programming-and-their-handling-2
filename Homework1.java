package geekbrains;

import java.util.Scanner;

public class Homework1 {
    /*
    Реализуйте метод, который запрашивает у пользователя ввод дробного
    числа (типа float), и возвращает введенное значение. Ввод текста
    вместо числа не должно приводить к падению приложения, вместо этого,
    необходимо повторно запросить у пользователя ввод данных.
     */
    public static void main(String[] args) {
        System.out.printf("Successful! value = %f",inputFloatNumber());
    }

    public static float inputFloatNumber() {
        boolean flag = true;
        float value = 0f;
        while (flag) {
            System.out.println("Input float number: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextFloat()) {
                value = scanner.nextFloat();
                flag = !flag;
                scanner.close();
            }else {
                System.out.println("Please try again.");
            }
        }
        return value;
    }
}
