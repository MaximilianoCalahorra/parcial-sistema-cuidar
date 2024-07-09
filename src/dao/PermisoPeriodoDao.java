package dao;

import org.hibernate.Hibernate;
import datos.PermisoPeriodo;

///Clase PermisoPeriodoDao:
public class PermisoPeriodoDao extends Dao<PermisoPeriodo>
{
	//Atributo:
	private static PermisoPeriodoDao instancia = null;
		
	//Constructor:
	protected PermisoPeriodoDao() {}
			
	//Obtener instancia:
	public static PermisoPeriodoDao getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PermisoPeriodoDao();
		}
		return instancia;
	}
	
	//Traer:
	//CU 3:
	public PermisoPeriodo traerPermisoPeriodo(int id) 
	{
		PermisoPeriodo permisoPeriodo = null;
		try 
		{
			iniciaOperacion();
			permisoPeriodo = (PermisoPeriodo)session.get(PermisoPeriodo.class, id);
			Hibernate.initialize(permisoPeriodo.getPedido());
			Hibernate.initialize(permisoPeriodo.getDesdeHasta());
			Hibernate.initialize(permisoPeriodo.getRodado());
		}
		finally 
		{
			session.close();
		}
		return permisoPeriodo;
	}
}
