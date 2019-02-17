import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class Arquivo {
		static String path = "omicron.txt";
		
		/**
		 * Garante que o arquivo sempre exista
		 * @param path (localização)
		 * @throws IOException
		 */
		private static void ArquivoExiste(String path) throws IOException {
			File arquivo = new File(path);
			
			if(!arquivo.exists()) {
				arquivo.createNewFile();
				
				char[][] branco = new char[1024][32];
				for(int j = 0; j < 1024; j++)
					for(int i = 0; i < 32; i++)
						branco[j][i] = ' ';
					Manipulacao(branco);
			}
		}
		
		public static char[][] LeArquivo() throws IOException {
	    	ArquivoExiste(path);
	    	char[][] ret = new char[1024][32];	
	    	int i = 0;
	        BufferedReader buffRead = new BufferedReader(new FileReader(path));
	        while (buffRead.ready()) {
	        	char  linha[] = buffRead.readLine().toCharArray();
	        	
	        	ret[i] = linha;
	        	i++;
	        }
	        buffRead.close();
	        
			return ret;
}
		
		
	    /**
	     * Método de escrita no arquivo
	     * @throws IOException
	     */
	    public static void Manipulacao(char[][] list) throws IOException {
	    	ArquivoExiste(path);
	    	
	        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
	        
	        for(char[] s : list) {
	        	buffWrite.write(s);	
	        	buffWrite.newLine();
		        buffWrite.flush();
	        }
	        
	        buffWrite.close();
	    }
	}
