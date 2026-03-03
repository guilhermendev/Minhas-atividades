import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("DIgite um nimero! ");
        int num1 = num.nextInt();
        if (num1 % 2== 0){
            System.out.println("o numero"+ num1 + "e par!! ");
        }else {
            System.out.println("o numero e impar!! ");
        }
        }
}