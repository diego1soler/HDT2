import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class Calculadora implements I_Calculadora {

	private Pila miPila;
	
	public Calculadora(){
		miPila= new Pila();
	}
	
	@Override
	public int Calcular(String vector) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void LeerArchivo(String direccion){
		
		File archivo = null;
		FileReader fr = null;
		
		
		try {
		archivo = new File (direccion);
		String linea;
		fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);
		
		while((linea=br.readLine())!=null){
		miPila.push(linea);
			}
		
		}//FIN DEL TRY
		   catch(IOException e){
		      System.out.println(e);
		     
		   }
		finally{
		    try{ //el bloque finally se ejecuta siempre, por eso, si se cierra el fichero
		    if( fr != null){ //al final del primer try, y ha dado un error antes, pasaría
		     fr.close(); //al 1er catch y luego saldría, dejándolo abierto. Es conveniente
		          } //Cerrarlo aquí, comprobando que no sea -por un error anterior, como
		       }catch (IOException e){ // no tener permisos de lectura o que no exista - de valor null.
		        }
		}
	}
	
}
	


