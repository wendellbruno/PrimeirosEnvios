import java.io.*;


public class Leitor {
    public static void main(String[] args) {

        String[] lines = new String[]{"oi, olá, hellou, tchau, até mais"};

        String path = "c:\\temp\\out.txt";

        try (BufferedWriter bf = new BufferedWriter(new FileWriter(path, true))) {
                for (String line : lines) {
                    bf.write(line);
                    bf.newLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
}

