package accounts;

import entities.Cliente;
import entities.Transacao;
import enums.TipoTransacao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected int numero;
    protected double saldo;
    protected Cliente titular;
    protected List<Transacao> transacoes;

    public Conta(int numero, double saldo, Cliente titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.transacoes = new ArrayList<>();
    }

    public void sacar(double valor) {
        saldo -= valor;
        registrarTransacao(TipoTransacao.SAQUE, valor);
    }

    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao(TipoTransacao.DEPOSITO, valor);
    }

    public void transferir(Conta destino, double valor) {
        numero = destino.numero;
        destino.saldo += valor;
        saldo -= valor;

        registrarTransacao(TipoTransacao.TRANSFERENCIA, valor);
    }

    public void consultarSaldo () {

        System.out.println("Saldo: " + saldo);
    }

    public void consultarTransferencias () {
        transacoes.stream().forEach(System.out::println);
    }

    public void registrarTransacao(TipoTransacao tipo, double valor) {
        Transacao registro = new Transacao(LocalDateTime.now(), tipo, valor);
        transacoes.add(registro);
    }
}
