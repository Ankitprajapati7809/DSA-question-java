import java.io.*;

public class trimSplit {
    public static void main(String[] args) {
        String s = "  my name    is ankit  ";
        System.out.println(s);
        String a = s.trim();
        System.out.println(a);
//        split(s);
    }
    static void split(String s){
        StringBuilder sb = new StringBuilder("");
        String[] str = s.split(" ");
        for(int i=str.length-1; i>=0; i--){
            System.out.print(sb.append(i+" "));

        }
    }
}
