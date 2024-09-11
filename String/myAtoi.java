public class myAtoi {
    public static void main(String[] args) {
        String s = "  -5678   ";
        System.out.println(atoi(s));
    }

    public static int atoi(String s){
        if(s==null) return 0;

        s=s.trim();

        if(s.length()==0) return 0;

        int sign = +1;
        int ans = 0;
        if(s.charAt(0) == '-') sign = -1;

        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;

        // initiate the starting pointer
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) break;
            int a = s.charAt(i);
            char b = '0';
            ans = ans * 10 + a-b;
            // check the conditions
            if(sign == -1 && -1*ans < MIN) return MIN;
            if(sign == 1 && ans > MAX) return MAX;

            i++;
        }

        return (sign*ans);
    }
}
