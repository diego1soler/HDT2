
public class mainCalculadora {

	public static void main(String[] args) {

		System.out.println("Bienvenido invocador a la calculadora POST-FIX.\n Usted habrá");
		Calculadora Calculadora = new Calculadora();
		System.out.println("La calculadora ha hecho magia. El resultado es: "+Calculadora.Calcular(Calculadora.LeerArchivo("datos.txt")));
		
		
	}

}
