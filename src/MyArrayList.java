import java.util.*;


public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Katy");
        list2.add("Adele");
        list2.add("Madonna");
        list2.add("Srujan");

        for (int i = 0; i < 5; i++) {
            list1.add(i*7);
        }

        for (int i = 0; i <list1.size(); i++) {
            list1.set(i, list1.get(i) + 2);
        }

        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());

        System.out.println(list1);
        System.out.println(list2);

        list1.sort(Comparator.reverseOrder());
        list2.sort(Comparator.reverseOrder());

        System.out.println(list1);
        System.out.println(list2);

        HashSet<Integer> hash = new HashSet<>();

        hash.addAll(list1);
        System.out.println(hash);

        HashMap<String, Integer> hasmap = new LinkedHashMap<>();

        hasmap.put("Harry Potter", 5);
        hasmap.put("Perks of being a wallflower", 5);
        hasmap.put("Sapiens", 5);
        hasmap.putIfAbsent("Harry Potter", 3);
        System.out.println(hasmap.get("Java"));

        if(hasmap.get("Scarlet Letter") == null) {
            hasmap.putIfAbsent("Scarlet Letter", 15);
        }
        System.out.println(hasmap);
        Set<String> keySet = (hasmap.keySet());


        for(String key : keySet) {
            System.out.println(key);
        }
    }
}