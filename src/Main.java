public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        alunosSexoMasculino();
        alunosSexoFeminino();
    }

    private static void alunosSexoMasculino() {
        System.out.println("\n***** Lista sexo masculino *****");
        String aluno1 = "Carlos Hnrrique sexo  M ";
        String aluno2 = "Daniel Paiva sexo  M ";


        String[] alunos2 = aluno2.split(" ", 1);
        System.out.println(("\nNome: " + alunos2[0]));

        String[] alunos1 = aluno1.split(" ", 1);
        System.out.println(("\nNome: " + alunos1[0]));
    }

    private static void alunosSexoFeminino() {
        System.out.println("\n***** Lista Sexo Feminino *****");
        String aluno1 = "Sabrina Souza sexo  F ";
        String aluno2 = "Tais Melo sexo  F ";

        String[] alunos1 = aluno1.split(" ", 1);
        System.out.println(("\nNome: " + alunos1[0]));

        String[] alunos2 = aluno2.split(" ", 1);
        System.out.println(("\nNome: " + alunos2[0]));
    }
}