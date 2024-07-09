package test;

import java.time.LocalDate;
import negocio.PersonaABM;
import negocio.PermisoDiarioABM;
import negocio.PermisoPeriodoABM;
import datos.PermisoDiario;
import datos.PermisoPeriodo;

public class Test 
{
	public static void main(String[] args)
	{
		///Test 1:
		System.out.println("Test 1:");
		System.out.println("Persona con ID #2:");
		System.out.println(PersonaABM.getInstance().traer(2));
		
		///Test 2:
		System.out.println("Test 2:");
		PermisoDiario permisoDiario3 = PermisoDiarioABM.getInstance().traerPermisoDiario(3);
		System.out.println("Permiso diario con ID #3:");
		System.out.println(permisoDiario3);
		
		///Test 3:
		System.out.println("Test 3:");
		System.out.println("¿El permiso con ID #3 esta activo el dia 2021-04-18?: " + permisoDiario3.activo(LocalDate.of(2021, 4, 18)) + "\n");
		
		///Test 4:
		System.out.println("Test 4:");
		System.out.println("¿El permiso con ID #3 esta activo el dia 2021-04-19?: " + permisoDiario3.activo(LocalDate.of(2021, 4, 19)) + "\n");
		
		///Test 5:
		System.out.println("Test 5:");
		PermisoPeriodo permisoPeriodo4 = PermisoPeriodoABM.getInstance().traerPermisoPeriodo(4);
		System.out.println("Permiso por periodo con ID #4:");
		System.out.println(permisoPeriodo4);
	
		///Test 6:
		System.out.println("Test 6:");
		System.out.println("¿El permiso con ID #4 esta activo el dia 2021-04-25?: " + permisoPeriodo4.activo(LocalDate.of(2021, 4, 25)) + "\n");
		
		///Test 7:
		System.out.println("Test 7:");
		System.out.println("¿El permiso con ID #4 esta activo el dia 2021-05-02?: " + permisoPeriodo4.activo(LocalDate.of(2021, 5, 2)) + "\n");
		
		///Test 8:
		System.out.println("Test 8:");
		System.out.println("¿El permiso con ID #4 esta activo el dia 2021-05-16?: " + permisoPeriodo4.activo(LocalDate.of(2021, 5, 16)) + "\n");
	}
}
