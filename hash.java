import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class hash {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("nombres.txt"));
            HashSet<String> tabla = new HashSet<>();

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\s+");
                for (String nombre : partes) {
                    if (!nombre.isEmpty()) {
                        tabla.add(nombre);
                    }
                }
            }

            br.close();

            List<String> lista = new ArrayList<>(tabla);
            Collections.sort(lista);

            PrintWriter pw = new PrintWriter("resultado.txt");
            pw.println("Ordenamiento de nombres por el metodo hash:");
            for (String nombre : lista) {
                pw.println(nombre);
            }
            pw.close();

            System.out.println("HashSort de nombres generado en resultado.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
