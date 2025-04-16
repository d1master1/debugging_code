package org.example;

public class RecursionExample {
    public static void infiniteRecursion(int n) {
        if (n > 1000) return; // Остановка после 1000 вызовов
        System.out.println("n = " + n);
        infiniteRecursion(n + 1);
    }

    public static void main(String[] args) {
        infiniteRecursion(1);
    }
}