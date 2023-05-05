package Java;

public class RecargaCelular {
    public static String recargaCelular(Cliente cliente, int valorRecarga) {
        if (valorRecarga > cliente.getConta().getSaldo()) {
            return "Saldo insuficiente. Recarga:" + valorRecarga + "Saldo: " + cliente.getConta().getSaldo();
        } else if (valorRecarga <= cliente.getConta().getSaldo()) {
            int saldoConta = cliente.getConta().getSaldo();
            saldoConta -= valorRecarga;
            cliente.getConta().setSaldo(saldoConta);

            int saldoTelefone = cliente.getTelefone().getSaldo();
            saldoTelefone += valorRecarga;


            return "Recarga concluída. Seu novo saldo é: " + saldoTelefone;
        }


        return null;
    }
}
