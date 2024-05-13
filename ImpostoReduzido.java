package strategy2.padrao.projeto;

public class ImpostoReduzido implements ImpostoInterface{

    @Override
    public double calcularImposto(double valor) {
        return valor * 0.05;
    }
}
