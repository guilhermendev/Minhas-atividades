public class Main {
    public static void main(String[] args) {
        double resultado = calcularMediaDeDezANoventa();
        System.out.println("A média da soma de 10 a 90 é: " + resultado);
    }

    public static double calcularMediaDeDezANoventa() {
        double soma = 0;
        int contador = 0;

        for (int i = 10; i <= 90; i++) {
            soma += i;
            contador++;
        }
        return soma / contador;
    }
}