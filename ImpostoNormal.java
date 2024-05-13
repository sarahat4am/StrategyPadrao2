package strategy2.padrao.projeto;

public class ImpostoNormal implements ImpostoInterface{

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.18;
    }
}
