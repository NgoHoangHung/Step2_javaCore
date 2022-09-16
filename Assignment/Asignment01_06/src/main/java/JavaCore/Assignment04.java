package JavaCore;

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
//        unit00();
//        unit01_Average();
//        unit02_insertElementIntoArray();
    unit04_checkElement();
    }

    public static void unit00() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = sc.nextInt();
        System.out.println("Nhập phần tử: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Array[%d]= ", i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d] = %d", i, array[i]);
            System.out.println();
        }
        System.out.println("Biến đổi các phần tử chẵn sang lẻ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                array[i] += 1;
            }
            System.out.println(array[i]);
        }

    }

    public static void unit01_Average() {
        double average = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử");
        int n = sc.nextInt();
        System.out.println("Nhập phần tử: ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Array[%d]= ", i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("array[%d] = %d", i, array[i]);
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            average += (double) array[i] / n;
        }
        System.out.println(average);
    }

    public static void unit02_insertElementIntoArray() {
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int n = my_array.length + 1;
        int[] newArray = new int[n];
        for (int i = 0; i < 2; i++) {
            newArray[i] = my_array[i];
        }
        newArray[2] = 5;

        for (int i = 3; i < n; i++) {
            newArray[i] = my_array[i - 1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void unit04_checkElement() {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL" };
        String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };
        int lengthArray1 = array1.length;
        int lengthArray2 = array2.length;
        for (int i = 0; i < lengthArray1; i++){
            for (int j = 0; j<lengthArray2;j++){
                if(array1[i].compareTo(array2[j])==0)
                    System.out.println(array1[i]);
            }
        }
    }
}
