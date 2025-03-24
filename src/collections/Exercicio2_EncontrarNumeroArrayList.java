import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio2_EncontrarNumeroArrayList {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int i, numero;
        boolean encontrado = false;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = lerScanner.nextInt();

        for (i = 0; i < numeros.size(); i++) {
            if(numeros.get(i) == numero){
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        lerScanner.close();
    }
}
