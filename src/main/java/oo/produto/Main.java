package oo.produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        ProdutoVirtual pv = new ProdutoVirtual("FIFA 2021", 500.00, 10.0, 50, "FJRM-SPRK-02KF-50$L", 120);
        
        pv.mostrarInformacoes();
        
        ProdutoFisico pf = new ProdutoFisico("Celular", 500.00, 0, 20, 350, "Preto Fosco");
        
        pf.mostrarInformacoes();
        /*
        ProdutoVirtual pv = new ProdutoVirtual();
        
        pv.setNome("FIFA 2021");
        pv.setPreco(509.50);
        pv.setQtdeEmEstoque(50);
        pv.setDesconto(10.5);
        
        pv.setChaveSerial("FJRM-SPRK-02KF-50$L");
        pv.setValidadeDias(120);
        */
        //Produto p = new Produto("FIFA 2021", 509.50, 10.5, 50);
        //p.mostrarInformacoes();
        
        
        
        //System.out.println("Atributo Teste: " + pv.atributoTeste);
        
        
        
        //ProdutoFisico pf = new ProdutoFisico();
        
        /*
        Produto p1 = new Produto("Celular", 1999.90, 15.50, 5);
        
        System.out.println("Nome do Produto: " + p1.getNome());
        System.out.printf("Valor: R$ %.2f\n", p1.getPreco());
        System.out.printf("Desconto: %.2f %%\n", p1.getDesconto());
        System.out.println("Qt Estoque: " + p1.getQtdeEmEstoque());
        
        Produto p2 = new Produto();
        
        System.out.println("Informe o nome, preço, % desconto e qtde em estoque:");
        p2.setNome(in.nextLine());
        p2.setPreco(in.nextDouble());
        p2.setDesconto(in.nextDouble());
        p2.setQtdeEmEstoque(in.nextInt());
        
        System.out.println("Nome do Produto: " + p2.getNome());
        System.out.printf("Valor: R$ %.2f\n", p2.getPreco());
        System.out.printf("Desconto: %.2f %%\n", p2.getDesconto());
        System.out.println("Qt Estoque: " + p2.getQtdeEmEstoque());
        
        System.out.println("Total de Produtos criados: " + Produto.getTotalDeProdutos());
        */
       
    }
}
        
        
        /*
        Scanner in = new Scanner(System.in);
        int quant = 0;
        
        Produto p1 = new Produto();
        p1.nome = "Lápis";
        p1.preco = 1.50;
        p1.desconto = 0.0;
        p1.qtdeEmEstoque = 0;

        System.out.println("Produto 1: " + p1.nome);
        System.out.println("Qtd Estoque: " + p1.qtdeEmEstoque);
        
        p1.aumentaQuantidadeEstoque(5);
        
        Produto p2 = new Produto();
        p2.nome = "Borracha";
        p2.preco = 3.50;
        p2.desconto = 5.0;
        p2.qtdeEmEstoque = 1;

        System.out.println("Produto 2: " + p2.nome);
        System.out.println("Qtd Estoque: " + p2.qtdeEmEstoque);
        
        System.out.println("Informe o valor a ser aumentado no estoque:");
        quant = in.nextInt();
        
        p2.aumentaQuantidadeEstoque(quant);   
    }
}
*/