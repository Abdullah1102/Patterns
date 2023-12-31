public class ButterflyPattern {
    public static void main(String[] args) {

        int m = 4;

        //Upper part
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //lower part
        for(int i=m;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces = 2*(m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
