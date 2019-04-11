package test;

import java.util.GregorianCalendar;
import dao.ClienteDao;
import negocio.ClienteABM;
import java.time.LocalDate;

public class TestAgregarCliente {
	public static void main(String[] args) {
		
		try {
			String apellido = "Heredia";
			String nombre = "Nestor";
			int documento = 2231223;
			//GregorianCalendar fechaDeNacimiento = new GregorianCalendar(1998, 02, 05);//
			LocalDate fechaNacimiento = LocalDate.of(1992,03,05);
			ClienteABM abm = new ClienteABM();
			long ultimoIdCliente = abm.agregar(apellido, nombre, documento, fechaNacimiento);
	
			ClienteDao d1 = new ClienteDao();

		
		
		}
		catch(Exception e) {
			System.out.println(""+e.getMessage());
		}
		
	}
}