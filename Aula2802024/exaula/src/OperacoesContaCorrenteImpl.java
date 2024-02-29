public class OperacoesContaCorrenteImpl implements OperacoesContaCorrente {

    @Override
    public double realizaDeposito(ContaCorrente contaCorrente, double deposito) {
        if (deposito <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        contaCorrente.setSaldo(contaCorrente.getSaldo() + deposito);
        return contaCorrente.getSaldo();
    }

    @Override
    public boolean realizaSaque(ContaCorrente contaCorrente, double saque) {
        if (saque <= contaCorrente.getSaldo()) {
            contaCorrente.setSaldo(contaCorrente.getSaldo() - saque);
            return true;
        } else {
            return false;
        }
    }
}
