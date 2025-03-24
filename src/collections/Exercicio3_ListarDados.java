import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;

public class Exercicio3_ListarDados {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        HashSet<Integer> numeros = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite " + (i + 1) + "º número: ");
            numeros.add(lerScanner.nextInt()); 
        }

        ArrayList<Integer> lista = new ArrayList<Integer>(numeros);
        Collections.sort(lista);

        System.out.println("Listar dados do Set");
        Iterator<Integer> iterator = numeros.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        lerScanner.next();
    }
}
