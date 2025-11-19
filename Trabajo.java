public class Trabajo {
    String nomEmpresa;
	String cargo;
	String direccion;
	// metodo constructor
	Trabajo(String nomEmpresa, String cargo, String direccion){
		this.nomEmpresa = nomEmpresa;
		this.cargo = cargo;
		this.direccion = direccion;
	}
	
	public String nombreEmpresa(){
		//System.out.println(""+nomEmpresa+" trabaja en la empresa "+nomEmpresa+"");
		return nomEmpresa;
	}
	public String cargo(){
		//System.out.println(""+nomEmpresa+" el cargo es de "+cargo+"");
		return cargo;
	}
	public String direccion(){
		//System.out.println(""+nomEmpresa+" la empresa esta ubicada "+direccion+""); 
		return direccion;
	}
    
}
