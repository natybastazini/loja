package br.senai.sp.jandira.model;

public class Perifericos extends Produto{

    private String cor;

    public Perifericos(int id, String nome, int quantidade, double preco, String fornecedor) {
        super(id, nome, quantidade, preco, fornecedor);
        this.cor = "rosa";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
