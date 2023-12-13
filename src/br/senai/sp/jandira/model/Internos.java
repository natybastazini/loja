package br.senai.sp.jandira.model;

public class Internos extends Produto {

    private int ram, memoria;

    public Internos(int id, String nome, int quantidade, double preco, String fornecedor) {
        super(id, nome, quantidade, preco, fornecedor);
        this.ram = 0;
        this.memoria = 0;
    }

}
