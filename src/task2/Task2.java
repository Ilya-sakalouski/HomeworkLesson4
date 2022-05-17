package src.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter mass size (>0): ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] mass = new int[size];

        for (int i = 0; i < mass.length; i++)
            mass[i] = (int) (Math.random() * size);
        for (int i : mass)
            System.out.print(i + " "); // несортированный

        Arrays.sort(mass);
        System.out.println("\n");

        for (int i : mass)
            System.out.print(i + " "); // сортированный
        System.out.println("\n");

        int min = mass[0];
        System.out.println("Min value is: " + min);
        int max = mass[mass.length - 1];
        System.out.println("Max value is: " + max);

        double average = 0;
        for (int i = 0; i < mass.length; i++) {
            average += mass[i];
        }

        average /= mass.length;
        System.out.println("Average value is: " + average);
    }
}
