package accounts;

import entities.Cliente;

public class ContaCorrente extends Conta {
    public ContaCorrente (int numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor + saldo * 0.1;
    }
}
