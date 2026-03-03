import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Digite a idade do Homem mais velho: ");
        int HomemMaisVelho = num.nextInt();

        System.out.println("Digite a idade do Homem mais novo: ");
        int HomemMaisNovo = num.nextInt();

        System.out.println("Digite a idade da Mulher mais Velha: ");
        int MulherMaisVelha = num.nextInt();

        System.out.println("Digite a idade da Mulher mais nova: ");
        int MulherMaisNova = num.nextInt();

        int soma =  HomemMaisVelho + MulherMaisNova;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova e: " + soma +  "Anos");

        int soma1 =  HomemMaisNovo + MulherMaisVelha;
        System.out.println("A soma das idades do homem mais novo com a mulher mais velha e: " + soma1 +  "Anos");



    }
}