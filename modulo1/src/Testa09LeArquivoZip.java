import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Testa09LeArquivoZip {

    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("/Users/regis/tmp/datasets/iris.zip");
        ZipInputStream zis = new ZipInputStream(is);

        ZipEntry ze = null;
        BufferedReader br = null;
        int c = 1;
        while ((ze = zis.getNextEntry()) != null) {
            System.out.println("--> " + (c++) + ". " + ze.getName());
            InputStreamReader isr = new InputStreamReader(zis);
            br = new BufferedReader(isr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }
        br.close();
    }
}
