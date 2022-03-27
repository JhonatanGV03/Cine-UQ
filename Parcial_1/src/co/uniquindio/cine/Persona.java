package co.uniquindio.cine;

public class Persona {
	private String nombre;
  	private int documento;
	public Persona(String nombre, int documento) {
		this.nombre = nombre;
		this.documento = documento;
	}

	public String getNombre() {
	return nombre;
}
	public void setNombre(String nombre) {
	this.nombre = nombre;
}
	public int getIdentificador() {
	return documento;
}
	public void setIdentificador(int identificador) {
	this.documento = identificador;
}

  
}
