import java.util.Scanner;
class PostoCombustivel {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Digite o tipo de combustível (A-Álcool, G-Gasolina): ");
        char tipo = num.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros: ");
        double litros = num.nextDouble();

        double precoLitro = 0;
        double desconto = 0;
        double total;

        if (tipo == 'A') {
            precoLitro = 2.90;

            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }

        } else if (tipo == 'G') {
            precoLitro = 3.30;

            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }

        } else {
            System.out.println("Tipo de combustível inválido!");
            return;
        }
        total = litros * precoLitro;
        total = total - (total * desconto);

        System.out.printf("Valor a ser pago: R$ %.2f\n", total);
    }
}