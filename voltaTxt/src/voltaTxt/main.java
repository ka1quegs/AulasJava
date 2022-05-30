package voltaTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) throws IOException {
		
	
//	 String s = "texto para ser gravado no arquivo.";
//	
//    try (BufferedWriter escrever =  new BufferedWriter(new FileWriter("saida.txt"))){
//	
//	escrever.write(s);
//    }
	
	
//	Mouse mouse1 = new Mouse(true, 2, "Médio");
//	
//	Mouse mouse2 = new Mouse(true, 2, "Pequeno");
//	
//	Mouse mouse3 = new Mouse(false, 2, "Grande");
//	
//	List <Mouse> listaMouse = new ArrayList <Mouse> ();
//	
//	listaMouse.add(mouse1);
//	listaMouse.add(mouse2);
//	listaMouse.add(mouse3);
//	
//	try(BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))){
//		for(Mouse mouse : listaMouse)
//		escrever.write(mouse.toString());
//	
//	 
//	}
//	
		
		List <Mouse> listaMouse = new ArrayList<Mouse>();

		
		Mouse mouse1 = new Mouse("sim", "5", "Pequeno");
		listaMouse.add(mouse1);
		
		Mouse mouse2 = new Mouse("não", "4", "médio");
		listaMouse.add(mouse2);
		
		Mouse mouse3 = new Mouse("não", "4", "médio");
		listaMouse.add(mouse3);
		
			try(BufferedWriter escrever = new BufferedWriter(new FileWriter("Mouses.txt"))){
				for (Mouse mouse : listaMouse)
					escrever.write(mouse.toString()); //to string para "ciclar a lista de mouse"
			}
		
			List <Mouse> listaMouse2 = new ArrayList<Mouse>();
			
			try (BufferedReader reader = new BufferedReader (new FileReader("Mouse.txt"))){
				String line;
				String string = "";
				
				while((line = reader.readLine())!=null){
					string += line + "/n";
					
				}
			}
				for (Mouse mouseB : listaMouse2) {					
				System.out.println(mouseB);
			}
			
			
			
			
			
			
			
			
			
}}