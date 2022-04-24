package ar.edu.unju.fi.ejercicio3;
	
	
	
	/*3.- Crear una clase denominada Alumno con los siguientes atributos: Nombre, apellido, Libreta Universitaria,
	notas (arreglo que almacena 5 notas de tipo double).
	 Construir dentro de la clase Alumno los siguientes
	métodos:
	calcularPromedio() retorna el promedio de las notas del alumno.
	obtenerNotaMaxima() que retorna la nota máxima.
	Desde la clase principal solicitar al usuario que ingrese por consola los datos de un alumno y por último
	muestre el resultado de cada método.
	*/
	public class Alumno {
		private String nombre;
		private String apellido;
		private int libretaU;
		private double[] notas ;
		
		
		public Alumno()
		{
			nombre = "";
			apellido = "";
			libretaU = 0;
			notas[5] = 0;	
		}
		
		public Alumno(String n,String a, int l,double[] nt) 
		{
			nombre = n;
			apellido = a;
			libretaU = l;
			notas = nt;	
			
		}
	
		public String getNombre() {
			return nombre;
		}
	
	
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
	
	
		public String getApellido() {
			return apellido;
		}
	
	
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
	
	
		public int getLibretaU() {
			return libretaU;
		}
	
	
		public void setLibretaU(int libretaU) {
			this.libretaU = libretaU;
		}
	
	
		public double[] getNotas() {
			return notas;
		}
	
	
		public void setNotas(double[] notas) {
			this.notas = notas;
		}
		
		
		
		
		public double calcularPromedio() {
			double suma=0 ;
			for(int i=0 ;i<this.notas.length;i++) 
				{
				 suma=suma+this.notas[i];
				}
			return suma / this.notas.length;
		}
	
		public double notasMax() {
			double max=0 ;
			for(int i=0 ;i<this.notas.length;i++) 
				{
				 
				 if (this.notas[i]>max){
					 max = this.notas[i];
				 }
	
				}
			return max ;
		}
	}  
	
	