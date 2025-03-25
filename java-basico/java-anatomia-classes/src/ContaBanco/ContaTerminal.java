package ContaBanco;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite um numero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Por favor, digite sua agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, informe seu nome: ");
        String nomeClinte = scanner.next();

        System.out.println("Por favor, digite seu saldo para saque: ");
        int saldo = scanner.nextInt();

        System.out.println("Ola " + nomeClinte + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque" );
    }   
}
