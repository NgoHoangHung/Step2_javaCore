import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();

    public static void main(String[] args) {
        hash_map1.put(1, "Red");
        hash_map1.put(2, "Green");
        hash_map1.put(3, "Black");
        hash_map1.put(4, "White");
        hash_map1.put(5, "Blue");
        System.out.println("1________________________________________________________");
        unit1(hash_map1);
        System.out.println("2________________________________________________________");
        unit2();
        System.out.println("3________________________________________________________");
        unit3();
        System.out.println("4________________________________________________________");
        unit4();
        System.out.println("5________________________________________________________");
        unit5(hash_map1);
        System.out.println("6________________________________________________________");
        unit1(unit6(hash_map1));
        System.out.println("7________________________________________________________");
        unit7(hash_map1, 3);
        System.out.println("8________________________________________________________");
        unit8(hash_map1);
        System.out.println("9________________________________________________________");
        unit9(hash_map1, 3);
        System.out.println("10________________________________________________________");
        unit10(hash_map1);
        System.out.println("11________________________________________________________");
        unit11(hash_map1);

    }

    public static void unit1(Map hashmap) {
//        for (Map.Entry <Integer,String> entry : hash_map1.entrySet()) {
//            System.out.println(entry.getKey() + " - " + entry.getValue() );
//        }

        Iterator itr = hashmap.entrySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void unit2() {
        System.out.println("Chuỗi có " + hash_map1.entrySet().size() + " phần tử");
    }

    public static void unit3() {
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        for (Map.Entry<Integer, String> integerStringEntry : hash_map1.entrySet()) {
            hash_map2.put(integerStringEntry.getKey(), integerStringEntry.getValue());
        }
        unit1(hash_map2);
    }

    public static void unit4() {
        hash_map1.remove(2);
        unit1(hash_map1);
    }

    public static void unit5(Map hashmap) {
        if (hashmap.isEmpty()) {
            System.out.println("Chuỗi rỗng");
        } else
            System.out.println("Chuỗi không rỗng");
    }

    public static Map<Integer, String> unit6(Map hashmap) {
        return (Map<Integer, String>) hash_map1.clone();
    }

    public static void unit7(Map<Integer, String> hashmap, int key) {
        if (hashmap.containsKey(key)) {
            System.out.println("có chứa key: " + key);
        } else
            System.out.println("Không chứa key");
    }

    public static void unit8(Map<Integer, String> hashmap) {
        Iterator iter = hashmap.values().iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void unit9(Map<Integer, String> hashmap, int key) {
        for (Map.Entry<Integer, String> integerStringEntry : hashmap.entrySet()) {
            if (integerStringEntry.getKey() == key)
                System.out.println(integerStringEntry.getKey() + " - " + integerStringEntry.getValue());
        }

    }

    public static void unit10(Map<Integer, String> hashmap) {
        for (Map.Entry<Integer, String> integerStringEntry : hashmap.entrySet()) {
            System.out.println(integerStringEntry.getKey());
        }
    }

    public static void unit11(Map<Integer, String> hashmap) {
        for (Map.Entry<Integer, String> integerStringEntry : hashmap.entrySet()) {
            System.out.println(integerStringEntry.getValue());
        }
    }
}
