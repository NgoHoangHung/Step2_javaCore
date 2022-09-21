//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.ListIterator;
//
//public class Unit1_listInJava {
//    public static void main(String[] args) {
//        Example1();
//        System.out.println("___________________________\n");
//        Example2();
//    }
//    //convert an array to a List
//    public static void Example1(){
//        String[] array = {"Java","C++","Python","PHP"};
//        List<String> list = Arrays.asList(array);
//        for (String s : list) {
//            System.out.println(s);
//        }
//    }
//
//    public static void Example2(){
//        List<String> list = new ArrayList<String>();
//        list.add("Java");
//        list.add("PHP");
//        list.add("C++");
//        list.add("C#");
//        list.add(1,"Python");
//        System.out.println("Element of index 2: " +list.get(2));
//
//        ListIterator <String> itr = list.listIterator();
//        while(itr.hasNext()){
//            System.out.print("\t" + itr.next());
//        }
//        System.out.println();
//        while(itr.hasPrevious()){
//            System.out.print("\t" + itr.previous());
//        }
//    }
//}
