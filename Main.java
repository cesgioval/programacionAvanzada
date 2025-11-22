public class Main {
    public static void main (String[] args){

		System.out.println("**********  Aqui comiensa el llamado de la clase persona  **********");

		Persona personas = new Persona("Franchesco", 20, "Hombre");
		personas.datos();
		personas.habitos();
		personas.estilo();


		System.out.println("**********  Aqui comiensa el llamado de la clase familia  **********");

		Familia familia = new Familia("Franchesco");
		familia.hermano();
		familia.hijos();
		familia.padres();	


		System.out.println("**********  Aqui comiensa el llamado de la clase carro  **********");

		Carro carro = new Carro();
		carro.motor("prendido");
		carro.llanta();
		carro.marca();	


		System.out.println("**********  Aqui comiensa el llamado de la clase casa  **********");

		Casa casa = new Casa();
		casa.direccion(3);
		casa.estrato();
		casa.precio();


		System.out.println("**********  Aqui comiensa el llamado de la clase trabajo  **********");

		Trabajo trabajo = new Trabajo("Zapateria enviado desde main", "Ingeniro soporte", "calle 45 56 56");
		String nomEmpresa = trabajo.nombreEmpresa();
		System.out.println(" trabaja en la empresa "+nomEmpresa+"");
		String cargo = trabajo.cargo();
		System.out.println("tiene el cargo   "+cargo+"");
		String direccion = trabajo.direccion();
		System.out.println("la dirección de trabajo es:  "+direccion+"");
	}
}





