import java.util.Scanner;

public class checkPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine().toLowerCase();

        System.out.println(isPalin(str));
    }

       static boolean isPalin(String str){
        if(str.length()==0){
            return true;
        }
            int n = str.length() ;
            for(int i=0; i<=n/2; i++){
                if(str.charAt(i) != (str.charAt(n-i-1)) ){
                    return false;
                }

            }
            return true;
        }




}
