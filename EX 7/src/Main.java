import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("iniciando programa!! ");
        System.out.println("Escreva seu nome: ");

        String nome = num.nextLine();
        System.out.println("bem vindo(a): " + nome);

        System.out.println("Digite seu primeiro numero!!");
        double num1 = num.nextDouble();
        System.out.println("Digite seu segundo numero!!");
        double num2 = num.nextDouble();

        double soma = num1 + num2;
        System.out.println("A soma e: " + soma);

        double resultado = (soma) / 2;
        System.out.printf("seu valor e: %.2f", resultado);

        if (resultado % 2== 0){
            System.out.println( " e o numero"+ resultado + "e par!! ");
        }else {
            System.out.println("o numero e impar!! ");
        }
    }
}