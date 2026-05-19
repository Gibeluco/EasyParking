import java.io.FileWriter;
import java.io.IOException;

public class Arquivotxt {

    public static void salvar(Veiculo v) {

        try {

            FileWriter writer = new FileWriter("arquivoservice.txt", true);

            writer.write(v.toString() + "\n");

            writer.close();

        } catch (IOException e) {

            System.out.println("Erro ao salvar arquivo.");

        }
    }
}