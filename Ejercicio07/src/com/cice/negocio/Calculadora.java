package com.cice.negocio;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {
	
	private ArrayList<Double> precios = new ArrayList<>();
	
	public void showMenu(){
		
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do {
			System.out.println("Bienvenido a tu calculadora de precios...");
			System.out.println("Esto es lo que puedo hacer por ti:");
			System.out.println("1. Precio nuevo.");
			System.out.println("2. Precio medio.");
			System.out.println("3. Precio máximo.");
			System.out.println("4. Precio mínimo.");
			System.out.println("5. Mostrar todos los precios.");
			System.out.println("0. Salir.");
			System.out.print("Seleccion una opcion: ");
			opcion = sc.nextInt();
			
			controles(opcion);
			
		} while (opcion != 0);
		
		sc.close();
	}
	
	private void controles (int opcion){
		switch (opcion) {
		case 0:
			break;
		case 1:
			nuevoPrecio();
			break;
		case 2:
			precioMedio();
			break;
		case 3:
			precioMaximo();
			break;
		case 4:
			precioMinimo();
			break;
		case 5:
			mostrarPrecios();
			break;
		default:
			System.out.println("La opción seleccionada no es valida, vuelve a intentarlo!");
			break;
		}
	}
	
	private void nuevoPrecio() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un nuevo precio: ");
		precios.add(sc.nextDouble());
	}
	
	private void precioMedio(){
		double preciosSumados = 0;
		for (Double precio : precios) {
			preciosSumados += precio;
		}
		System.out.println("El precio medio es " + preciosSumados / precios.size());
	}
	
	private void mostrarPrecios() {
		for (Double precio : precios) {
			System.out.println("precio: " + precio);
		}
	}
	
	private void precioMaximo() {
		double precioMaximo = 0;
		for (Double precio : precios){
			precioMaximo = Math.max(precioMaximo, precio);
		}
		System.out.println("El precio maximo es: " + precioMaximo);
	}
	
	private void precioMinimo() {
		double precioMinimo = precios.get(0);
		for (Double precio : precios){
			precioMinimo = Math.min(precioMinimo, precio);
		}
		System.out.println("El precio maximo es: " + precioMinimo);
	}

}
