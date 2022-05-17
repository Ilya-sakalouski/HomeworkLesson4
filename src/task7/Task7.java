package src.task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 8, 14, 6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
    }
        public static void bubbleSort(int[] arr){

            for (int i = arr.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {

                    if (arr[j] > arr[j + 1]) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
