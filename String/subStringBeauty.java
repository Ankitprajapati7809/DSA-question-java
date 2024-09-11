import java.util.*;
import java.io.*;

public class subStringBeauty {
    public static void main(String[] args) {
        String s = "aabcb";
        System.out.println(beautySum(s));
    }

    public static int beautySum(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int res = 0;
        for(int i=0; i<s.length(); i++){
            int fr[]=new int[26];
            for(int j=i; j<s.length(); j++){
                fr[s.charAt(j)-'a']++;
                res+=solve(fr);
            }
        }
        return res;
    }
    public static int solve(int frq[]){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i=0; i<frq.length; i++){
            if(frq[i]==0){
                continue;
            }
            min=Math.min(min,frq[i]);
            max=Math.max(max,frq[i]);
        }
        return max-min;
    }
}
