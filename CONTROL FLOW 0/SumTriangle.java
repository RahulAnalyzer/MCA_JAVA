import java.util.Scanner;

class SumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int a = sc.nextInt();

        System.out.print("Enter second angle: ");
        int b = sc.nextInt();

        System.out.print("Enter third angle: ");
        int c = sc.nextInt();

        int SumOfAngle = a + b + c;

        System.out.println("The given angles " + a + ", " + b + ", " + c + " add to " + SumOfAngle);

        if (SumOfAngle == 180) {
            System.out.println("The given angles ARE internal angles of a TRIANGLE");
        } else {
            System.out.println("The given angles are NOT internal angles of a TRIANGLE");
        }

        sc.close();
    }
}
