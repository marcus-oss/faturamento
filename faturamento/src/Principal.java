import expl.faturamento.GestorFiscal;
import expl.faturamento.NotaFiscal;
import expl.faturamento.NotaFiscalProduto;
import expl.faturamento.NotaFiscalServico;

public class Principal {
    public static void main(String[] args) {

        var gestorFiscal = new GestorFiscal();
//        var nf = new NotaFiscal("dec", 600);
        var nfBolaFutebol = new NotaFiscalProduto("Bola Futebol", 300, 50);
        var nfReparoMotor = new NotaFiscalServico("Reparo da roda", 900, true);

        gestorFiscal.emitirNotasFiscais(nfBolaFutebol, nfReparoMotor);


//        System.out.println(nfBolaFutebol.calcularImposto());
//        System.out.println(nfReparoMotor.calcularImposto());

    }
}