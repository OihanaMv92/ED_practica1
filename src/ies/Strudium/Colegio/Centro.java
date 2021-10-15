package ies.Strudium.Colegio;

public class Centro
{
	/* atributos  */
	private String nombre;
	private String direccion;
	private int idcentro;

	/* constructores */

	//constructores por defecto
	public Centro() {
		nombre = "";
		direccion = "";
		idcentro = 0;
	}


	//constructor con parametros

	public Centro (String n, String d, int id) {
		nombre = n;
		direccion = d;
		idcentro = id;

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
	 * @return the idcentro
	 */
	public int getIdcentro()
	{
		return idcentro;
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
	 * @param idcentro the idcentro to set
	 */
	public void setIdcentro(int idcentro)
	{
		this.idcentro = idcentro;
	}

	


}