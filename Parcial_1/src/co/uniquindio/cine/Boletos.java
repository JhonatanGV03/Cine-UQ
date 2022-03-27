package co.uniquindio.cine;

public class Boletos {
	
	private int precio;
	//Agregacion
	private Asientos asiento;

	public Boletos(int precio, Asientos asiento) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
     

}
