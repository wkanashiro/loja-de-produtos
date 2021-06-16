package oo.produto;
        
public class ProdutoVirtual extends Produto {
   
    private String chaveSerial;
    private int validadeDias;
    
    ProdutoVirtual(String nome, double preco, double desconto, int qtdeEmEstoque, String chaveSerial, int validadeDias) {
        super(nome, preco, desconto, qtdeEmEstoque);
        // Chamada ao construtor de Produto com parâmetros
        
        this.chaveSerial = chaveSerial;
        this.validadeDias = validadeDias;
    }
    
    /*
    ProdutoVirtual() {
        System.out.println("Chamada ao construtor sem parâmetros de ProdutoVirtual");
    }
    */

    public String getChaveSerial() {
        return chaveSerial;
    }

    public void setChaveSerial(String chaveSerial) {
        this.chaveSerial = chaveSerial;
    }

    public int getValidadeDias() {
        return validadeDias;
    }

    public void setValidadeDias(int validadeDias) {
        this.validadeDias = validadeDias;
    }
    
    @Override
    public double getPreco() {
        return this.preco * 0.9; // 10% (this.preco - (this.preco * 0.1))
    }    
    
    @Override
    public void mostrarInformacoes() {
        
        super.mostrarInformacoes(); // Chamada ao método na classe Produto
        //this.atributoTeste = 10;
        System.out.println("Chave para Ativação: " + this.chaveSerial);
        System.out.println("Validade: " + this.validadeDias + " dias");
        System.out.println("\n");
    }
    
    
    

}
