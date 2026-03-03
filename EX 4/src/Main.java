import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.println("Digite seu primeiro numero!!");
        double num1 = num.nextDouble();
        System.out.println("Digite seu segundo numero!!");
        double num2 = num.nextDouble();
        System.out.println("Digite seu segundo numero!!");
        double num3 = num.nextDouble();

        double soma = (num1 + num2 + num3) / 3;
        System.out.printf("seu valor e: %.2f", soma);
        }
}