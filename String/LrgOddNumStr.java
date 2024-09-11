public class LrgOddNumStr {
    public static void main(String[] args) {
        String num = "8720";
        System.out.println(largestOddNumber(num));
    }
    public static String largestOddNumber(String num){
        int n = num.length();
        int oddIdx;
        for(int i=n-1; i>=0; i--){
            int d = num.charAt(i)-'0';
            if(d%2 != 0){
                return num.substring(0, i+1);

            }

        }
        return "";
    }
}
