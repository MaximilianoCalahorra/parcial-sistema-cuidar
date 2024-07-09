package datos;

///Clase Lugar:
public class Lugar
{
	//Atributos:
	private int idLugar;
	private String lugar;
	private String codigoPostal;
	
	//Constructores:
	public Lugar() {}
	
	public Lugar(String lugar, String codigoPostal) 
	{
		this.lugar = lugar;
		this.codigoPostal = codigoPostal;
	}

	//Getters:
	public int getIdLugar()
	{
		return idLugar;
	}

	public String getLugar()
	{
		return lugar;
	}

	public String getCodigoPostal() 
	{
		return codigoPostal;
	}

	//Setters:
	protected void setIdLugar(int idLugar) 
	{
		this.idLugar = idLugar;
	}

	public void setLugar(String lugar)
	{
		this.lugar = lugar;
	}

	public void setCodigoPostal(String codigoPostal) 
	{
		this.codigoPostal = codigoPostal;
	}
	
	//To String:
	public String toString() 
	{
		return "Lugar:\n"
			 + "ID: #" + idLugar + "\n"
			 + "Lugar: " + lugar + "\n"
			 + "Codigo postal: #" + codigoPostal + "\n";
	}
}
