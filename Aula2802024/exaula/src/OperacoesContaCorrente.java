public interface OperacoesContaCorrente {
    double realizaDeposito(ContaCorrente contaCorrente, double deposito);
    boolean realizaSaque(ContaCorrente contaCorrente, double saque);
}