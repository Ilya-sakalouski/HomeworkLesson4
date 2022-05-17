package src.task0;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void answer () {
        int[] mass = {1, 3, 5, 7, 9};
        System.out.println("Enter value");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        for (int v:
             mass) {
            if (v == value)System.out.println("true");
            else System.out.println("false");
        }
    }

        public static void main (String[]args){
            Task0 task0 = new Task0();
            answer();
        }
    }