package strategy2.padrao.projeto;

public class Produto {
    private double preco;
    private ImpostoInterface impostoInterface;

    public Produto(double preco, ImpostoInterface impostoInterface){
        this.preco = preco;
        this.impostoInterface = impostoInterface;
    }

    public double precoComImposto(){
        return preco + impostoInterface.calcularImposto(preco);
    }

    public void mudarEstrategia(ImpostoInterface impostoInterface){
        this.impostoInterface = impostoInterface;
    }

}
