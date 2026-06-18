package ec.edu.puce;

public class Holaword {
	public static void main(String[] args) {
		System.out.println("Hello World");
		IO.println("Alternativa para poder enviar mensajes");
		System.out.println("Hola mundo");

		int edad = 25;
		
		boolean mayorEdad = false;
		
		String nombre = "David";
		
		System.out.printf("la edad es:%s y su nombre es %s\n", edad, nombre);

		if (edad >= 18) {
			System.out.println("/tEs mayor de edad");
		} else {
			System.out.println("/tEs menor de edad");

		}
	}

}
