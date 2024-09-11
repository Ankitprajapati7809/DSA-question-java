import java.util.*;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        String series = "";
        for(int i =0; i<26; i++){
            char ch = (char)('a'+i);
           builder.append(ch);
        }
        System.out.println(series);
        System.out.println(builder.deleteCharAt(25));
    }
    }


