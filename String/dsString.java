
import java.util.ArrayList;

public class dsString {

    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        // String str =Integer.valueOf(5) + "" + new ArrayList<>();

        String series = "";
        for(int i =0; i<26; i++){
            char ch = (char)('a'+i);
             series = series + ch;
        }

         System.out.println(series);

    }
}
