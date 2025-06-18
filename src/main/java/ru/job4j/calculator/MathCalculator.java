package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divAndDif(double first, double second) {
        return div(first, second)
                + dif(first, second);
    }

    public static double allSum(double first, double second) {
        return div(first, second)
                + dif(first, second)
                + sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета2 равен: " + divAndDif(10, 20));
        System.out.println("Результат расчета2 равен: " + allSum(10, 20));
    }

}