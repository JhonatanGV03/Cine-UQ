package co.uniquindio.cine;

import java.util.ArrayList;

public class Zonas {
	private ArrayList<Asientos> Asientos;
	private int numSillasz1;
	private int numSillasz2;
	private Asientos asientos;

	public Zonas() {
		Asientos = new ArrayList<Asientos>();
		numSillasz1 = 0;
		numSillasz2 = 0;
		//Composicion
		asientos = new Asientos();
	}

	public ArrayList<Asientos> getAsientos() {
		return Asientos;
	}
	public void setAsientos(ArrayList<Asientos> asientos) {
		Asientos = asientos;
	}
	public int getNumSillasz1() {
		return numSillasz1;
	}
	public void setNumSillasz1(int numSillasz1) {
		this.numSillasz1 = numSillasz1;
	}
	public int getNumSillasz2() {
		return numSillasz2;
	}
	public void setNumSillasz2(int numSillasz2) {
		this.numSillasz2 = numSillasz2;
	}
	

}
