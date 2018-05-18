import java.lang.reflect.Array;
import java.util.*;

public class World {

    public static void main(String[] args) {

       // Set<String> countries = new Set<String>();


        HashMap<String, Set<String>> myWorld = new HashMap<>();

        myWorld.put("Asia", new HashSet<String>() {{
            add("India");
            add("Pakistan");

        }});

        myWorld.put("Europe", new HashSet<String>() {{
            add("UK");
            add("Germany");

        }});

        myWorld.put("Africa", new HashSet<String>() {{
            add("Nigeria");
            add("something");
        }});

        System.out.println(myWorld.get("Asia"));
        System.out.println(myWorld.values());


        }
    }

