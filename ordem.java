package Ordenacao;

public class ordem {

	public static void main(String[] args) {
		Aluno[] alunos = new Aluno[10];
		
		alunos[0] = new Aluno("Anselmo",5.0);
		alunos[1] = new Aluno("Andreia",3.0);
		alunos[2] = new Aluno("Carlos",2.0);
		alunos[3] = new Aluno("Pedro",4.0);
		alunos[4] = new Aluno("Luis",6.0);
		alunos[5] = new Aluno("Josea",1.0);
		alunos[6] = new Aluno("Joseb",3.0);
		alunos[7] = new Aluno("Josec",6.0);
		alunos[8] = new Aluno("Josec",6.0);
		alunos[9] = new Aluno("Josec",6.0);

		QuickSort.ordenar(alunos,0,9);

		for (int i=0;i<alunos.length;i++){
		System.out.print(alunos[i].getNome()+" ");
		System.out.print(alunos[i].getNota());
		System.out.println();
		}

	}

}
