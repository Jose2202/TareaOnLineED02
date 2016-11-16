import java.util.Scanner;

public class Saluda {
	
	
	static // variable para almacenar el nombre
	String nombre= "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Metodo Scanner pedir nombre por teclado
		
		Scanner entrada = new Scanner (System.in);
		
		// Pedimos el nombre
		
		System.out.println("Ingresa tu nombre");
		nombre = entrada.nextLine();
		
		

	}

}
