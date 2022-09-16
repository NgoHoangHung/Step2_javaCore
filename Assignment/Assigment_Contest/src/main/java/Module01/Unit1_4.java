package Module01;

public class Unit1_4 {
    public static void main(String[] args) {
        System.out.println("_____________Unit1_____________");
        System.out.println(Unit1(86420));
        int[] input = {1, 4, 17, 7, 25, 3, 100};
        Unit1A(input);
        System.out.println();


        System.out.println("______________Unit3_____________");
        System.out.println(Unit3("0399390500"));
        System.out.println(Unit3("039939050fsadfsad0"));
        System.out.println(Unit3("03993534134252390500"));
        System.out.println(Unit3("039939"));

        System.out.println("______________Unit4_____________");
        int[] arrInput = {1, -2, 5, -4, 3, -6};
        int[] arrInput1 = {2,3,2,1, -2, 5, -4, 3, -6};
        System.out.println(Unit4(arrInput));
        System.out.println(Unit4(arrInput1));
    }

    public static boolean Unit1(int number) {
        while (number > 1) {
            if (number % 2 == 0) {
                number /= 10;
                continue;
            } else
                return false;
        }
        return true;
    }

    public static void Unit1A(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i] / array.length;
        }
        System.out.println("Số trung bình là: " + (int) average);
        System.out.print("Các số lớn hơn trung bình: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > (int) average) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static boolean Unit2(String str) {
        return str.matches("[ueoai]+");
    }

    public static boolean Unit3(String str) {
        char[] charTmp = str.toCharArray();
        if (str.length() !=10)
            return false;
        if ((int) charTmp[0] == 48)
            for (int i = 1; i < charTmp.length; i++) {
                if ((int) charTmp[i] >= 48 && (int) charTmp[i] <= 57) {
                    continue;
                } else return false;
            }
        else return false;
        return true;
    }

    public static boolean Unit4(int[] arrayInt){
        for (int i = 1; i < arrayInt.length; i++) {
            if(arrayInt[i]*arrayInt[i-1]<0){
                continue;
            }
            else
                return false;
        }
        return true;
    }
}