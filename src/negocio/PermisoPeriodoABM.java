package negocio;

import dao.PermisoPeriodoDao;
import datos.PermisoPeriodo;

///Clase PermisoPeriodoABM:
public class PermisoPeriodoABM 
{
	//Atributo:
	private static PermisoPeriodoABM instancia = null;
		
	//Obtener instancia:
	public static PermisoPeriodoABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PermisoPeriodoABM();
		}
		return instancia;
	}
			
	//Traer:
	public PermisoPeriodo traerPermisoPeriodo(int id) 
	{			
		return (PermisoPeriodo)PermisoPeriodoDao.getInstance().traerPermisoPeriodo(id);
	}
}
