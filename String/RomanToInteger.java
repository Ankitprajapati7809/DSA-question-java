//public class RomanToInteger {
//    public static void main(String[] args) {
//        String s = "MCMXCIV";
//        System.out.println(romanToInteger(s));
//    }
//   public static int getValue(char ch){
//        switch (ch)
//        {
//            case 'I': return 1;
//            case 'V': return 5;
//            case 'X': return 10;
//            case 'L': return 50;
//            case 'C': return 100;
//            case 'D': return 500;
//            case 'M': return 1000;
//            default: return 0;
//        }
//   }
//    public static int romanToInteger(String s){
//        int sum=0;
//        int n = s.length();
//        for(int i=0; i<n; i++){
//
//            // sum += getValue(s.charAt(i)); // 1000-100+1000-10+100-1+5
//            int one = getValue(s.charAt(i));
//            int pOne = getValue(s.charAt(i+1));
//            if( (i+1)<n && one < pOne){
//               sum -=  one;
//            }else{
//                sum += one;
//            }
//        }
//        return sum;
//    }
//}
import java.util.HashMap;
import java.util.HashSet;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInteger(s));
    }

//    public static int getValue(char ch){}
    public static int romanToInteger(String s){
        int sum = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for(int i=0; i<n; i++){
          if ((i+1<n) && map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                sum -= map.get(s.charAt(i));
          }else {
                sum += map.get(s.charAt(i));
          }
        }
        return sum;
    }
}
