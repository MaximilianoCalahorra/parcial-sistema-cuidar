package datos;

///Clase Persona:
public class Persona 
{
	//Atributos:
	private int idPersona;
	private String nombre;
	private String apellido;
	private long dni;
	
	//Constructores:
	public Persona() {}
	
	public Persona(String nombre, String apellido, long dni) 
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	//Getters:
	public int getIdPersona() 
	{
		return idPersona;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public String getApellido() 
	{
		return apellido;
	}

	public long getDni()
	{
		return dni;
	}

	//Setters:
	protected void setIdPersona(int idPersona)
	{
		this.idPersona = idPersona;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public void setApellido(String apellido) 
	{
		this.apellido = apellido;
	}

	public void setDni(long dni)
	{
		this.dni = dni;
	}
	
	//To String:
	public String toString() 
	{
		return "Persona:\n"
			 + "ID: #" + idPersona + "\n"
			 + "Nombre: " + nombre + "\n"
			 + "Apellido: " + apellido + "\n"
			 + "DNI: #" + dni + "\n";
	}
}
