import java.io.*;
import java.util.*;

public class freq  {
    public static void main(String[] args) {
    String s = "tree";
        System.out.println(frequencySort(s));
    }
    public static String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb=new StringBuilder("");
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Character> list = new ArrayList(map.keySet());
        list.sort((ob1, ob2) -> map.get(ob2) - map.get(ob1));
        for(char ch: list){
            for(int i = 0; i< map.get(ch); i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
