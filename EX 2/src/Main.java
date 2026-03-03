import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Digite algo:");
        String frase = num.nextLine();

        System.out.println("Você digitou: " + frase);
    }
    public static String criarFrase(Scanner num) {
        return num.nextLine();
    }
}
