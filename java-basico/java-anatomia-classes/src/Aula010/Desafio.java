package Aula010;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        System.out.println("Digite o seu salario: ");
        double valorSalario = leitorDeEntradas.nextDouble();
        System.out.println("Digite o vaor do seu beneficio: ");
        double valorBeneficios = leitorDeEntradas.nextDouble();
        System.out.println("Calculando...");
        
        double valorDeImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorDeImposto = 0.05 * valorSalario;
        } else if (valorSalario > 1100 && valorSalario <= 2500){
            valorDeImposto = 0.10 * valorSalario;
        }else {
            valorDeImposto = 0.15 * valorSalario;
        }

        double saida = valorSalario - valorDeImposto + valorBeneficios;
        System.out.println(" ");
        System.out.println("O valor calculado foi: ");
        System.out.println(String.format("%.2f", saida));
    }    
}
