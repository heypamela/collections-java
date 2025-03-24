import java.util.HashSet;
import java.util.Scanner;

public class Exercicio4_EncontrarNumeroSet {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int numeroEncontrado;

        HashSet<Integer> numeros = new HashSet<Integer>();
        Integer[] listaNumeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        for(int numero : listaNumeros) {
            numeros.add(numero);
        }
        
        System.out.println("Digite o número que você deseja encontrar: ");
        numeroEncontrado = lerScanner.nextInt();

        if (numeros.contains(numeroEncontrado)) {
            System.out.println("O número " + numeroEncontrado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroEncontrado + " não foi encontrado!");
        }

        lerScanner.close();
    }
}
