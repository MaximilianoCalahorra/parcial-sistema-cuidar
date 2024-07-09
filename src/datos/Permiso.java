package datos;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.Set;

///Clase Permiso:
public abstract class Permiso 
{
	//Atributos:
	protected int idPermiso;
	protected Persona pedido;
	protected LocalDate fecha;
	protected Set<Lugar> desdeHasta;
	
	//Constructores:
	public Permiso() {}
	
	public Permiso(Persona pedido, LocalDate fecha, Set<Lugar> desdeHasta) 
	{
		this.pedido = pedido;
		this.fecha = fecha;
		this.desdeHasta = desdeHasta;
	}

	//Getters:
	public int getIdPermiso()
	{
		return idPermiso;
	}

	public Persona getPedido()
	{
		return pedido;
	}

	public LocalDate getFecha() 
	{
		return fecha;
	}

	public Set<Lugar> getDesdeHasta()
	{
		return desdeHasta;
	}

	//Setters:
	protected void setIdPermiso(int idPermiso)
	{
		this.idPermiso = idPermiso;
	}

	public void setPedido(Persona pedido)
	{
		this.pedido = pedido;
	}

	public void setFecha(LocalDate fecha) 
	{
		this.fecha = fecha;
	}

	public void setDesdeHasta(Set<Lugar> desdeHasta) 
	{
		this.desdeHasta = desdeHasta;
	}
	
	//To String:
	public String toString() 
	{
		String permiso = "ID: #" + idPermiso + "\n"
					   + pedido.toString()
					   + "Fecha: " + fecha + "\n";
		Iterator<Lugar> it = desdeHasta.iterator();
		String titulo = "Desde ";
		while(it.hasNext()) 
		{
			permiso += titulo + it.next().toString();
			titulo = "Hasta ";
		}
		return permiso;
	}
	
	//CU 4:
	public abstract boolean activo(LocalDate dia);
}
