package ies.Strudium.Colegio;

public class Asignatura
{
	//Atributos
		private String nombre;
		private int horas;
		private int idasignatura;

	
		public Asignatura() {
			nombre = "";
			horas = 0;
			idasignatura=0;

		}
		

		
		public Asignatura (String nom, int h, int cen) {
			nombre = nom;
			horas = h;
			idasignatura= cen;
			
		}



		/**
		 * @return the nombre
		 */
		public String getNombre()
		{
			return nombre;
		}



		/**
		 * @return the horas
		 */
		public int getHoras()
		{
			return horas;
		}



		/**
		 * @return the idasignatura
		 */
		public int getIdasignatura()
		{
			return idasignatura;
		}



		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre)
		{
			this.nombre = nombre;
		}



		/**
		 * @param horas the horas to set
		 */
		public void setHoras(int horas)
		{
			this.horas = horas;
		}



		/**
		 * @param idasignatura the idasignatura to set
		 */
		public void setIdasignatura(int idasignatura)
		{
			this.idasignatura = idasignatura;
		}



		
}
