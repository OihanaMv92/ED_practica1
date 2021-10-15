package ies.Strudium.Colegio;

public class TestCentro
{

	public static void main(String[] args)
	{
		Centro c1 = new Centro ("Escuela de ingl�s", "Reyes Cat�licos, 14", 40);
		Centro c2 = new Centro ("Escuela de franc�s", "Crist�bal Col�n, 92", 700);
		
		Asignatura as1 = new Asignatura("Ingl�s B1", 45, c1.getIdcentro());
		Asignatura as2 = new Asignatura("Ingl�s B2", 60,c1.getIdcentro());
		Asignatura as3 = new Asignatura ("Franc�s B1", 80, c2.getIdcentro());
		Asignatura as4 = new Asignatura ("Franc�s A2", 75, c2.getIdcentro());
				
		
		Alumnos a1 = new Alumnos ("Ana Abel", "Paseo de Am�rica, 15",c1, as1, 7, 1256);
		Alumnos a2 = new Alumnos ("Benito bueno", "	Reyes Cat�licos, 16",c1, as2, 6, 1024);
		Alumnos a3 = new Alumnos ("Carmen Cano", "Reyes Cat�licos, 2",c1, as1, 5, 1048);
		Alumnos a4 = new Alumnos ("Esteban Escalera", "Isabel la Cat�lica, 28", c2,as3, 9, 1394);
		Alumnos a5 = new Alumnos ("Francisco Farf�n", "Crist�bal Col�n, s/n", c2, as4, 8.5f, 1911);
		
		System.out.println(c1.getDireccion() +  " "  + c2.getDireccion());
		System.out.println("Carmen esta matriculada en el centro " + c1.getDireccion());
		System.out.println("Benito ha sacado en Ingl�s B2 " + a2.getNota());

		
	}

}
