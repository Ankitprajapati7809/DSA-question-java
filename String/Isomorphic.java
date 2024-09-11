import java.io.*;
import java.util.HashMap;

public class Isomorphic {
    public static void main(String[] args) {
        String s = "anikt";
        String t = "kuaai";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            int n = s.length();
            HashMap<Character, Character> map1 = new HashMap<>();
            HashMap<Character, Boolean> map2 = new HashMap<>();

            for (int i = 0; i < n; i++) {
                char x = s.charAt(i);
                char y = t.charAt(i);
                if (map1.containsKey(x) == true) {
                        if(map1.get(x)!=y){
                            return false;
                        }
                } else {
                    if (map2.containsKey(y) == true) {
                        return false;
                    } else {
                        map1.put(x, y);
                        map2.put(y, true);
                    }
                }
            }
            return true;
        }
    }
}

