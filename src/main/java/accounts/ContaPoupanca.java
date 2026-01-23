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
    public void depositar(double valor) {
        if (valor > 500) {
            System.out.println("Transferência para poupança não pode ultrapassar 500 reais.");
            return;
        }

        super.depositar(valor);
    }
}
