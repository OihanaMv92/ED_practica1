package ies.Strudium.Colegio;



public class Alumnos
{

		private String nombre;
		private String direccion;
		private Centro centro;
		private Asignatura asignatura;
		private float nota;
		private int nummatricula;

		public Alumnos() {
			nombre = " ";
			direccion= " ";
			centro = new Centro();
			asignatura= new Asignatura();
			nota=0.0f;
			nummatricula=0;

		}
		

		
		public Alumnos (String nom, String di, Centro c, Asignatura a, float n, int num) {
			this.nombre = nom;
			this.direccion = di;
			this.centro =c;
			this.asignatura=a;
			this.nota=n;
			this.nummatricula=num;

		}



		/**
		 * @return the nombre
		 */
		public String getNombre()
		{
			return nombre;
		}



		/**
		 * @return the direccion
		 */
		public String getDireccion()
		{
			return direccion;
		}



		/**
		 * @return the centro
		 */
		public Centro getCentro()
		{
			return centro;
		}



		/**
		 * @return the asignatura
		 */
		public Asignatura getAsignatura()
		{
			return asignatura;
		}



		/**
		 * @return the nota
		 */
		public float getNota()
		{
			return nota;
		}



		/**
		 * @return the nummatricula
		 */
		public int getNummatricula()
		{
			return nummatricula;
		}



		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}



		/**
		 * @param direccion the direccion to set
		 */
		public void setDireccion(String direccion)
		{
			this.direccion = direccion;
		}



		/**
		 * @param centro the centro to set
		 */
		public void setCentro(Centro centro)
		{
			this.centro = centro;
		}



		/**
		 * @param asignatura the asignatura to set
		 */
		public void setAsignatura(Asignatura asignatura)
		{
			this.asignatura = asignatura;
		}



		/**
		 * @param nota the nota to set
		 */
		public void setNota(float nota)
		{
			this.nota = nota;
		}



		/**
		 * @param nummatricula the nummatricula to set
		 */
		public void setNummatricula(int nummatricula)
		{
			this.nummatricula = nummatricula;
		}

	
}
