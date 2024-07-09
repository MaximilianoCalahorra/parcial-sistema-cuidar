package dao;

import org.hibernate.Hibernate;
import datos.PermisoDiario;

///Clase PermisoDiarioDao:
public class PermisoDiarioDao extends Dao<PermisoDiario>
{
	//Atributo:
	private static PermisoDiarioDao instancia = null;
		
	//Constructor:
	protected PermisoDiarioDao() {}
			
	//Obtener instancia:
	public static PermisoDiarioDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PermisoDiarioDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 2:
	public PermisoDiario traerPermisoDiario(int id) 
	{
		PermisoDiario permisoDiario = null;
		try 
		{
			iniciaOperacion();
			permisoDiario = (PermisoDiario)session.get(PermisoDiario.class, id);
			Hibernate.initialize(permisoDiario.getPedido());
			Hibernate.initialize(permisoDiario.getDesdeHasta());
		}
		finally 
		{
			session.close();
		}
		return permisoDiario;
	}
}
