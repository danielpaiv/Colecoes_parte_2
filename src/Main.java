public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        alunosSexoMasculino();
        alunosSexoFeminino();

        Painel painel =new Painel();

//        System.out.println(alunosSexoFeminino());
//        System.out.println(alunosSexoMasculino());
    }

    static boolean alunosSexoMasculino() {
        System.out.println("\n***** Lista sexo masculino *****");
        String aluno1 = "Carlos Hnrrique sexo  M ";
        String aluno2 = "Daniel Paiva sexo  M ";
        String aluno3 = "José Marcedo sexo  M ";
        String aluno4 = "Thiago Melo sexo  M ";


        String[] alunos2 = aluno2.split(" ", 1);
        System.out.println(("\nNome: " + alunos2[0]));

        String[] alunos1 = aluno1.split(" ", 1);
        System.out.println(("Nome: " + alunos1[0]));

        String[] alunos3 = aluno3.split(" ", 1);
        System.out.println(("Nome: " + alunos3[0]));

        String[] alunos4 = aluno4.split(" ", 1);
        System.out.println(("Nome: " + alunos4[0]));
        return false;
    }

    static boolean alunosSexoFeminino() {
        System.out.println("\n***** Lista Sexo Feminino *****");
        String aluno1 = "Sabrina Souza sexo  F ";
        String aluno2 = "Tais Melo sexo  F ";
        String aluno3 = "Diana Paiva  F ";
        String aluno4 = "Dione Araujo  F ";

        String[] alunos1 = aluno1.split(" ", 1);
        System.out.println(("\nNome: " + alunos1[0]));

        String[] alunos2 = aluno2.split(" ", 1);
        System.out.println(("Nome: " + alunos2[0]));

        String[] alunos3 = aluno3.split(" ", 1);
        System.out.println(("Nome: " + alunos3[0]));

        String[] alunos4 = aluno4.split(" ", 1);
        System.out.println(("Nome: " + alunos4[0]));
        return false;
    }

}