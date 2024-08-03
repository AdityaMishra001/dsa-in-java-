import java.util.Scanner;

public class Spiral_Of_2DArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows in the matrix");
        int rows= sc.nextInt();
        System.out.println("enter the number of columns in the matrix");
        int cols= sc.nextInt();
        int[][]matrix=new int[rows][cols];
        for(int i=0;i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("the spiral order of the matrix is");
        int rowstart=0;
        int rowsend=rows-1;
        int colstart=0;
        int colsend=cols-1;
        while(rowstart<=rowsend && colstart<=colsend){
            for(int col=colstart; col<=colsend; col++){
                System.out.print(matrix[rowstart][col] + " ");
            }
            rowstart++;
        }
        for (rows=rowstart;rows<=rowsend; rows++){
            System.out.print(matrix[rows][colsend] + " ");
        }
        colsend--;
        for (cols=colsend; cols>=colstart; cols--){
            System.out.print(matrix[rowsend][cols]+" ");
        }rowsend--;
        for( rows = rowsend;rows>=rowstart; rows--){
            System.out.print(matrix[rows][colstart] + " ");
        }colstart++;
        System.out.println();
    }
}
