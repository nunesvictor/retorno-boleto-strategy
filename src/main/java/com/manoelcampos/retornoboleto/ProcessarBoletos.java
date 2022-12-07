package com.manoelcampos.retornoboleto;

import java.net.URL;
import java.util.List;

public class ProcessarBoletos {
    private final URL caminhoArquivo;
    private final LeituraRetorno leituraRetorno;

    public ProcessarBoletos(URL caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
        this.leituraRetorno = LeituraRetornoFactory.newInstance(caminhoArquivo);
    }

    public final void processar(){
        final List<Boleto> boletos = leituraRetorno.lerArquivo(caminhoArquivo);

        System.out.println("Boletos");
        System.out.println("----------------------------------------------------------------------------------");

        for (Boleto boleto : boletos) {
            System.out.println(boleto);
        }
    }
}
