import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = num.nextInt();

        int resposta = calcularFatorial(n);

        System.out.println("O fatorial é: " + resposta);
    }

    public static int calcularFatorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}