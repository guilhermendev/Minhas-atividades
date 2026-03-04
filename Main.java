import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner num =  new Scanner(System.in);

        System.out.print("Digite a idade do empregado: ");
        int idade = num.nextInt();
        System.out.print("Digite o tempo de trabalho (anos): ");
        int tempoTrabalho = num.nextInt();

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer");
        }
    }
}
