package co.uniquindio.cine;

import java.util.ArrayList;

public class Cartelera {

	private ArrayList<Pelicula> peliculas;
	private Pelicula pelicula;

	public Cartelera() {
		peliculas = new ArrayList<Pelicula>();
		//Composicion
		pelicula = new Pelicula();
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	

}
