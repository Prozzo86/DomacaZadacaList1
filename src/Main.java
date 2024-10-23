import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> brojevi = new ArrayList<>();

        System.out.print("Unesite veličinu liste: ");
        int velicinaListe = scanner.nextInt();

        System.out.println("Unesite " + velicinaListe + " brojeva:");

        for (int i = 0; i < velicinaListe; i++) {
            brojevi.add(scanner.nextInt());
        }

        int minIndex = 0;
        int maxIndex = 0;

        int min = brojevi.get(0);
        int max = brojevi.get(0);

        for (int i = 1; i < brojevi.size(); i++) {
            if (brojevi.get(i) < min) {
                min = brojevi.get(i);
                minIndex = i;
            }
            if (brojevi.get(i) > max) {
                max = brojevi.get(i);
                maxIndex = i;
            }
        }

        int minValue = brojevi.get(minIndex);
        int maxValue = brojevi.get(maxIndex);

        brojevi.set(minIndex, maxValue);
        brojevi.set(maxIndex, minValue);

        System.out.println("Nova lista nakon zamjene najmanjeg i najvećeg broja:");
        for (int broj : brojevi) {
            System.out.print(broj + " ");
        }
    }
}
