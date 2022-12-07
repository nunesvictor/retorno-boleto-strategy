import com.manoelcampos.retornoboleto.ProcessarBoletos;

import java.net.URL;
import java.nio.file.Paths;

/**
 * Classe para ver o funcionamento da leitura de boletos.
 *
 * @author Manoel Campos da Silva Filho
 */
public class Principal {
    public static void main(String[] args) {
        final URL caminhoArquivo = Principal.class.getResource("banco-brasil-1.csv");
        final ProcessarBoletos processador = new ProcessarBoletos(caminhoArquivo);

        if (caminhoArquivo == null) {
            System.err.println("Erro ao recuperar caminho do arquivo");
            return;
        }

        System.out.println("Processando o arquivo: " + Paths.get(caminhoArquivo.getPath()).getFileName() + "\n");
        processador.processar();
    }
}
