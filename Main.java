import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int inicio = num.nextInt();

        System.out.print("Digite o número final: ");
        int fim = num.nextInt();

        int soma = 0;
        int contador = 0;

        for (int i = inicio; i <= fim; i++) {
            soma += i;
            contador++;
        }

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média entre " + inicio + " e " + fim + " é: " + media);
        } else {
            System.out.println("Intervalo inválido (o início deve ser menor que o fim).");
        }
        
    }
}