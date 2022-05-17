package src.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = {7,1,6,76,2,87,4};
        int[] newArr = null;

        System.out.println("Enter your value: ");
        Scanner scanner = new Scanner(System.in);

        int deletedElement = scanner.nextInt();

        System.out.println("Original Array is: "+ Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == deletedElement){
                newArr = new int[arr.length - 1];
                for(int index = 0; index < i; index++){
                    newArr[index] = arr[index];
                }
                for(int j = i; j < arr.length - 1; j++){
                    newArr[j] = arr[j+1];
                }break;
            }
        }
        System.out.println("New Array after deleting element = "+deletedElement+" and shifting: "+ Arrays.toString(newArr));
    }
}
