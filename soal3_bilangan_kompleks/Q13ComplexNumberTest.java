import java.util.Scanner;

public class Q13ComplexNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Real bilangan pertama: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imajiner bilangan pertama: ");
        double imaginary1 = scanner.nextDouble();
        System.out.print("Real bilangan kedua: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imajiner bilangan kedua: ");
        double imaginary2 = scanner.nextDouble();

        Q13ComplexNumber c1 = new Q13ComplexNumber(real1, imaginary1);
        Q13ComplexNumber c2 = new Q13ComplexNumber(real2, imaginary2);

        System.out.println("c1: " + c1.toString());
        System.out.println("c2: " + c2.toString());
        System.out.println("Addition: " + c1.add(c2).toString());
        System.out.println("Subtraction: " + c1.subtract(c2).toString());
        System.out.println("Multiplication: " + c1.multiply(c2).toString());

        scanner.close();
    }
}
