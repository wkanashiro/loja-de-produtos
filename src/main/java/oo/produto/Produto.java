package oo.produto;

public class Produto {

    private String nome;
    protected double preco;
    private double desconto;
    private int qtdeEmEstoque;
    private static int totalDeProdutos = 0;
    protected int atributoTeste;
    
    Produto(String nome, double preco, double desconto, int qtdeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
        this.qtdeEmEstoque = qtdeEmEstoque;
        Produto.totalDeProdutos++;
        System.out.println("Acionando Construtor 1 de Produto");
    }
    
    Produto() {
        Produto.totalDeProdutos++;
        System.out.println("Acionando Construtor 2 de Produto");
    }
    
    public static int getTotalDeProdutos() {
        return Produto.totalDeProdutos;
    }
    
    private boolean verificaQuantidadeEstoque(int quantidade) {
        if (this.qtdeEmEstoque < quantidade) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void diminuiQuantidadeEstoque(int quantidade) {
        
        if (this.verificaQuantidadeEstoque(quantidade) == true) {
            this.qtdeEmEstoque = this.qtdeEmEstoque - quantidade;
            System.out.println("Quantidade em estoque decrementada com sucesso!!");
            System.out.println("Quantidade em estoque atual: " + this.qtdeEmEstoque);
        }
        else {
            System.out.println("Não foi possível diminuir a quantidade em estoque.");
        }
    }
    
    //getNomeDoAtributo
    public int getQtdeEmEstoque() {
        return this.qtdeEmEstoque;
    }
    
    //setNomeDoAtributo
    public void setQtdeEmEstoque(int qtdeEmEstoque) {
        this.qtdeEmEstoque = qtdeEmEstoque;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        //return this.preco * (1 - this.desconto / 100);
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return this.desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    public void mostrarInformacoes() {
        System.out.println("\n\nNome do Produto: " + this.getNome());
        System.out.printf("Preço: R$ %.2f\n", this.getPreco());
        System.out.println("## Quantidade em Estoque: " + this.getQtdeEmEstoque());
    }
}
/*    
    String nome = "Caneta";
    double preco = 1.99;
    double desconto = 5.5;
    int qtdeEmEstoque = 10;
    
    //Fornecedor f = new Fornecedor();    
    
    boolean diminuiQuantidadeEstoque(int quantidade) {
        
        if (this.qtdeEmEstoque < quantidade) {
            return false;
        }
        else {
            this.qtdeEmEstoque = this.qtdeEmEstoque - quantidade;
            return true;
        }
    }
    
    void aumentaQuantidadeEstoque(int quantidade) {
        //this.qtdeEmEstoque = this.qtdeEmEstoque + quantidade;
        this.qtdeEmEstoque += quantidade;
    }
    
    void incrementaDesconto(double v) {
        this.desconto += v;
    }
    
    boolean decrementaDesconto(double v) {
        //p2.desconto
        if (this.desconto < v) {
            return false;
        }
        else {
            this.desconto -= v;
            return true;
        }
    }
    
    boolean transfereDescontoPara(Produto destino, double valor) {
        
        if (this.decrementaDesconto(valor) == true) {
            // consegui decrementar o desconto
            // para poder transferir a outro produto
        
            destino.incrementaDesconto(valor);
            
            return true;
        }
        else {
            // não foi possível decrementar o desconto
            return false;
        }
        
    }
}

*/