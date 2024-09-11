public class PrintStarTriangle {
    public static void main(String[] args) {
        Tringle2(4, 0);
    }

    static void Tringle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            System.out.print("*");
            Tringle(r, c+1);
        }else{
            System.out.println();
            Tringle(r-1, 0);
        }
    }

    static void Tringle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            Tringle2(r, c+1);
            System.out.print("*");
        }else{
            Tringle2(r-1, 0);
            System.out.println();
        }
    }
}
