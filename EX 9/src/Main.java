import java .util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("digite o numero 0");
        int num1 = num.nextInt();
        for (int i = 0; i <= 100; i++) {
            if (i % 2== 0){
                System.out.println("o numero"+ num1 + "e par!! ");
            }else {
                System.out.println("o numero e impar!! ");
            }
            System.out.println(i);
        }
    }
}