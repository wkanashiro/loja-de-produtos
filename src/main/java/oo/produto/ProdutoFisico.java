
package oo.produto;

public class ProdutoFisico extends Produto {
    
    private double pesoEmGramas;
    private String cor;

    public ProdutoFisico(String nome, double preco, double desconto, int qtdeEmEstoque, double pesoEmGramas, String cor) {
        super(nome, preco, desconto, qtdeEmEstoque);
        this.pesoEmGramas = pesoEmGramas;
        this.cor = cor;
    }

    public double getPesoEmGramas() {
        return pesoEmGramas;
    }

    public void setPesoEmGramas(double pesoEmGramas) {
        this.pesoEmGramas = pesoEmGramas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    @Override
    public double getPreco() {
        return this.preco - 10; // R$ 10 de desconto
    } 
    
    @Override
    public void mostrarInformacoes() {
        
        super.mostrarInformacoes(); // Chamada ao método na classe Produto

        System.out.println("Peso: " + this.pesoEmGramas + " g");
        System.out.println("Cor: " + this.cor);
        System.out.println("\n");
    }
    
    
    
    
}
