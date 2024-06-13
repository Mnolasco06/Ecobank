import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Ecobank ecobank = new Ecobank();



        while (true){
            System.out.println("Bem-vindo a Ecobank suloções financieras!");
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Criar conta online");
            System.out.println("2. Depositar");
            System.out.println("3. Saque");
            System.out.println("4. Transferencia");
            System.out.println("5. Ver saldo");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opção = scanner.nextInt();
            scanner.nextLine();

    switch (opção){
        case 1:
            System.out.print("Digite o nome do titular da conta: ");
            String titularConta = scanner.nextLine();
            ecobank.criarConta(titularConta);
            break;
        case 2:
            System.out.print("Digite o número da conta: ");
            String depositoNumeroConta = scanner.nextLine();
            System.out.print("Digite valor do deposito: ");
            double depositoValor = scanner.nextDouble();
            ecobank.deposito(depositoNumeroConta, depositoValor);
            break;
        case 3:
            System.out.print("Digite o número da conta: ");
            String saqueNumeroConta = scanner.nextLine();
            System.out.print("Digite o valor do saque: ");
            double saqueValor = scanner.nextDouble();
            ecobank.saque(saqueNumeroConta, saqueValor);
            break;
        case 4:
            System.out.print("Digite o número da conta: ");
            String desdeConta = scanner.nextLine();
            System.out.print("Digite o número da conta: ");
            String paraConta = scanner.nextLine();
            System.out.print("Digite o valor da transferencia: ");
            double transferValor = scanner.nextDouble();
            ecobank.transferencia(desdeConta, paraConta, transferValor);
            break;
        case 5:
            System.out.print("Digite o número da conta: ");
            String saldoNumeroConta = scanner.nextLine();
            double saldo1 = ecobank.saldo(saldoNumeroConta);
            System.out.println("Saldo: " + saldo1);
            break;
        case 0:
            System.out.println("Saindo...");
            scanner.close();
            return;
        default:
            System.out.println("Escolha incorreta. Por favor, tente de novo. ");
    }

            System.out.println();
    }





    }


}
