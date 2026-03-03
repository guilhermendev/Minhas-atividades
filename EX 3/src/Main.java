import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite seu primeiro numero!!");
        int num1 = num.nextInt();
        System.out.println("Digite seu segundo numero!!");
        int num2 = num.nextInt();

        int soma = num1 + num2;
        System.out.println("seu valor e: "+ soma);
        }
}