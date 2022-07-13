package paquete;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class ArchivoPlano {
	
	
public static void crearArchivo(ArrayList lista) {
	
	int i=0;
  
    
	
	File archivo=new File("Produtos.txt");
	
    if (!archivo.exists()) {
   	 try {
   		 archivo.createNewFile();
   	 }catch(IOException e) {
   		 e.printStackTrace();
   	 }
   	 
    }
    
    try {
		FileWriter fw=new FileWriter(archivo);
		
		BufferedWriter bW=new BufferedWriter(fw);
		
		ArrayList <RegistrosProductos> rp = lista;
		ArrayList <Alimentos>a=new ArrayList<Alimentos>();
		
	
		
		while (i<lista.size()) {
			bW.write(lista.get(i)+"\n");
			
			
			i++;
		}
		
		
		System.out.println("******─────≪ Accediendo a  creacion de  TXT ─────≪ *******");
			
			
	        
	      
		
	
		bW.flush();
		
		FileReader fR= new FileReader(archivo);
		BufferedReader br=new BufferedReader(fR);
		
		String linea=br.readLine();
		
		while(linea!=null) {
			
			System.out.println(linea);
			linea=br.readLine();
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}



		
		
		
	

}
