public class Persona {
    String nombre;
	int edad;
	String generoTipo;

	// metodo constructor
	Persona(String nombre, int edad, String genero){
		this.nombre = nombre;
		this.edad = edad;
		generoTipo = genero;
	}
	
	public void datos(){
		System.out.println("tu nombre es:  "+nombre+"");
		System.out.println("tu edad es:  "+edad+"");
		System.out.println("tu genero es:  "+generoTipo+"");
	}

	public void habitos(){
		System.out.println(""+nombre+" te gusta caminar"); 
	}

	public void estilo(){
		System.out.println(""+nombre+" tienes un outfit moderno"); 

	}
}
