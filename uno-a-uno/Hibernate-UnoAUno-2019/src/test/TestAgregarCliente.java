package test;

import dao.ClienteDao;
import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;
import java.time.LocalDate;

public class TestAgregarCliente {
	
	public static void main(String[] args) {
	
	ClienteDao dao = new ClienteDao();
	String apellido = "Martinez";
	String nombre = "Juana";
	int dni = 9862;
	//GregorianCalendar fechaNacimiento = new GregorianCalendar(2001,02,12);
	LocalDate fechaNacimiento = LocalDate.of(1998, 2, 28);
	
	Cliente c = new Cliente(apellido,nombre,dni,fechaNacimiento);
	long id = dao.agregar(c);
	
	}

	
	

	
	

}
