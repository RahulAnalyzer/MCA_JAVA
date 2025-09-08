
import java.util.Scanner;

public class fifith5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius");
        int r=sc.nextInt();
        System.out.println("Enter the Height");
        int h = sc.nextInt();
        System.out.println("AREA OF CIRCLE:"+(3.14*(r*r*h)));
        sc.close();
    }
}


