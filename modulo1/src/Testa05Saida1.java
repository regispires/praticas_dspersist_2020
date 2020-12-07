import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Testa05Saida1 {
    public static void main(String[] args)
            throws FileNotFoundException {

        PrintStream ps = new PrintStream(
                new FileOutputStream("saida.txt", true));
        ps.println("Java3");
        ps.close();
    }
}
