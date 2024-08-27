
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner numeroScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero do seu banco");
        int numero = numeroScanner.nextInt();
        
        Scanner agenciaScanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da sua agencia");
        String agencia = agenciaScanner.next();

        Scanner nomeScanner = new Scanner(System.in);
        System.out.println("Agora digite o seu nome e sobrenome");
        String nome = nomeScanner.next();

        Scanner saldoScanner = new Scanner(System.in);
        System.out.println("Por favor informe o seu saldo");
        Double saldo = saldoScanner.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
    }
}
