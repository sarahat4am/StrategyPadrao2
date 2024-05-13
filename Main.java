package strategy2.padrao.projeto;

public class Main {
    public static void main(String[]args){
        Produto produto = new Produto(20, new ImpostoNormal());
        System.out.println("Preço do produto com o imposto normal: " +produto.precoComImposto());

        produto.mudarEstrategia(new ImpostoReduzido());
        System.out.println("Preço do produto com imposto reduzido: " +produto.precoComImposto());
    }
}
