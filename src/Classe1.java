import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
	//Calculo sobre media de um aluno**
		Scanner LeitorNumero = new Scanner (System.in);
		Scanner LeitorLetra = new Scanner (System.in);
		double Soma = 0;
		double Nota;
		String Resposta;
		do {
			System.out.println("Digite a quantidade de provas aplicadas: ");
			int Quantidade;
			Quantidade = LeitorNumero.nextInt();
			int i=1;
			while (i<=Quantidade) {
				System.out.println("Digite uma nota:");
				Nota = LeitorNumero.nextDouble();
				Soma = Nota + Soma;
				i++;
				
				
				
		}
			System.out.println("Media: " + (Soma / Quantidade));
		    System.out.println("Deseja realizar outra media? ");
		    Resposta = LeitorLetra.nextLine();
		    
		

	}
    while (Resposta.equals("Sim"));
		
}
}
