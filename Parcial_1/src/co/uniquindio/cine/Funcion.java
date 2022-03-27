package co.uniquindio.cine;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Funcion {

	private LocalDateTime fechaHora;
	//Agregacion
	private Sala sala;
	private Pelicula pelicula;
	private PersonalMantenimiento personalMantenimiento;

	public Funcion(Sala sala, Pelicula pelicula, LocalDateTime fechaHora) {
		this.sala = sala;
		this.pelicula = pelicula;
		this.fechaHora = fechaHora;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public PersonalMantenimiento getPersonalMantenimiento() {
		return personalMantenimiento;
	}

	public void setPersonalMantenimiento(PersonalMantenimiento personalMantenimiento) {
		this.personalMantenimiento = personalMantenimiento;
	}


	public void mostrarFechaHora(){
		LocalDateTime fechaHora = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = fechaHora.format(myFormatObj);
		System.out.println( formattedDate);
	}

	public void mostrarFuncion(){
		System.out.println("Funcion: \n"+ "Sala: "+ sala.getIdSala() + "\n" + pelicula.toString() + "\n" + fechaHora + "\n");
	}


}
