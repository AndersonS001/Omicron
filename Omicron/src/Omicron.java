import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Omicron {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char entrada[] = new char[256];
		char saida[][] = new char[1024][32];
		
		System.out.println("Digite em que a informa��o que sera inserida");
		entrada = sc.nextLine().toCharArray();
		
		System.out.println("Digite a linha em que a informa��o que sera inserida");
		int linha = sc.nextInt();
				
		System.out.println("Digite a coluna em que a informa��o que sera inserida");
		int coluna = sc.nextInt();		

		/*for(int j = 0; j < 1024; j++)
			for(int i = 0; i < 32; i++)
				saida[j][i] = ' ';
			*/
		
		saida = Arquivo.LeArquivo();
		for(int i=0; i < entrada.length; i++)
		{
			try {
				saida[linha][coluna + i] = entrada[i];	
			}catch(ArrayIndexOutOfBoundsException e)
			{
				coluna = i * (-1);
				linha++;
				i--;
			}
		}
		
		Arquivo.Manipulacao(saida);
	}
}
