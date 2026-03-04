import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        ArrayList<Integer> listaCodigos = new ArrayList<>();
        ArrayList<Integer> listaSenhas = new ArrayList<>();


        System.out.println("Cadastro do usuario");
        for (int i = 0; i < 3; i++) {
            System.out.println("Cadastrando usuário " + (i + 1));
            System.out.print("Defina o código: ");
            listaCodigos.add(num.nextInt());

            System.out.print("Defina a senha: ");
            listaSenhas.add(num.nextInt());
            System.out.println("Usuário salvo!\n");
        }


        System.out.println("Tela de login ");
        System.out.print("Digite seu código: ");
        int codigoLogin = num.nextInt();

        System.out.print("Digite sua senha: ");
        int senhaLogin = num.nextInt();

        if (listaCodigos.contains(codigoLogin)) {
            int posicao = listaCodigos.indexOf(codigoLogin);

            if (listaSenhas.get(posicao).equals(senhaLogin)) {
                System.out.println("Acesso válido!! Bem-vindo.");
            } else {
                System.out.println("Senha inválida!");
            }
        } else {
            System.out.println("Código não encontrado!");
        }
    }
}
