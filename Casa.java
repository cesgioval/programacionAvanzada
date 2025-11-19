public class Casa {
    String nombre;
	int hab;
	int energia;
	// metodo constructor
	Casa(){
	}
	
	public void direccion(int hab){
		System.out.println(" la dirección es cll 13 12 12");
		while (hab > 0) {
    		System.out.println("la casa tiene  "+hab+" habitaciones ");
			break;
		}
	}
	public void estrato(){
		System.out.println(" la casa es de estrato 3 "); 
	}
	public void precio(){
		System.out.println(" la casa tiene precio de 300000000 millones"); 
	}
}
