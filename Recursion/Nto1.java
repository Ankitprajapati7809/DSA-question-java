public class Nto1 {
    public static int sum = 0;
    public static void main(String[] args) {
        int n=5;
//        Nto1(n);
//        System.out.println(factorial(5));
//        System.out.println(sumofNum(1342));
//        System.out.println(multiply(1342));
//        passing(5);
//        reverse(1824);
//        System.out.println(sum);
        System.out.println(countZeros(102030405, 0));
    }
    public static void Nto1(int n){
        if(n==0) return;
        Nto1(n-1);
        System.out.println(n);
    }
    public static int factorial(int n){
       if(n==1){
           return 1;
       }
         return n *  factorial(n-1);
    }
    public static int sumofNum(int n){
    if(n==0){
        return 0;
    }

        return (n%10) + sumofNum((n/10));

    }

    public static int multiply(int n){
        if(n==0){
            return 1;
        }
        return (n%10) * multiply((n/10));
    }
    public static void passing(int n){
        if(n==0) return;
        System.out.println(n);
        passing(--n);
    }
    public static void reverse(int n) {
        if(n==0) return;
        int r = n%10;
        int q = n/10;
        sum = (sum*10) + r;
        reverse(q);
    }

    public static int countZeros(int n, int c){
        if(n==0) return c;
        if(n%10 == 0){
            return countZeros(n/10, c + 1);
        }
        else{
            return countZeros(n/10, c);
        }
    }

}
