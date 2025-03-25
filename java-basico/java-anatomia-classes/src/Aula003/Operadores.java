package Aula003;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem " + "Java";
        System.out.println(nomeCompleto);


        int numero =5;
        numero ++;
        System.out.println(numero);

        boolean variavel = true;

        variavel =! variavel;
        System.out.println(variavel);


        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ?"verdadeiro" : "falso";

        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a nuemroDois ?" + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de nuemroDois ?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é maior de nuemroDois ?" + simNao);

        String nomeUm = "Moquidesia";
        String NomeDois = new String("Moquidesia");

        System.out.println(nomeUm.equals(NomeDois));

        boolean condicao01 = true;
        boolean condicao02 = false;

        if(condicao01 && condicao02){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao01 || condicao02){
            System.out.println("Uma das condições é verdadeira");
    }
    System.out.println("fim");
    }
}