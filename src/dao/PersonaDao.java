package dao;

import datos.Persona;

public class PersonaDao extends Dao<Persona>
{
	//Atributo:
	private static PersonaDao instancia = null;
	
	//Constructor:
	protected PersonaDao() {}
		
	//Obtener instancia:
	public static PersonaDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PersonaDao();
		}
		return instancia;
	}
}
