package co.uniquindio.cine;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//salas
		Sala s1 = new Sala(1, 8, 6);
		Sala s2 = new Sala(2, 10, 8);
		Sala s3 = new Sala(3, 8, 8);

		//Peliculas
		Pelicula p1 = new Pelicula();
		p1.setNombre("The Batman");
		p1.setDuracion(160);
		Pelicula p2 = new Pelicula();
		p2.setNombre("La Medium");
		p2.setDuracion(120);
		Pelicula p3 = new Pelicula();
		p3.setNombre("Hasta el ultimo hombre");
		p3.setDuracion(90);
		Pelicula p4 = new Pelicula();
		p4.setNombre("El Padrino");
		p4.setDuracion(120);

		//Funciones
		Funcion f1 = new Funcion(s1, p1, LocalDateTime.now().plusDays(1));
		Funcion f2 = new Funcion(s2, p2, LocalDateTime.now().plusDays(1));
		Funcion f3 = new Funcion(s3, p4, LocalDateTime.now().plusDays(1));

		// Cliente
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese su Documento");
		int documento = sc.nextInt();
		Cliente cliente= new Cliente(nombre, documento);

		//mostrar Funciones
		System.out.println("Funciones disponibles: ");
		f1.mostrarFuncion();
		f2.mostrarFuncion();
		f3.mostrarFuncion();

		//Reservar Funcion
		System.out.println("Ingrese el numero de la funcion que desea reservar");
		int numFuncion = sc.nextInt();
		String asiento = "Su puesto es: ";
		if(numFuncion==1) {
			s1.llenarSalaPorDefecto();
			s1.imprimirSala();
			System.out.println("Escoja la Fila que desea ");
			int fila = sc.nextInt();
			System.out.println("Escoja la Columna que desea ");
			int columna = sc.nextInt();
			asiento += fila+"-"+columna;
		} else if(numFuncion==2) {
			s2.llenarSalaPorDefecto();
			s2.imprimirSala();
			System.out.println("Escoja la Fila que desea ");
			int fila = sc.nextInt();
			System.out.println("Escoja la Columna que desea ");
			int columna = sc.nextInt();
			asiento += fila+"-"+columna;
		} else if(numFuncion==3) {
			s3.llenarSalaPorDefecto();
			s3.imprimirSala();
			System.out.println("Escoja la Fila que desea ");
			int fila = sc.nextInt();
			System.out.println("Escoja la Columna que desea ");
			int columna = sc.nextInt();
			asiento += fila+"-"+columna;
		}
		System.out.println("Su puesto es: " + asiento);


	}



}
