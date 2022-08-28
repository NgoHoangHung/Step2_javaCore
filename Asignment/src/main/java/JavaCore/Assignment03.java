package JavaCore;
import java.util.Scanner;


public class Assignment03 {
    public static void main(String[] args) {

        System.out.println("input" + "welcome");
        System.out.println("output: " +unit01("welcome"));
        System.out.println("_______________________Bài1____________________________");

        System.out.println("output: " + unit02("techmaster"));
        System.out.println("_______________________Bài2____________________________");
//        System.out.println("_________________________________________________________");
//
        System.out.println(unit03("gibblegabbler"));
        System.out.println("_______________________Bài3____________________________");
//        System.out.println("_________________________________________________________");
//
        System.out.println(unit04("test sstring"));
        System.out.println("_______________________Bài4____________________________");
//        System.out.println("_________________________________________________________");
//
        unit05("Reverse words in a given string");
        System.out.println("_______________________Bài5____________________________");
//        System.out.println("_________________________________________________________");
    }

    public static String unit01(String s){
        String stringTmp="";
        for(int i = 0; i<s.length(); i++){
            stringTmp+=s.charAt(i);
            stringTmp+=s.charAt(i);
        }
        return stringTmp;
    }

    public static String unit02(String s){
        String resul="";
        int n = s.length();
        //flag
        boolean[] flag = new boolean[n];
        for (int i=0;i<n;i++){
            flag[i] = true;
        }

        for(int i = 0; i<n;i++){
            for (int j = i+1;j<n;j++){
                if (s.charAt(i) == s.charAt(j) && flag[i] &&flag[j]) {
                    flag[j]=false;
                }
            }
        }
        for(int i = 0; i<n;i++){
            if(flag[i]){
            resul+=s.charAt(i);
            }
        }
        return resul;
    }


    public static String unit03(String s){
        String output="";
        int n = s.length();
        int[] count = new int[n];

        for(int i = 0; i<n;i++){
            for(int j = i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    count[i]++;
                    count[j]++;
                }
            }
        }
        for (int i = 0; i<n;i++){
            if(count[i]==0)
                output+= s.charAt(i) + " ";
        }
        return output;
    }

    public static String unit04(String s){
        int n = s.length();
        int[] count = new int[n];
        for(int i = 0; i<n;i++){
            for(int j =i+1;j<n;j++){
            if(s.charAt(i) == s.charAt(j)){
                count[i]++;
            }
            }
        }
        String output="";
        int countTmp=count[0];
        int indexTmp = 0;
        for(int i = 1; i<n;i++){
            if(countTmp < count[i]){
                countTmp = count[i];
                indexTmp=i;
            }
        }
        output+=s.charAt(indexTmp);
        return output;
    }


    public static void unit05(String s){
        int n = s.length();
        System.out.println(s);
        String stringTmp1 = "";
        String output = "";
        int indexTmp = 0;
        for(int i = 0;i<n;i++){
            if (s.charAt(i) == ' '){
                stringTmp1 = s.substring(indexTmp,i);
                output = stringTmp1.concat(" ").concat(output);
                indexTmp = i+1;
            }
        }
        output= s.substring(indexTmp).concat(" ".concat(output));
        System.out.println(output);
//        int j;
//        for(int i =n-1;i>=0;i--){
//            if (s.charAt(i)==' ' || i == 0) {
//                if (i == 0) j = i;
//                else j = i + 1;
//                while (j < n && s.charAt(j) != ' ') {
//                    System.out.print(s.charAt(j));
//                }
//            }
//
//        }
    }
}















