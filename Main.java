import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero da tabuada que deseja visualizar: ");
        int numero = num.nextInt();
        System.out.println("Tabuada do " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}