package ar.edu.unju.fi.ejercicio8;
import java.util.ArrayList;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio3.Alumno;

/*8.- Utilice la clase Alumno del ejercicio 3.
 *  Desde la clase Principal cree un objeto de tipo ArrayList para
almacenar únicamente objetos de la clase Alumno.
Muestre el siguiente menú de opciones:
1 – Nuevo alumno
2 – Eliminar alumno
3 – Modificar notas alumno
4 – Mostrar todos los alumnos.
5 - Mostrar los que superan el promedio de 6
6 – Salir.
3
Opción 1 permite ingresar los datos de un nuevo alumno y guardarlo en el arrayList.
Opción 2 permite eliminar un alumno ingresando su libreta universitaria.
Opción 3 permite modificar las notas del alumno ingresando su libreta universitaria.
Opción 4 visualiza toda la lista de alumnos.
Opción 5 muestra la lista de alumnos que superan el promedio de 6
Opción 6 finaliza.*/
public class punto8 {
	public static void main (String[]args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Alumno> lista=new ArrayList<>();

	String nombre = "";
	String apellido = "";
	int libretaU = 0;
	double[] notas	= new double[5]; ;	
	
	int opcion = 0;
	int cont =0;
	int li =0;
		do {
				System.out.println("MENU\r\n"
						+ "1 – Nuevo alumno\r\n"
						+ "2 – Eliminar alumno\r\n"
						+ "3 – Modificar notas alumno\r\n"
						+ "4 – Mostrar todos los alumnos.\r\n"
						+ "5 - Mostrar los que superan el promedio de 6\r\n"
						+ "6 – Salir.");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1:
					
						System.out.println("Por favor ingrese un nombre ");
						nombre = sc.next();
						System.out.println("Por favor ingrese un apellido ");
						apellido = sc.next();
						System.out.println("Por favor ingrese  el numero de Libreta ");
						libretaU = sc.nextInt();

					        for (int j=0; j<notas.length; j++) 
					        	{
						        	System.out.println("Ingresar nota: "+ (j+1));
						        	notas[j]=sc.nextDouble();
						         }
					        Alumno a = new Alumno(nombre,apellido,libretaU,notas);
						     lista.add(cont,a);
					        cont++;
					        break;
				case 2:
						System.out.println("Por favor ingrese la libreta del alumno q desea eliminar");
						li = sc.nextInt();
						//Alumno alu : lista;
						for (int i= lista.size()-1; i>=0;i--) {
							if(lista.get(i).getLibretaU()== li){//estoy en una lista y me tiene q devolver _yo me posiciono en lista y tengo q buscar la forma de mostrar el objeto o los atributos del objeto alumno y recien ahi hago el otro llamao de la libreta 
								lista.remove(i);}
						}
						
					break;
				case 3:
						System.out.println("Por favor ingrese la libreta del alumno q desea modificar su nota");
						li = sc.nextInt();
						//Alumno alu : lista;
						int  k = 0;
						for (int  i= lista.size()-1; i>=0;i--) 
						{
							if(lista.get(i).getLibretaU()== li)
							{
								k=i;
								/*System.out.println("Ingrese las nuevas notas ");
									for (int j=0; j<notas.length; j++) 
							        	{
								        	System.out.println("Ingresar nota: "+ (j+1));
								        	notas[j]=sc.nextDouble();
								        }
								lista.get(i).setNotas(notas);*/
							}
						}
						for (int j=0; j<notas.length; j++) 
			        	{
				        	System.out.println("Ingresar nota: "+ (j+1));
				        	notas[j]=sc.nextDouble();
				        }
						lista.get(k).setNotas(notas);
						
					break;
				case 4:
					for (Alumno al : lista)
					{
						System.out.println(" Nombre :"+al.getNombre()+" _ Apellido: "+al.getApellido()+" _ Numero de Libreta: "+al.getLibretaU()+" _ Promedio: "+al.calcularPromedio()+" _ Nota maxima :"+al.notasMax());
						
					}
					break;
				case 5:
					break;
				case 6:
					System.out.println("fin");
					break;
					
					        
				default:
					break;
				}
			
			} while (opcion!=6);
	 
	 sc.close();
}}



