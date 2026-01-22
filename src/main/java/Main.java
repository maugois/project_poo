import accounts.ContaCorrente;
import entities.Cliente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inData = new Scanner(System.in);
        
        System.out.println("\n--- SISTEMA BANCÁRIO ---\n");
        System.out.println("Informe o número da opção desejada: \n");

        System.out.println("1 - Depositar \n" +
                "2 - Sacar \n" +
                "3 - Transferir (Após selecionado, as seguintes opções aparecerão) \n" +
                "\t1 - De accounts.Conta Corrente para Poupança \n" +
                "\t2 - Da Poupança para accounts.Conta Corrente \n" +
                "4 - Consultar Transações \n" +
                "5 - Consultar Saldo \n" +
                "0 - Sair\n");

        String option = inData.nextLine();

        System.out.println("Informe seu nome: ");
        String name = inData.nextLine();
        System.out.println("Informe seu cpf: ");
        String cpf = inData.nextLine();
        System.out.println("Informe seu e-mail: ");
        String email = inData.nextLine();

        Cliente cli = new Cliente(name, cpf, email);

        switch (option) {
            case "1": // depositar
                ContaCorrente deposit = new ContaCorrente(1010101, 1000, cli);

                System.out.println("Informe o valor para realizar o depósito!");
                deposit.depositar(inData.nextDouble());
                break;
            case "2": // sacar
                ContaCorrente sake = new ContaCorrente(1010101, 1000, cli);

                System.out.println("Informe o valor para realizar o saque!");
                sake.sacar(inData.nextDouble());
                break;
            case "3": // Transferir
                ContaCorrente transfer = new ContaCorrente(1010101, 1000, cli);

                System.out.println("Informe o valor para realizar o saque!");
                transfer.transferir(transfer, inData.nextDouble());
                break;
            case "4": // Consultar Transações
                ContaCorrente consultTransfer = new ContaCorrente(1010101, 1000, cli);

                consultTransfer.consultarTransferencias();
                break;
            case "5": // Consultar Saldo
                ContaCorrente consultBalance = new ContaCorrente(1010101, 1000, cli);

                consultBalance.consultarSaldo();
                break;
            case "0": // Sair

                break;
        }
    }
}
