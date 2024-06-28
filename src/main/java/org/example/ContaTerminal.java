package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o saldo!");
        String saldoDouble = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente!");
        String nomeCliente = scanner.next();

        double saldo = Double.parseDouble(String.valueOf(saldoDouble));

        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }

}
