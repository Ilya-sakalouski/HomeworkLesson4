package src.task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        String[] names = new String[]{"Ilya", "Anna","Yulia", "Kate", "Maria"};

        Arrays.sort(names);
        for (String name : names) {
            System.out.print(name + "  ");
        }
    }
}
