package Java;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Nome do Cliente:");
        String name = in.nextLine();


        System.out.println("Linha:");
        String numero_linha = in.nextLine();


        System.out.println("Saldo inicial da linha :");
        int saldoLinha = Integer.parseInt(in.nextLine());

        Telefone telefone = new Telefone(numero_linha, saldoLinha);

        System.out.println("Saldo da iniclal da conta:");
        int saldoConta = Integer.parseInt(in.nextLine());
        Conta conta = new Conta(saldoConta);


        Cliente cliente = new Cliente(name, telefone, conta);

        System.out.println("Valor da recarga?:");
        int valorRecarga = Integer.parseInt(in.nextLine());
        String mensagem = RecargaCelular.recargaCelular(cliente, valorRecarga);

        System.out.println(mensagem);


    }
}