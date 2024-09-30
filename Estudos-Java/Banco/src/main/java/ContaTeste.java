public class ContaTeste {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.cliente = "Allan";
        conta1.saldo = 8000;
        conta1.exibeSaldo();

        Conta conta2 = new Conta();
        conta2.cliente = "Lucas";
        conta2.saldo = 5000;
        conta2.exibeSaldo();

        // Realizando operacoes
        conta1.saca(2000);
        conta1.exibeSaldo();

        conta1.deposita(3000);
        conta1.exibeSaldo();

        conta1.transferePara(1500, conta2);
        conta1.exibeSaldo();
        conta2.exibeSaldo();
    }
}
