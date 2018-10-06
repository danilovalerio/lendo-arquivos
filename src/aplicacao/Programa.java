package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Programa {

	public static void main(String[] args) {
		
		/* vers1
		File file = new File("C:\\arquivos\\in.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			//enquanto tiver linhas no arquivo exibe no console
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		finally { //boa prática para sempre fechar os recursos utilizados
			if(sc != null) {
				sc.close();
			}
			
		} 
		*/
		
		String path = "C:\\arquivos\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			//abstracao do file reader e é mais rápida
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} 
		catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}		
		finally {
			try { 
				if(br != null) {
					br.close();
				}
				
				if(fr != null) {
					fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
		

	}

}
