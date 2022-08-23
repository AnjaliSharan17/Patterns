public class DecRightTriangle {
    public static void main(String[]args){
        int n=5;
        /** //pattern 1
        for (int i=1; i<=n; i++){
            int p=n;
            for (int j=1; j<=i; j++){
                System.out.print(p--+" ");
            }
            System.out.println();
        }*/

         //pattern 2

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("  ");
            }
            int p=n;
            for (int j=i; j<=n;j++){
                System.out.print(p--+" ");
            }
            System.out.println();
        }

       /*** //pattern 3
        for (int i=1,k=n; i<=n; i++,k--) {
            for (int j = 1;j <= i; j++) {
                System.out.print("  ");
            }
            int p = k;
            for (int j = i; j <= n; j++) {
                System.out.print(p-- + " ");
            }
            System.out.println();
        }*/
    }
}
