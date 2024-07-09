package datos;

///Clase Rodado:
public class Rodado
{
	//Atributos:
	private int idRodado;
	private String dominio;
	private String vehiculo;
	
	//Constructores:
	public Rodado() {}
	
	public Rodado(String dominio, String vehiculo) 
	{
		this.dominio = dominio;
		this.vehiculo = vehiculo;
	}

	//Getters:
	public int getIdRodado()
	{
		return idRodado;
	}

	public String getDominio()
	{
		return dominio;
	}

	public String getVehiculo()
	{
		return vehiculo;
	}

	//Setters:
	protected void setIdRodado(int idRodado) 
	{
		this.idRodado = idRodado;
	}

	public void setDominio(String dominio) 
	{
		this.dominio = dominio;
	}

	public void setVehiculo(String vehiculo)
	{
		this.vehiculo = vehiculo;
	}
	
	//To String:
	public String toString() 
	{
		return "Rodado:\n"
			 + "ID: #" + idRodado + "\n"
			 + "Dominio: " + dominio + "\n"
			 + "Vehiculo: " + vehiculo + "\n";
	}
}
