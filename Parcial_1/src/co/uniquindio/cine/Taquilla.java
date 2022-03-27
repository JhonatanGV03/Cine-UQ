package co.uniquindio.cine;

import java.util.ArrayList;
import java.util.Scanner;

public class Taquilla {

	private ArrayList<Boletos> boletos;
	private Boletos boleto;
	private Cajero cajero;

	public Taquilla() {
		boletos = new ArrayList<Boletos>();


	}
	public ArrayList<Boletos> getBoletos() {
		return boletos;
	}

	public void setBoletos(ArrayList<Boletos> boletos) {
		this.boletos = boletos;
	}


}

