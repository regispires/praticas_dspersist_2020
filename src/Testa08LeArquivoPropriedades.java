import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Testa08LeArquivoPropriedades {

    public static void main(String[] args) {
        Properties prop = new Properties();

        try {
            prop.load(Testa08LeArquivoPropriedades.class.getClassLoader()
                    .getResourceAsStream("config.properties"));
            System.out.println(prop.getProperty("database"));
            System.out.println(prop.getProperty("dbuser"));
            System.out.println(prop.getProperty("dbpassword"));

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
