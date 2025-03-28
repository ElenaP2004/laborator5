import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //probl1();

        RandomWordGenerator.generareFisierRandom();
    }

    static void probl1() {
        String inputFile = "in.txt";
        String outputFile = "out.txt";
        try {

            List<String> lines = Files.readAllLines(Paths.get(inputFile));


            StringBuilder result = new StringBuilder();

            for (String line : lines) {

                result.append(line).append("\n");


                result.append(line.replace(".", ".\n"));
            }


            writeToFile(outputFile, result.toString());

            System.out.println("Fisierul " + outputFile + " a fost creat");
        } catch (IOException e) {
            System.out.println("Eroare, verifica tot");
        }
    }

    static void writeToFile(String fileName, String content) throws IOException {
        Path path = Paths.get(fileName);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(content);
        }
    }
}