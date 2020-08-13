
import java.util.Scanner;


public class Formula {
    public static void main(String[] args) {
        Scanner Reader = new Scanner(System.in);
        double F=0;
        double C;
        System.out.println("dar el valor de F: ");
        F = Reader.nextInt();
        C=(F-32)*5/9;
        System.out.println("la respuesta de C:" + C);
        
    }
    
}
