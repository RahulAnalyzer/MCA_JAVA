import java.util.Scanner;

public class Third3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Temperature in Celsius: ");
        double temp = sc.nextDouble();
        
        double fahrenheit = (temp * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        
        sc.close();
    }
}
