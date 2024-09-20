import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int auto;
        String[] marche = new String[auto];
        String[] modelllo = new String[auto];
        double[] prezzo = new double[auto];
        System.out.println("quante auto voi inserire?");
        auto = in.nextInt();

        do {
            System.out.println("1. Aggiungi una macchina");
            System.out.println("2. Visualizza le auto che hai inserito");
            System.out.println("3. Cerca un'auto inserendo marca e modello");
            System.out.println("4. Modifica i dati di un auto");
            System.out.println("5. Cancella un'auto");
            System.out.println("6. Visualizza le auto in ordine crescente.");
            System.out.println("7. Visualizza tutti i modelli disel.");
            System.out.println("8. Esci.");
        } while ();
    }

}