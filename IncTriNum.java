import java.util.Scanner;

public class IncTriNum {
    public static void main(String [] args){
      /**  Scanner s= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num= s.nextInt();

        //for increasing triangle
        for (int i =1, p=1; i<=num; i++, p++){
            for (int j=1; j<=i; j++){
                System.out.print(p+ " ");
            }
            System.out.println();
        }

        //for decreasing triangle
        for (int i=1, p=num; i<=num; i++, p--){
            for(int j=1; j<=i; j++){
                System.out.print(p+" ");
            }
            System.out.println();
        }

        //for increasing triangle with two's
        for (int i =1, p=0; i<=num; i++, p+=2){
            for (int j=1; j<=i; j++){
                System.out.print(p+ " ");
            }
            System.out.println();
        }

        //for increasing triangle with alternate values or symbols
        for (int i =1, p=0; i<=num; i++, p++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print("# ");
                } else
                    System.out.print("* ");
            }
            System.out.println();
        }*/

        //pattern 5: the number only increases (also called FLOYD TRIANGLE)
        int n=5,p=1;
        for (int i =1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(p++ + " ");
            }
            System.out.println();
        }
    }
}
