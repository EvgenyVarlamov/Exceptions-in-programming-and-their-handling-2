package geekbrains;

import java.util.Scanner;

public class Homework4 {
    /*
    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую
    строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Data: '" + inputData() + "'");
    }

    public static String inputData() throws Exception {
        String value;
        System.out.println("Input data: ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        checkEmptyValue(value);
        scanner.close();
        return value;
    }

    private static void checkEmptyValue(String value) throws Exception {
        if (value.isEmpty()) {
            throw new Exception("Empty lines are not allowed!");
        }
    }
}
