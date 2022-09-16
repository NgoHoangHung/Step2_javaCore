package Assignment06thUnit2_Unit5;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Assignment {
    public static void main(String[] args) {
        System.out.println("______________Bài2______________");
        assignment02("pqqqqqq");
        assignment02("sdfsd_sdfsdf_asdfsadfs_asdfsadf");

        System.out.println("\n______________Bài3______________");
        assignment03("sdfsd_sdfsdf_asdfsadfs_asdfsadf");
        assignment03("c");

        System.out.println("\n______________Bài4______________");
        assignment04("HUngdeptrai");

        System.out.println("\n______________Bài5______________");
        assignment05("HUngdeptrai");
        assignment05("5HUngdeptrai");
        assignment05("5");

    }

    public static void assignment02(String str){
        Pattern patterncheck = Pattern.compile("pq+");
        Matcher matcher = patterncheck.matcher(str);
        System.out.println("chuỗi nhập vào là "+ patterncheck.matcher(str).matches());
    }

    public static void assignment03(String str){
        Pattern patterncheck = Pattern.compile("[\\w]+_[\\w]*");
        Matcher matcher = patterncheck.matcher(str);
        System.out.println("chuỗi nhập vào là "+ patterncheck.matcher(str).matches());
    }
    public static void assignment04(String str){
        Pattern patterncheck = Pattern.compile("(\\w)+");
        Matcher matcher = patterncheck.matcher(str);
        System.out.println("chuỗi nhập vào là "+ patterncheck.matcher(str).matches());
    }
    public static void assignment05(String str){
        Pattern patterncheck = Pattern.compile("^5(\\w)*");
        Matcher matcher = patterncheck.matcher(str);
        System.out.println("chuỗi nhập vào là "+ patterncheck.matcher(str).matches());
    }
}
