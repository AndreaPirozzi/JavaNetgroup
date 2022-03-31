package TestJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("inserisci un nome: ");
            String user_input = scanner.nextLine();
            if (user_input.isEmpty()) {
                break;
            }

            lista.add(new String(user_input));
        }

        // stampa gli elementi inseriti da tastiere
        System.out.println(lista);

        System.out.println("***********************************");

        lista.remove(2);

        // stamapa gli elementi dopo l'istruzione remove
        System.out.println(lista);
    }
}
