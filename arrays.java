import java.util.Scanner;
public class arrays_java {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int [] numbers =new int [size];
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        boolean isAscending=true;
        for(int i=0; i<size; i++){
            if(numbers[i]>numbers[i+1]){
                isAscending=false;
            }
            if (isAscending){
                System.out.println("array is sorted");
                break;
            }else{
                System.out.println("array is not sorted");
                break;
            }

        }


        }

    }
//2d arrays
import java.util.Scanner;

public class Arrays_2D {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows=sc.nextInt();
        System.out.println("enter the number of columns");
        int cols= sc.nextInt();
        int[][]numbers=new int[rows][cols];
        System.out.println("now enter the elements of the 2D array");
        for(int i=0; i<rows; i++) {
            //cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("tell us the number you wanna search");
            int x= sc.nextInt();
            for(int i=0; i<rows;i++){
                for(int j=0; j<cols; j++){
                    if(numbers[i][j]==x){
                        System.out.println("the number you were searching found at ("+ i +","+  j + ")");
                        break;
                    }
                }
            }


        }


    }

