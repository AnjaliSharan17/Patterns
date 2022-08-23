import java.util.Scanner;

public class decreasingTriangle {
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=s.nextInt();
        for(int i=1; i<=num; i++){
            for (int j=i; j<=num; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
