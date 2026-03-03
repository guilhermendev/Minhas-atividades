import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite o nome de uma fruta: ");
        String fruta = num.nextLine();

        char inicial = pegarPrimeiraLetra(fruta);

        System.out.println("A primeira letra da fruta é: " + inicial);

    }

    public static char pegarPrimeiraLetra(String texto) {
        return texto.charAt(0);
    }
}