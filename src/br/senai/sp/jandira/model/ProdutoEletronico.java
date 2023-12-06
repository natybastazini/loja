package br.senai.sp.jandira.model;

public class ProdutoEletronico extends Produto{

    private String marca;

    public ProdutoEletronico(int id, String nome, int quantidade, double preco, String fornecedor, String marca) {
        super(id, nome, quantidade, preco, fornecedor);
        this.marca = marca;
    }
}
