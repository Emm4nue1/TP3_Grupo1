package ar.edu.unju.fi.ejercicio3;
	
	
	
	/*3.- Crear una clase denominada Alumno con los siguientes atributos: Nombre, apellido, Libreta Universitaria,
	notas (arreglo que almacena 5 notas de tipo double).
	 Construir dentro de la clase Alumno los siguientes
	m�todos:
	calcularPromedio() retorna el promedio de las notas del alumno.
	obtenerNotaMaxima() que retorna la nota m�xima.
	Desde la clase Principal solicitar al usuario que ingrese por consola los datos de un alumno y por �ltimo
	muestre el resultado de cada m�todo.
	*/
	public class Alumno {
		private String nombre;
		private String apellido;
		private int libretaU;
		private double[] notas ;
		private double promedio=0;
		private double max=0;
		
		public Alumno() {
			// TODO Auto-generated constructor stub
		}
		
		/**
		 * @param nombre
		 * @param apellido
		 * @param libretaU
		 * @param notas
		 */
		public Alumno(String nombre, String apellido, int libretaU, double[] notas) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.libretaU = libretaU;
			this.notas = notas;
		}





		/**
		 * @return the promedio
		 */
		public double getPromedio() {
			return calcularPromedio();
		}


		/**
		 * @return the max
		 */
		public double getMax() {
			return notasMax();
		}


		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		/**
		 * @return the apellido
		 */
		public String getApellido() {
			return apellido;
		}

		/**
		 * @param apellido the apellido to set
		 */
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		/**
		 * @return the libretaU
		 */
		public int getLibretaU() {
			return libretaU;
		}

		/**
		 * @param libretaU the libretaU to set
		 */
		public void setLibretaU(int libretaU) {
			this.libretaU = libretaU;
		}

		/**
		 * @return the notas
		 */
		public double[] getNotas() {
			return notas;
		}

		/**
		 * @param notas the notas to set
		 */
		public void setNotas(double[] notas) {
			this.notas = notas;
		}

		public double calcularPromedio() {
			double suma=0 ;
			for(int i=0 ;i<notas.length;i++) 
				{
				 suma=suma+notas[i];
				}
			promedio=suma/notas.length;
			return (promedio);
		}
	
		public double notasMax() {
			for(int i=0 ;i<notas.length;i++) 
				{				 
				 if (notas[i]>max){
					 max = notas[i];
				 }
	
				}
			return max ;
		}
	}  
	
	