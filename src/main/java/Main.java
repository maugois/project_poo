import accounts.ContaCorrente;
import accounts.ContaPoupanca;
import entities.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inData = new Scanner(System.in);
        Cliente cliente = new Cliente("Vitor", "321.445.555-88", "cliente@gmail.com");
        ContaCorrente contaCorrente = new ContaCorrente(123456, 1500, cliente);
        ContaPoupanca contaPoupanca = new ContaPoupanca(654321, 10000, cliente);

        cliente.adicionarConta(contaCorrente);
        cliente.adicionarConta(contaPoupanca);

        int opcao;

        do {
            System.out.println("\n--- SISTEMA BANCÁRIO ---");
            System.out.println("Informe o número da opção desejada:");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar Transações");
            System.out.println("5 - Consultar Saldo");
            System.out.println("0 - Sair");

            opcao = inData.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Valor do depósito: ");
                    double valor = inData.nextDouble();
                    contaCorrente.depositar(valor);
                }

                case 2 -> {
                    System.out.print("Valor do saque: ");
                    double valor = inData.nextDouble();
                    contaCorrente.sacar(valor);
                }

                case 3 -> {
                    System.out.println("1 - Conta Corrente → Poupança");
                    System.out.println("2 - Poupança → Conta Corrente");
                    int tipo = inData.nextInt();

                    System.out.print("Valor da transferência: ");
                    double valor = inData.nextDouble();

                    if (tipo == 1) {
                        contaCorrente.transferir(contaPoupanca, valor);
                    } else if (tipo == 2) {
                        contaPoupanca.transferir(contaCorrente, valor);
                    } else {
                        System.out.println("Opção inválida.");
                    }
                }

                case 4 -> contaCorrente.consultarTransferencias();

                case 5 -> contaCorrente.consultarSaldo();

                case 0 -> System.out.println("Encerrando sistema...");

                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
