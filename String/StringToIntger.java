public class StringToIntger {
    public static void main(String[] args) {
        String s = "56fngk87";
        int n = s.length();
        for(int i=0; i<n; i++){
            if (Character.isDigit(s.charAt(i))){
                System.out.println(s.charAt(i));
            }
        }
    }
}
