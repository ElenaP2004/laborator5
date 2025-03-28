import java.io.*;
import java.util.*;

public class RandomWordGenerator {

    public static void generareFisierRandom() {
        Random random = new Random();
        int numarLinii = 5;
        int numarCuvintePeLinie = 10;
        int lungimeCuvant = 4;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("outrand.txt"))) {
            for (int i = 0; i < numarLinii; i++) {
                List<String> cuvinte = new ArrayList<>();

                // Generăm 10 cuvinte aleatorii
                for (int j = 0; j < numarCuvintePeLinie; j++) {
                    StringBuilder cuvant = new StringBuilder();
                    for (int k = 0; k < lungimeCuvant; k++) {
                        char litera = (char) ('a' + random.nextInt(26)); // Generăm litere între 'a' și 'z'
                        cuvant.append(litera);
                    }
                    cuvinte.add(cuvant.toString());
                }


                Collections.sort(cuvinte);


                writer.write(String.join(" ", cuvinte));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
