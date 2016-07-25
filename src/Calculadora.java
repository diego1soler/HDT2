
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
/**
 * @author Diego Soler, Gladys de la Roca, Rene Olivet
 * Clase Calculadora
 * Clase que maneja la calculadora
 * @version 24/07/2016
 */
public class Calculadora implements I_Calculadora {

	private Pila miPila;
	
	public Calculadora(){
		miPila= new Pila();
	}
	
	@Override
	public int Calcular(String vector) {
		
		int resultado = 0;
		
		String [] cadena = vector.split(" ");
		for (int x = 0; x<cadena.length; x++){
			
			try{
				miPila.Push(Integer.parseInt(cadena[x]));
			}
			
			catch(Exception e){ 
				
				switch(cadena[x]) {
				
			
				case "+":
					resultado = (int)miPila.Pop() + (int)miPila.Pop();
					miPila.Push(resultado);
					break;
					
				case "*":
					resultado = (int)miPila.Pop() * (int)miPila.Pop();
					miPila.Push(resultado);
					break;
					
				case "/":
					resultado = (int)miPila.Pop() / (int)miPila.Pop();
					miPila.Push(resultado);
					break;
				   }
	             }	
		      }
		
			return resultado;
	       }

	@Override
	public String LeerArchivo(String direccion){
		
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		String linea = "";
		
		try {
		archivo = new File (direccion);
		fr = new FileReader (archivo);
		br = new BufferedReader(fr);

		
		linea = br.readLine();
			
		
			
		
				}//FIN DEL TRY
		   catch(Exception e){
		      System.err.println("El archivo está vacío. No hay ninguna instrucción");
		     
		   }
		
		
		return linea;
	}
	
}
	


