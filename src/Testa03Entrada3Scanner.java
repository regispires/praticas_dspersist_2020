import java.io.*;
import java.util.*;

public class Testa03Entrada3Scanner {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");

        Scanner entrada = new Scanner(is);
        //Scanner entrada = new Scanner(is, "UTF-16");
        //Scanner entrada = new Scanner(is, "ISO-8859-1");
        while (entrada.hasNextLine()) {
            System.out.println(entrada.nextLine());
        }

        is.close();
    }
}
