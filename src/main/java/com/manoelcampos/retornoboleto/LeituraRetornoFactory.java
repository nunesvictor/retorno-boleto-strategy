package com.manoelcampos.retornoboleto;

import java.net.URL;
import java.nio.file.Paths;

public class LeituraRetornoFactory {
    public static LeituraRetorno newInstance(URL caminhoArquivo) {
        String nomeArquivo = Paths.get(caminhoArquivo.getPath()).getFileName().toString();

        return switch (nomeArquivo) {
            case "banco-brasil-1.csv" -> new LeituraRetornoBancoBrasil();
            case "bradesco-1.csv" -> new LeituraRetornoBradesco();
            default -> throw new UnsupportedOperationException("Formato de arquivo não suportado");
        };
    }
}
