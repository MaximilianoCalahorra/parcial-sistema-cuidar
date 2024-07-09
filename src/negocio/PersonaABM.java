package negocio;

import dao.PersonaDao;
import datos.Persona;

///Clase PersonaABM:
public class PersonaABM
{	
	//Atributo:
	private static PersonaABM instancia = null;
	
	//Obtener instancia:
	public static PersonaABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PersonaABM();
		}
		return instancia;
	}
		
	//Traer:
	public Persona traer(int id) 
	{
		return (Persona)PersonaDao.getInstance().traer(id);
	}
}
