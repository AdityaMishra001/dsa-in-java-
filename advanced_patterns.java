import java.util.Scanner;
public class advanced_patterns {
    public static void main(String[] args) {
        //BUTTERFLY PATTERN
        int n=4;
        //upper part
        for(int i=1; i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i=n;i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces=2*(n-i);
            for (int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //PATTERN 2
        int k=5;
        for (int i=1; i<=k; i++){
            for(int j=1; j<=k-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=k; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //PATTERN 3
        int z=5;
        for(int i=1; i<=z; i++){
            for(int j=1; j<=z-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //PATTERN 4
        int y=5;
        for(int i=1; i<=y; i++){
            for(int j=1; j<=y-i; j++){
                System.out.print(" ");

        }
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        int u=5;
        for(int i=1; i<=u; i++) {
            for (int j = 1; j <= u - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            //lower part
            for(int i=u; i>=1; i--){
                for(int j=1; j<=i-1; j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }


    }

