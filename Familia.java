public class Familia {
    String nombre;

	// metodo constructor
	Familia(String nombre){
		this.nombre = nombre;

	}
	
	public void hermano(){
		System.out.println(""+nombre+" no tiene hermanos");
	}

	public void hijos(){
		System.out.println(""+nombre+" no tiene hijos "); 
	}

    public void padres(){
		System.out.println(""+nombre+" su mamá se llama Maria"); 
		System.out.println(""+nombre+" su mamá se llama Ramiro"); 
	}
}
