package aulas28_33;

import java.util.Scanner;

public class AppAluno {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String[][] matriz = new String[3][2];
		
		boolean deseja = false;
		
		while(!deseja){
			System.out.println("Informe o nome do Aluno: ");
			String nome = in.nextLine();
			
			System.out.println("Informe o numero de matricula: ");
			int matricula = Integer.parseInt(in.nextLine());
			
			System.out.println("Informe o curso: ");
			String curso = in.nextLine();
			
			for(int i=0; i < matriz.length; i++) {
				System.out.println("Informe a disciplina "+ (i+1) + ":");
				matriz[i][0] = in.nextLine();
				for(int j=1; j<matriz[i].length; j++){
					System.out.println("Informe a nota da disciplina: ");
					matriz[i][j] = in.nextLine();
				}
			}
					
			Aluno al = new Aluno(nome, matricula, curso, matriz);
			
			al.getNome();
			al.getCurso();
			al.getMatricula();
			al.getNome();
			
			
			System.out.println("Informe a disciplina para saber se o aluno foi aprovado: ");
			String disciplina = in.nextLine();
			
			if(achaDisciplina(matriz, disciplina)){
				double nota = al.isAprovado(disciplina);
				String a = "";
				if(nota>=7) a = "aprovado!";
				else a = "não aprovado!";
				System.out.println("Nota do Aluno: "+ nota + " " + a);
			}
			else {
				System.out.println("Disciplina não encontrada!");
			}
			
			System.out.println("Deseja sair? 1 para sim, 2 para não: ");
			int resp = Integer.parseInt(in.nextLine());
			
			if(resp==1) deseja = true;
			
		}
	
		
	}
	
	public static boolean achaDisciplina(String[][] matriz, String disciplina) {		
		for(int i=0; i< matriz.length; i++){
			if(matriz[i][0].equalsIgnoreCase(disciplina)) return true;
		}
		return false;	
	}

}
