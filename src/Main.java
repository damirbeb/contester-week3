import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a <= b && b <= c) {
            System.out.println(2*a);
            System.out.println(2*b);
            System.out.println(2*c);
        }
        else {
            System.out.println(Math.abs(a));
            System.out.println(Math.abs(b));
            System.out.println(Math.abs(c));
        }

        scanner.close();
    }
}