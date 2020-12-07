import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Testa02Entrada2Buffer {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        //InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        //InputStreamReader isr = new InputStreamReader(is, "ISO-8859-1");

        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        while ( s != null ) {
            System.out.println(s);
            s = br.readLine();
        }
    }
}
