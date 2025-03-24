import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio1_Cores {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<String>();

        for(int i = 0; i < 5; i++ ){
            System.out.println("Digite " + (i + 1) + "º cor: ");
            cores.add(lerScanner.nextLine());
        }

        System.out.println("\n");
        System.out.println("Lista de todas as cores: ");
        for(String cor: cores){
            System.out.println(cor);
        }

        Collections.sort(cores);

        System.out.println("\n");
        System.out.println("Cores ordenadas: ");
        for(String cor : cores){
            System.out.println(cor);
        }

        lerScanner.close();
    }
}
