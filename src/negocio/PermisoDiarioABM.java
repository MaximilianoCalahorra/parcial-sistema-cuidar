package negocio;

import dao.PermisoDiarioDao;
import datos.PermisoDiario;

///Clase PermisoDiarioABM:
public class PermisoDiarioABM 
{
	//Atributo:
	private static PermisoDiarioABM instancia = null;
		
	//Obtener instancia:
	public static PermisoDiarioABM getInstance() 
	{
		if(instancia == null) 
		{
			instancia = new PermisoDiarioABM();
		}
		return instancia;
	}
			
	//Traer:
	public PermisoDiario traerPermisoDiario(int id) 
	{			
		return (PermisoDiario)PermisoDiarioDao.getInstance().traerPermisoDiario(id);
	}
}
