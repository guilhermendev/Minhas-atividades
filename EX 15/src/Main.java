import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a quantidade de morango por (KG): " );
        double MorangoporKG =num.nextDouble();

        System.out.println("Digite a quantidade de Maças por (KG): " );
        double MacasporKG =num.nextDouble();

            double  precoMorango;
            double precoMacas;

            if (MorangoporKG <=5){
                precoMorango = MorangoporKG * 2.50;
            }else {
                precoMorango = MorangoporKG * 2.20;
            }
            if (MacasporKG <= 5){
                precoMacas = MacasporKG * 1.80;
            }else {
                precoMacas = MacasporKG * 1.50;
            }
            double total = precoMorango + precoMacas;
            double totalkg = MorangoporKG + MacasporKG;
            if (totalkg > 8 || total > 25){
                total = total * 0.90;
            }
        System.out.printf("Valor total a pagar: R$ %.2f", total);
        }

}