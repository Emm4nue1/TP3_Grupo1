package ar.edu.unju.fi.ejercicio3;


import java.util.Scanner;


public class Principal {

	public static void main (String[]args) {
		double[] not = new double[5];
		Scanner sc = new Scanner(System.in);
		Alumno unAlumno = new Alumno();
		System.out.println("ingrese nombre: ");
		String nombre=sc.nextLine();
		unAlumno.setNombre(nombre);
		System.out.println("ingrese apellido: ");
		String apell=sc.nextLine();
		unAlumno.setApellido(apell);
		System.out.println("ingrese L.U: ");
		int lu = sc.nextInt();
		unAlumno.setLibretaU(lu);
		for(int i=0; i<not.length;i++) {
			System.out.println("ingrese nota: ");
			not[i]=sc.nextDouble();
		}
		unAlumno.setNotas(not);
		
		System.out.println("nombre: "+unAlumno.getNombre()+"apellido: "+unAlumno.getApellido()+"L.U: "+unAlumno.getLibretaU()+"promedio: "+unAlumno.calcularPromedio()+"nota mas alta:"+unAlumno.notasMax());
		
		sc.close();
		}
	
}