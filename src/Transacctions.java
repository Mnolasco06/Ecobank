public interface Transacctions {

    void criarConta(String titularConta);
    void deposito(String numeroConta, double valor);
    void transferencia(String desdeConta, String paraConta, double valor);
    void criarCartao(String titularConta, String numeroConta);
    void saque(String numeroConta, double valor);
    double saldo(String numeroConta);


}
