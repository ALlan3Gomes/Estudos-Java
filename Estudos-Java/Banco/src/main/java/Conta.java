public class Conta {
    String cliente;
    double saldo;

    void exibeSaldo() {
        System.out.println("\nSeu saldo e:" + saldo);
    }

    void saca(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("\nSaque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de " + valor);
        }
    }

    void deposita(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nDeposito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("\nValor invalido para deposito.");
        }
    }

    void transferePara(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.deposita(valor);
            System.out.println("Transferencia de " + valor + " realizada com sucesso para " + destino.cliente);
        } else {
            System.out.println("Saldo insuficiente para transferencia de " + valor);
        }
    }
}
