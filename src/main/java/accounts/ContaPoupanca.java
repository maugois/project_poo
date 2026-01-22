package accounts;

import entities.Cliente;
import entities.Transacao;
import enums.TipoTransacao;

import java.util.List;

public class ContaPoupanca extends Conta {
    public ContaPoupanca (int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void transferir(Conta destino, double valor) {
        if (valor < 500) {
            numero = destino.numero;
            destino.saldo += valor;
            saldo -= valor;
        } else {
            System.out.println("Não é possível efetuar essa transação! Transferências para Poupança não podem ultrapassar o " +
                    "valor individual de 500 reais.");
        }
        registrarTransacao(TipoTransacao.TRANSFERENCIA, valor);
    }
}
