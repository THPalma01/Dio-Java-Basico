package Aula007;

public class ExemploForArrey {
    public static void main(String[] args) {
        String alunos[] = {"Felipe","Jonas","Juilia","Marcos"};

        /*
        for(int x = 0; x < alunos.length; x++){
            System.out.println("O aluno de indice x=" + x + " é " + alunos [x]);
        }
        */

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é " + aluno);
        }
    }
}
