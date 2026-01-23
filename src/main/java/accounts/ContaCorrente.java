package accounts;

import entities.Cliente;
import enums.TipoTransacao;

public class ContaCorrente extends Conta {
    public ContaCorrente (int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        double taxa = valor * 0.10;
        double total = valor + taxa;

        if (total > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }

        saldo -= total;
        registrarTransacao(TipoTransacao.SAQUE, valor);
    }
}
