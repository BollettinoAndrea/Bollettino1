import java.util.Scanner;

class Auto {
    String marca;
    String modello;
    double prezzo;

    public Auto(String marca, String modello, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
    }

    public String dettagliAuto() {
        return "Marca: " + marca + ", Modello: " + modello + ", Prezzo: " + prezzo;
    }
}

public class Concessionaria_Bollettino {
    static Auto[] listaAuto = new Auto[10];
    static int indice = 0;
    static Scanner in = new Scanner(System.in);

    public static void inserisciAuto() {
        if (indice < listaAuto.length) {
            System.out.print("Inserisci la marca: ");
            String marca = in.nextLine();

            System.out.print("Inserisci il modello: ");
            String modello = in.nextLine();

            System.out.print("Inserisci il prezzo: ");
            double prezzo = in.nextDouble();
            in.nextLine();

            Auto nuovaAuto = new Auto(marca, modello, prezzo);
            listaAuto[indice] = nuovaAuto;
            indice++;

            System.out.println("Nuova auto inserita con successo!");
        } else {
            System.out.println("L'elenco delle auto è pieno.");
        }
    }

    public static void visualizza() {
        if (indice == 0) {
            System.out.println("Non ci sono auto da visualizzare.");
        } else {
            System.out.println("Auto inserite: ");
            for (int i = 0; i < indice; i++) {
                System.out.println(i + ". " + listaAuto[i].dettagliAuto());
            }
        }
    }

    public static void main(String[] args) {
        int scelta;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi una macchina");
            System.out.println("2. Visualizza le auto che hai inserito");
            System.out.println("3. Esci.");
            System.out.print("Scegli un'opzione: ");
            scelta = in.nextInt();
            in.nextLine();

            switch (scelta) {
                case 1:
                    inserisciAuto();
                    break;
                case 2:
                    visualizza();
                    break;
                case 3:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        } while (scelta != 5);
    }
}