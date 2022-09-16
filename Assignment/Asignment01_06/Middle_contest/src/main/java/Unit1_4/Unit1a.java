package Unit1_4;

public class Unit1a {
    public static void main(String[] args) {
        System.out.println("________Unit1___________");
        System.out.println(Unit1(2));
        System.out.println(Unit1(3));

        System.out.println("_______Unit2________");
        System.out.println(Unit2("ueoai"));
        System.out.println(Unit2("Java"));

        System.out.println("_______Unit3_______");
        System.out.println(Unit3("0362997999"));
        System.out.println(Unit3("1234567890"));

        System.out.println("__________________Unit4_______________");
        int[] arrInt={-1,1,-2,3,-4,5,-6,6};
        int[] arrInt1={1,2,3,4,5,6,7,8};
        System.out.println(Unit4(arrInt));
        System.out.println(Unit4(arrInt1));
    }
    public static  boolean Unit1(int n){
        if(n%2==0)
            return true;
        return false;
    }

    public static boolean Unit2(String string){
        return(string.matches("[ueoia]+"));
    }

    public static boolean Unit3(String phoneNumber){
    return phoneNumber.matches("^[0][1-9]{9}");
    }

    public static boolean Unit4(int[] arrayInt){
        int plus = 0;
        int tmp = 0;
        int plus1 = 0;
        int tmp1 = 0;

        for(int i=0 ; i<arrayInt.length; i+=2){
            plus+=arrayInt[i];
            tmp+=Math.abs(arrayInt[i]);
        }
        for(int i=1 ; i<arrayInt.length; i+=2){
            plus1+=arrayInt[i];
            tmp1+=Math.abs(arrayInt[i]);
        }
        if(Math.abs(plus)==Math.abs(tmp)==true&&Math.abs(plus1)==Math.abs(tmp1)==true)
            return true;
        else return false;
    }
}
