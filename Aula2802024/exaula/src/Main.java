public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("123", "456789", 1000.0);
        OperacoesContaCorrente operacoesContaCorrente = new OperacoesContaCorrenteImpl();

        System.out.println("Saldo inicial: " + conta.getSaldo());

        // Teste de depósito
        double novoSaldoDeposito = operacoesContaCorrente.realizaDeposito(conta, 500.0);
        System.out.println("Novo saldo após depósito: " + novoSaldoDeposito);

        // Teste de saque
        boolean saqueBemSucedido = operacoesContaCorrente.realizaSaque(conta, 700.0);
        System.out.println("Saque bem-sucedido: " + saqueBemSucedido);
        System.out.println("Saldo após saque: " + conta.getSaldo());

        // Tentativa de saque com valor maior que o saldo
        saqueBemSucedido = operacoesContaCorrente.realizaSaque(conta, 1000.0);
        System.out.println("Saque bem-sucedido: " + saqueBemSucedido);
        System.out.println("Saldo após segunda tentativa de saque: " + conta.getSaldo());
    }
}
