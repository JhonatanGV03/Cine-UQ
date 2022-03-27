package co.uniquindio.cine;

public class Pelicula {
	
	private int duracion;
	private String nombre;

	public Pelicula() {

	}

	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Pelicula: " +
				nombre + ", " +
				"Duracion: " + duracion ;
	}
}
