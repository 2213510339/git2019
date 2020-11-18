package cleancode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = Collections.EMPTY_MAP;
        System.out.println(map1);
        System.out.println(map2);
        setMap(map1);
        System.out.println(map1);
        setMap2(map2);
        System.out.println(map2);

    }

    private static void setMap2(Map<String, String> map2) {
        map2 = new HashMap<>();
        map2.put("22", "22");
    }

    private static void setMap(Map map1) {
        map1.put("1", "1");
        map1.put("2", "2");
    }
}
