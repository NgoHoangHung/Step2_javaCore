import java.util.*;

public class Unit1_Collection_Hashset {
    public static void main(String[] args) {
        HashSet<String> setColor1 = new HashSet<String>();
        setColor1.add("Red");
        setColor1.add("White");
        setColor1.add("Pink");
        setColor1.add("Yellow");
        setColor1.add("Black");
        setColor1.add("Green");

        HashSet<String> setColor2 = new HashSet<String>();
        setColor2.add("Red");
        setColor2.add("Pink");
        setColor2.add("Green");
        System.out.println("__________________unit1__________________");
        unit1_RepeatAndPrint(setColor1);
        unit1_RepeatAndPrint(setColor2);

        System.out.println("__________________unit2__________________");
        unit2_SummaryHashSet(setColor1);
        unit2_SummaryHashSet(setColor2);

        System.out.println("__________________unit3__________________");
        unit3_ClearElement(setColor1);
        System.out.println();
        unit3_ClearElement(setColor2);

        System.out.println("__________________unit4__________________");
        System.out.println("Đại ca: Hash Set 1 có rỗng không?\nTiểu Đệ:" + unit4_IsEmpty(setColor1));
        System.out.println("Đại ca: Hash Set 2 có rỗng không?\nTiểu Đệ:" + unit4_IsEmpty(setColor2));

        System.out.println("__________________unit5__________________");
        System.out.println("Ta sẽ tiến hành khởi tạo lại HashSet đã có trước đấy");
        setColor1.add("Red");
        setColor1.add("White");
        setColor1.add("Pink");
        setColor1.add("Yellow");
        setColor1.add("Black");
        setColor1.add("Green");

        setColor2.add("White");
        setColor2.add("Red");
        setColor2.add("Pink");
        setColor2.add("Green");

        unit5_Copy(setColor1);
        System.out.println("___________________________Unit6___________________________");
        unit6_ConvertHashSetToArray(setColor1);
        System.out.println("\n___________________________Unit7___________________________");
        unit7_ConvertHastSetToTreeSet(setColor1);
        System.out.println("\n___________________________Unit8___________________________");
        System.out.println("ConvertHashSetToArrayList");
        unit8_ConvertHashSetToArrayList(setColor1);

        System.out.println("\n___________________________Unit9___________________________");
        System.out.println("Đại ca: hai phần tử đầu chỗ này giống nhau không em?\n" + unit9_CompareIndexWithIndex(setColor1, setColor2));
        System.out.println("\n___________________________Unit10___________________________");
        uni10_CompareElementAndHoldTheSameElement(setColor1,setColor2);
    }

    public static void unit1_RepeatAndPrint(HashSet setObj) {
        Iterator<String> iteratorTmp = setObj.iterator();//trả về đối tượng iteratỏ để quản lí danh sách ms đc tạo
        System.out.print("[");
        while (iteratorTmp.hasNext()) {
            System.out.print((String) iteratorTmp.next() + " ");
        }
        System.out.println("]");
    }

    public static void unit2_SummaryHashSet(HashSet hashSetObj) {
        System.out.println("Tổng só phần tử của Set là: " + hashSetObj.size());
    }

    public static void unit3_ClearElement(HashSet hashSetObj) {
        Iterator iteratorTmp = hashSetObj.iterator();
        System.out.println("Danh sách các phần tử khi chưa xóa: ");
        System.out.print("[ ");
        while (iteratorTmp.hasNext()) {
            System.out.print(iteratorTmp.next() + " ");
        }
        System.out.println("]");
        hashSetObj.clear();
        System.out.println("Sau khi xoa");
        if (hashSetObj.size() == 0) {
            System.out.println("Delete Success!");
        }
    }

    public static String unit4_IsEmpty(HashSet hashSetObj) {
        if (hashSetObj.size() == 0)
            return "Rỗng anh ơi";
        return "Rỗng đâu";
    }

    public static void unit5_Copy(HashSet hashSetObj) {
//       HashSet<String> clone = (HashSet<String>);
//        hashSetObj.clone();
        HashSet<String> newSet = (HashSet<String>) hashSetObj.clone();
        newSet.add("ZZZZ");
        hashSetObj.add("iii");

        //        newSet.map = (HashMap<E, Object>) map.clone();
        for (Object o : newSet) {
            System.out.print(o+ " ");
        }
        System.out.println();
        System.out.println(hashSetObj);

    }

    public static void unit6_ConvertHashSetToArray(HashSet hashSetObj) {
        String[] array = new String[hashSetObj.size()];
        List<String> listObj = new ArrayList<String>();
        listObj.addAll(hashSetObj);

        for (int i = 0; i < array.length; i++) {
            array[i] = listObj.get(i);
            System.out.print(array[i] + " ");
        }

    }

    public static void unit7_ConvertHastSetToTreeSet(HashSet hashSetObj) {
        TreeSet<String> treeSetObj = new TreeSet<String>();
        treeSetObj.addAll(hashSetObj);
        System.out.println("");
        for (String s : treeSetObj) {
            System.out.print(s + " ");
        }
    }

    public static void unit8_ConvertHashSetToArrayList(HashSet hashSetObj) {

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.addAll(hashSetObj);
        for (String s : arrayList) {
            System.out.print(s + " ");
        }

    }

    public static String unit9_CompareIndexWithIndex(HashSet hashSetObj1, HashSet hashSetObj2) {
        Object[] hashSetTmp1 = hashSetObj1.toArray();
        Object[] hashSetTmp2 = hashSetObj2.toArray();
        if (hashSetTmp1[0].equals(hashSetTmp2[0])) {
            return "Tiểu đệ: Giống quá anh ưiiiiiiiiiiiiii";
        }
        return "Tiểu đệ: sai bét nhè anh ợ -_-";
    }

    public static void uni10_CompareElementAndHoldTheSameElement(HashSet hashSetObj1, HashSet hashSetObj2) {
        Object[] hashSetTmp1 = hashSetObj1.toArray();
        Object[] hashSetTmp2 = hashSetObj2.toArray();
        HashSet<String> sameElementHashSet = new HashSet<String>();
        for (int i = 0; i < hashSetTmp2.length; i++) {
            for (int j = 0; j < hashSetTmp2.length; j++) {
                if(hashSetTmp1[i].equals(hashSetTmp2[j]))
                    sameElementHashSet.add((String) hashSetTmp1[i]);
            }
        }
        Iterator<String> iterator = sameElementHashSet.iterator();
        System.out.println("Các phần tử trùng nhau: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

    }
}

//tham chiếu tham trị
//tìm hiểu shalow copy và deep copy
/*
tính đa hình được thể hiện qua chữ kí của phương thức tức là giá trị trả về của hàm và tham số truyền vào phương
thức là giống hệt nhau
 */
