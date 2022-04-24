package ar.edu.unju.fi.ejercicio9;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		ArrayList<Producto> list = new ArrayList<Producto>();
		Scanner scan = new Scanner(System.in);
		int op=0; 
		do{
			System.out.println("MENU");
			System.out.println("1:NUEVO PRODUCTO");
			System.out.println("2:MOSTRAR TODOS LOS PRODUCTOS");
			System.out.println("3:INCREMENTAR PRECIO A LOS PRODUCTOS");
			System.out.println("4:FIN");
			System.out.println("INGRESE OPCION: ");
			try {
			op=scan.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("no ingreso una opcion valida");
				op=4;
			}
			
			switch (op) {
			case 1:
				Producto unProducto = new Producto(123, "desodorante", 500.00 , "avon");
				list.add(unProducto);
				break;
			case 2:
				for(Producto i: list) {
					System.out.println("CODIGO :"+i.getCodigo());
					System.out.println("NOMBRE :"+i.getDescripcion());
					System.out.println("PRECIO : $"+i.getPrecio());
					System.out.println("MARCA :"+i.getMarca());
				}
				break;
			case 3:
				for(Producto i: list) {
					i.setPrecio(i.getPrecio()+100.25);	
				}
				for(Producto i: list) {
					System.out.println("CODIGO :"+i.getCodigo());
					System.out.println("NOMBRE :"+i.getDescripcion());
					System.out.println("PRECIO : $"+i.getPrecio());
					System.out.println("MARCA :"+i.getMarca());
				}
			default:
				break;
			}
			}while(op!=4);
		scan.close();
		}

	}


