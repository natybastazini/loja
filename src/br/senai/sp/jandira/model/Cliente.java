package br.senai.sp.jandira.model;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente (int id, String nome, String cpf, String endereco){
        this.id = id;
        this.nome =  nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
}
