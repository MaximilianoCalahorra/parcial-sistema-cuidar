package datos;

import java.time.LocalDate;
import java.util.Set;

///Clase PermisoDiario:
public class PermisoDiario extends Permiso
{
	//Atributos:
	private String motivo;
	
	//Constructores:
	public PermisoDiario() {}
	
	public PermisoDiario(Persona pedido, LocalDate fecha, Set<Lugar> desdeHasta, String motivo) 
	{
		super(pedido, fecha, desdeHasta);
		this.motivo = motivo;
	}

	//Getter:
	public String getMotivo() 
	{
		return motivo;
	}

	//Setter:
	public void setMotivo(String motivo) 
	{
		this.motivo = motivo;
	}
	
	//To String:
	public String toString() 
	{
		return "Permiso diario:\n"
			 + super.toString()
			 + "Motivo: " + motivo + "\n";
	}
	
	//CU 4:
	public boolean activo(LocalDate dia) 
	{
		return dia.equals(fecha);
	}
}
