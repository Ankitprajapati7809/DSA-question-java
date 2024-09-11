public class containString {
    public static void main(String[] args) {
        String s = "anagram";
        int[] count = new int[26];

        for (char x : s.toCharArray()) {
            count[x - 'a']++;
//            System.out.println(x);
        }
        for (int val : count) {
            System.out.println(val);

        }
    }
}