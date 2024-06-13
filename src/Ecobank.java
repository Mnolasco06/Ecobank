import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ecobank implements Transacctions{


    private Map<String, Double> conta = new HashMap<>();
    private int numeroContaContador = 1;
    private Map<String, Double> cartao = new HashMap<>();
    private int numeroCartaoContador = 1;


    @Override
    public void criarConta(String titularConta) {
        String numeroConta = "A01" + numeroContaContador++;
        conta.put(numeroConta, 0.0);
        System.out.println("Conta criada para: " + titularConta + " com o numero de conta: " + numeroConta);
    }

    @Override
    public void deposito(String numeroConta, double valor) {
        if (conta.containsKey(numeroConta)) {
            conta.put(numeroConta, conta.get(numeroConta) + valor);
            System.out.println("Deposito " + valor + " para conta " + numeroConta);
        } else {
            System.out.println("Número de conta " + numeroConta + " não existe.");
        }

    }

    @Override
    public void transferencia(String desdeConta, String paraConta, double valor) {
        if (conta.containsKey(desdeConta) && conta.containsKey(paraConta)) {
            if (conta.get(desdeConta) >= valor) {
                conta.put(desdeConta, conta.get(desdeConta) - valor);
                conta.put(paraConta, conta.get(paraConta) + valor);
                System.out.println("Transferiu " + valor + " desde conta " + desdeConta + " para conta " + paraConta);
            } else {
                System.out.println("Saldo insuficiente " + desdeConta);
            }
        } else {
            System.out.println("Uma ou duas numero de conta não existe.");
        }

    }


    @Override
    public void criarCartao(String titularConta, String numeroConta) {
        String numeroCartao = "A012555212712354" + numeroCartaoContador++;
        cartao.put(numeroCartao, 0.0);
        System.out.println("Cartão criada para: " + titularConta + "com o numero de cartão: " + numeroCartao);

    }

    @Override
    public void saque(String numeroConta, double valor) {
        if (conta.containsKey(numeroConta)) {
            if (conta.get(numeroConta) >= valor) {
                conta.put(numeroConta, conta.get(numeroConta) - valor);
                System.out.println("Saque " + valor + " desde conta " + numeroConta);
            } else {
                System.out.println("Saldo insuficiente na conta " + numeroConta);
            }
        } else {
            System.out.println("Número de conta " + numeroConta + " não existe.");
        }

    }

    @Override
    public double saldo(String numeroConta) {
        if (conta.containsKey(numeroConta)) {
            return conta.get(numeroConta);
        } else {
            System.out.println("Número de conta " + numeroConta + " não existe.");
            return 0.0;
        }
    }
}



