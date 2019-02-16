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
		private static ArrayList<String> user = new ArrayList<>();
		
		/**
		 * Garante que o arquivo sempre exista
		 * @param path (localização)
		 * @throws IOException
		 */
		private static void ArquivoExiste(String path) throws IOException {
			File arquivo = new File(path);
			
			if(!arquivo.exists()) 
				arquivo.createNewFile();
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
