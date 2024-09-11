public class maxNestingDepth {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
        public static int maxDepth(String s) {
            int maxDepth = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='('){
                    count++;
                    if(count>maxDepth){
                        maxDepth = count;
                    }
                }
                else if(s.charAt(i)==')'){
                    count--;
                }

            }
            return maxDepth;
    }
}
