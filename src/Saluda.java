import java.util.Scanner;

public class Saluda {

	static // variable para almacenar el nombre
	String nombre = "";

	// metodos getter y setter



	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Saluda.nombre = nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Metodo Scanner pedir nombre por teclado
		
		Scanner entrada = new Scanner (System.in);
		
		// Pedimos el nombre
		
		System.out.println("Ingresa tu nombre");
		nombre = entrada.nextLine();
		
		// mostramos el nombre
		
		System.out.println("Tu te llamas: " + nombre );
		
		// llamamos al metodo creado
		
	//	pideNombre();
		
		
	}
	
	// Creamos el metdo pideNombre()
	
	/*public static void pideNombre() {
		
		Scanner entrada = new Scanner (System.in);
		
		// variable para almacenar el nombre
		String nombre= "";
		
		System.out.println("Ingresa tu nombre");
		nombre = entrada.nextLine();
		
		// mostrar el nombre
		
		System.out.println("Tu nombre es: " + nombre);
		
	}*/

}
