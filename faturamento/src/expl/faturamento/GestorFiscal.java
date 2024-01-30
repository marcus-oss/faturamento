package expl.faturamento;

public class GestorFiscal {

    public void emitirNotasFiscais(NotaFiscal... notaFiscals) {
        for (NotaFiscal notaFiscal : notaFiscals) {
            notaFiscal.emitir();
            System.out.println("--------------");

        }
    }
}
