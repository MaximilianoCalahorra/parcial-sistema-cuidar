package datos;

import java.time.LocalDate;
import java.util.Set;

///Clase PermisoPeriodo:
public class PermisoPeriodo extends Permiso
{
	//Atributos:
	private int cantDias;
	private boolean vacaciones;
	private Rodado rodado;
	
	//Constructor:
	public PermisoPeriodo() {}
	
	public PermisoPeriodo(Persona pedido, LocalDate fecha, Set<Lugar> desdeHasta, int cantDias, boolean vacaciones, Rodado rodado) 
	{
		super(pedido, fecha, desdeHasta);
		this.cantDias = cantDias;
		this.vacaciones = vacaciones;
		this.rodado = rodado;
	}

	//Getters:
	public int getCantDias()
	{
		return cantDias;
	}

	public boolean isVacaciones()
	{
		return vacaciones;
	}

	public Rodado getRodado()
	{
		return rodado;
	}

	//Setters:
	public void setCantDias(int cantDias) 
	{
		this.cantDias = cantDias;
	}

	public void setVacaciones(boolean vacaciones) 
	{
		this.vacaciones = vacaciones;
	}

	public void setRodado(Rodado rodado) 
	{
		this.rodado = rodado;
	}
	
	//To String:
	public String toString() 
	{
		return "Permiso por periodo:\n"
			 + super.toString()
			 + "Cantidad de dias: " + cantDias + "\n"
			 + "Vacaciones: " + vacaciones + "\n"
			 + rodado.toString();
	}
	
	//CU 4:
	public boolean activo(LocalDate dia) 
	{
		return !(dia.isBefore(fecha)) && !(dia.isAfter(fecha.plusDays(cantDias)));
	}
}
