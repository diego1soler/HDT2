
public class mainCalculadora {

	public static void main(String[] args) {

		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\nUsted habrá llenado el respectivo archivo con las operaciones.");
		Calculadora Calculadora = new Calculadora();
		String cadena = Calculadora.LeerArchivo("datos.txt");
		System.out.println("La calculadora ha hecho magia. El resultado es: "+ Calculadora.Calcular(cadena));
		
		
	}

}
