package co.uniquindio.cine;

import java.util.ArrayList;

public class Cine {

	private ArrayList<Funcion> funciones;
	private ArrayList<Cartelera> carteleras;
	//Composicion
	private Funcion funcion;
	private Cartelera cartelera;
	private Taquilla taquilla;
	private PersonalCine personalCine;

	public Cine() {
		funciones = new ArrayList<Funcion>();
		carteleras = new ArrayList<Cartelera>();
		//Composicion
		cartelera = new Cartelera();
		taquilla = new Taquilla();
	}
	public ArrayList<Funcion> getFunciones() {
		return funciones;
	}
	public void setFunciones(ArrayList<Funcion> funciones) {
		this.funciones = funciones;
	}
	public ArrayList<Cartelera> getCarteleras() {
		return carteleras;
	}
	public void setCarteleras(ArrayList<Cartelera> carteleras) {
		this.carteleras = carteleras;
	}
	  

}
