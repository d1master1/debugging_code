package org.example;

public class RecursionExample {
    public static void infiniteRecursion(int n) {
        System.out.println("n = " + n);
        infiniteRecursion(n + 1); // Ошибка! Нет условия выхода
    }

    public static void main(String[] args) {
        infiniteRecursion(1);
    }
}