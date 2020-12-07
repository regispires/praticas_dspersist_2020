import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Testa01Entrada1 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        //InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        //InputStreamReader isr = new InputStreamReader(is, "ISO-8859-1");

        char c = (char)isr.read();
        System.out.println(c);
        c = (char)isr.read();
        System.out.println(c);

    }
}
