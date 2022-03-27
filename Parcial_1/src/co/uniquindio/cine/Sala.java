package co.uniquindio.cine;

public class Sala {
	private Character[][] sala;
	private int idSala;
	private int fila;
	private int columna;
	//private int capacidad;
	//Composicion
	private Zonas zonas;

	public Sala(int idSala, int fila, int columna) {
		this.idSala = idSala;
		this.fila = fila;
		this.columna = columna;

		this.sala = new Character[fila + 1][columna + 1];
		//Aplicacion composicion
		zonas = new Zonas();
	}

	public Sala() {
	}

	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	//Metodos

	public void llenarSalaPorDefecto() {
		for (int i = 0; i < sala.length; i++) {
			for (int j = 0; j < sala[0].length; j++) {
				if (i == 0 && j == 0) sala[i][j] = ' ';
				else if (i == 0) sala[i][j] = Character.forDigit(j, 10);
				else if (j == 0) sala[i][j] = Character.forDigit(i, 10);
				else sala[i][j] = 'D';
			}
		}

	}
	public void imprimirSala() {
		System.out.println("\nSala de cine: \n");
		for (Character[] asientos : sala) {
			//System.out.print("Fila ");
			for (int j = 0; j < sala[0].length; j++) {
				System.out.print(asientos[j] + " ");
			}
			System.out.println("\n");
		}
	}
	

}
