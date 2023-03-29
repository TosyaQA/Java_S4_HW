package Seminar_4;

import java.util.Scanner;
import java.util.Stack;

public class Task3 {
    private Stack<Double> history = new Stack<>();

    public void startCalculator() {
        Scanner scanner = new Scanner(System.in, "Cp866");

        System.out.print("Введите число: ");
        double result = scanner.nextDouble();
        scanner.nextLine();
        history.push(result);

        while (true) {
            System.out.print("Введите операцию (+, -, *, /) или Отмена: ");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("Отмена")) {
                if (!history.isEmpty()) {
                    history.pop();
                    if (!history.isEmpty()) result = history.peek();
                    System.out.println("Последняя операция отменена.");
                    System.out.println("Текущий результат: " + result);
                } else {
                    System.out.println("История операций пуста!");
                }
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                System.out.print("Введите число: ");
                double num = scanner.nextDouble();
                scanner.nextLine();

                switch (operation) {
                    case "+":
                        result += num;
                        break;
                    case "-":
                        result -= num;
                        break;
                    case "*":
                        result *= num;
                        break;
                    case "/":
                        result /= num;
                        break;
                }

                System.out.println("Результат: " + result);
                history.push(result);
            } else {
                System.out.println("Неверная операция!");
            }
        }
    }
}