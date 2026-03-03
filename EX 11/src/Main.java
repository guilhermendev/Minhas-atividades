public class Main {
    public static void main(String[] args) {
        imprimirPrimosAteCem();
    }

    public static void imprimirPrimosAteCem() {
        for (int i = 0; i <= 100; i++) {
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(i + " é PRIMO");
            } else {
                System.out.println(i + " não é primo");
            }
        }
    }
}