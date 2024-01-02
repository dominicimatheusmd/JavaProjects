package teste;

import java.util.*;
public class switchTeste {
    public static void main(String[] args) {
        System.out.println("Insira um numero de 1 a 10");
        Scanner scan = new Scanner (System.in);
        int numero = scan.nextInt();
        switch (numero){
            case 1:
                System.out.printf("Numero inserido foi 2!!");
                break;
            case 10:
                System.out.printf("Numero inserido foi 10!!");
                break;
            case 100:
                System.out.printf("Numero inserido foi 100!!");
                break;
            default:
                System.out.printf("numero fora do range, vsf tmj!!");
        }
    }
}
