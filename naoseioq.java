package vey;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class vey {
	static void manodoceu() throws FileNotFoundException {
		 Scanner imput = new Scanner(System.in);
			Scanner arquivoNomes = new Scanner(new File("manodoceu"));
			int n=0;
			System.out.println(" Ótimo os voos disponíveis com seus numeros, origem, destino e classe estao escritos respectivamente.");
			System.out.println(" Qual voo o(a) Senhor(a) deseja?");
			
			
			String numero[] = new String[100];
			String origem[] = new String[100];
			String destino[] = new String[100];
			String economica[] = new String[100];
			String executiva[] = new String[100];
			String primeiraclasse[] = new String[100];
			int n1 = 0;
			String linha;
			while(arquivoNomes.hasNextLine()) {
				linha = arquivoNomes.nextLine();
				String[] token = linha.split("-");
				numero[n1] = token[0];
				origem[n1] = token[1];
				destino[n1] = token[2];
				economica[n1] = token[3];
				executiva[n1] = token[4];
				primeiraclasse[n1] = token[5];
				n1++;
			}		
		 	for(int c = 0;c<n1;c++){
				System.out.println(numero[c]+" -> De: "+origem[c]+" para "+destino[c]+
						   " Classe econômica: R$ "+economica[c]+" Classe Executiva: R$ "+executiva[c]+
						  " Primeira Classe: R$"+primeiraclasse[c]);
			}			
			System.out.print("Digite o voo desejado: ");
			int opt = imput.nextInt();
			salvaDados(opt);
			
			
		}
		
  private static void salvaDados(int opt) {
		
		
	}

static void manodoceu1()throws FileNotFoundException{
	   
  }
	public static void main(String[] args) throws FileNotFoundException {
		Scanner imput = new Scanner(System.in);
		System.out.println("Olá, bem vindo a companhia aérea Mano do Céu");
		System.out.println("O que você deseja?"
				+ "\n 1.Fazer cadastro."
				+ "\n 2.Comprar um voo."
				+ "\n 3.Fazer login.");
		int i = imput.nextInt();
		if(i == 2) {
			manodoceu();
		}
	}
}
