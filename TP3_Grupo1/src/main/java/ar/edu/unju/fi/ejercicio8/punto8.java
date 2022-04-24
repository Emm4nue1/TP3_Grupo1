package ar.edu.unju.fi.ejercicio8;

import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;





public class punto8 {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		String nombre;
		String apellido;
		int lu;
		
		int op;
		ArrayList<Alumno> lista= new ArrayList();
		
		int cont=0;
		do {
			System.out.println("1-NUEVO ALUMNO");
			System.out.println("2-ELIMINAR ALUMNO");
			System.out.println("3-MODIFICAR NOTAS ALUMNOS");
			System.out.println("4-MOSTRAR TODOS LOS ALUMNOS");
			System.out.println("5-MOSTRAR LOS QUE SUPERAN EL PROMEDIO");
			System.out.println("6-SALIR");
			System.out.println("ingrese opcion: ");
			op =sc.nextInt();
			switch(op) {
			case 1:
				Alumno alumn = new Alumno();
				double[] not= new double[5];
				System.out.println("ingrese un nombre ");
				nombre = sc.next();
				alumn.setNombre(nombre);
				System.out.println("ingrese un apellido ");
				apellido = sc.next();
				alumn.setApellido(apellido);
				System.out.println("ingrese  el numero de Libreta ");
				lu = sc.nextInt();
				alumn.setLibretaU(lu);
				for(int i=0; i<not.length;i++) {
					System.out.println("ingrese nota: ");
					not[i]=sc.nextDouble();
				}
				alumn.setNotas(not);
				lista.add(cont,alumn);
				cont++;
				break;
			case 2:
				System.out.println("ingrese nro de libreta: ");
				int lib = sc.nextInt();
				//Alumno alu : lista;
				for (int i= lista.size()-1; i>=0;i--) {
					if(lista.get(i).getLibretaU()==lib) {
						lista.remove(i);
						}
				}
				break;
			case 3:
				double[] nots= new double[5];
				System.out.println("ingrese nro de libreta: ");
				int numlib = sc.nextInt();
				for(int i=0; i<nots.length;i++) {
					System.out.println("ingrese nota: ");
					nots[i]=sc.nextDouble();
				}
				
				for (int i= lista.size()-1; i>=0;i--) {
					if(lista.get(i).getLibretaU()==numlib) {
						Alumno modAl = new Alumno(lista.get(i).getNombre(),lista.get(i).getApellido(),lista.get(i).getLibretaU(),nots);
						lista.set(i,modAl);
						}
				}
				break;
			case 4:
				for (Alumno a : lista)
				{
					System.out.println(" Nombre :"+a.getNombre()+" _ Apellido: "+a.getApellido()+" _ Numero de Libreta: "+a.getLibretaU()+" _ Promedio: "+a.getPromedio()+" _ Nota maxima :"+a.getMax());					
				}
				break;
			case 5:
				for (Alumno a : lista)
				{	
					if(a.getPromedio()>6) {
						System.out.println(" Nombre :"+a.getNombre()+" _ Apellido: "+a.getApellido()+" _ Numero de Libreta: "+a.getLibretaU()+" _ Promedio: "+a.getPromedio()+" _ Nota maxima :"+a.getMax());					
					}
				}
			case 6: 
				System.out.println("adios");
			}
		}while(op!=6);
		
		sc.close();
	}
	
}



