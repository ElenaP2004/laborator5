import java.io.*;
import java.util.*;

public class FileProcessorJava {


    public static void creareFisierIn() {
        String text = """
                Lorem ipsum dolor sit amet, vim ne eripuit vulputate. Vide tantas dicunt ne ius, mel pertinacia intellegebat ei.
                Sea vidisse aperiam et, eu altera audiam percipitur vis, decore verterem ea nec. Veri quando ad est. Ex quidam blandit nec,
                eos et percipit indoctum.
                
                Summo putant consetetur cu vel. Id eum adipisci philosophia, eos commodo principes an. Duis eripuit laoreet qui ne,
                pri maiorum detracto definitiones et. Sea quis laudem dolorem eu.
                """;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("in.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void procesareFisier() {
        List<String> lines = new ArrayList<>();


        try (BufferedReader reader = new BufferedReader(new FileReader("in.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        List<String> linesA = new ArrayList<>();
        for (String line : lines) {
            linesA.add(line + "\n");
        }


        List<String> linesB = new ArrayList<>();
        for (String line : lines) {
            linesB.add(line.replace(".", ".\n"));
        }


        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"))) {
            for (String line : linesA) {
                writer.write(line);
            }
            writer.write("\n-------------------\n");
            for (String line : linesB) {
                writer.write(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }}
