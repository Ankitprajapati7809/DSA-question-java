public class ReverseString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "bcdea";
        System.out.println(rotateString(s, goal));
    }

        public static boolean rotateString(String s, String goal) {
            return s.length() == goal.length() && (s + s).contains(goal);
        }
    }

