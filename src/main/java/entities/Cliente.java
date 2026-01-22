package entities;

import accounts.Conta;

import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String email;
    private List<Conta> contas;

    public Cliente (String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public List<Conta> listarContas () {
        return contas;
    }
}
