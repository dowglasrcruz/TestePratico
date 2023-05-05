package teste;

import Java.Cliente;
import Java.Conta;
import Java.RecargaCelular;
import Java.Telefone;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class ValidadorTest {
    @Test
    public void deveRealizarRecarga() {
        String name = "Jose";
        String numero_linha = "11988888888";
        int saldoLinha = 50;

        Telefone telefone = new Telefone(numero_linha, saldoLinha);

        int saldoConta = 10;
        Conta conta = new Conta(saldoConta);
        Cliente cliente = new Cliente(name, telefone, conta);

        int valorRecarga = 10;
        int saldoTelefone = saldoLinha + valorRecarga;

        String mensagem = RecargaCelular.recargaCelular(cliente, valorRecarga);
        Assertions.assertEquals("Recarga concluída. Seu novo saldo é: " + saldoTelefone, mensagem);
    }

    @Test
    public void naoDeveRealizarRecarga() {
        String name = "Jose";
        String numero_linha = "11988888888";
        int saldoLinha = 50;

        Telefone telefone = new Telefone(numero_linha, saldoLinha);

        int saldoConta = 10;
        Conta conta = new Conta(saldoConta);
        Cliente cliente = new Cliente(name, telefone, conta);

        int valorRecarga = 11;

        String mensagem = RecargaCelular.recargaCelular(cliente, valorRecarga);
        Assertions.assertEquals("Saldo insuficiente. Recarga:" + valorRecarga + "Saldo: " + cliente.getConta().getSaldo(), mensagem);

    }
}
