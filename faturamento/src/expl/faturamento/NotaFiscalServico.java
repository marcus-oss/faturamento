package expl.faturamento;

public class NotaFiscalServico extends NotaFiscal {

    public static final double ALIQUOTA_IMPOSTOS = 0.18;
    public static final int VALOR_MAXIMO_INSECAO_FISCAL = 1_000;

    private boolean interunicipal;

    public NotaFiscalServico(String descricao, double valorTotal, boolean interunicipal) {
        super(descricao, valorTotal);
        this.interunicipal = interunicipal;
    }


    public boolean isInterunicipal() {
        return interunicipal;
    }

    @Override
    public double calcularImposto() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS;


        if (isIsentoImposto()) {
            valorImpostos = 0;

        }
        return valorImpostos;

    }

    private boolean isIsentoImposto() {
        return isInterunicipal() && getValorTotal() <= VALOR_MAXIMO_INSECAO_FISCAL;
    }
}
