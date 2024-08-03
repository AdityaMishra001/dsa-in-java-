import java.util.Scanner;
public class loops_Dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what multiplication table you want to print?");
        int x = sc.nextInt();
        //for(int counter=0; counter <=x; counter++){
        //  System.out.println(counter);

        //while(counter<=x){
        //  System.out.println(counter);
        //counter++;
        // do{
        //System.out.println(counter);
        // counter++;
        //}while(counter<=x);
       for(int i=1; i<11; i++){
           System.out.println(i*x);

        }
    }
}
