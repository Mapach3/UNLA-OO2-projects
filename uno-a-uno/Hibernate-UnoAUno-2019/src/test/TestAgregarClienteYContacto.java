package test;
import datos.Cliente;
import datos.Contacto;
import dao.ClienteDao;
import dao.ContactoDao;
import java.util.GregorianCalendar;
import java.time.LocalDate;


public class TestAgregarClienteYContacto {
	
	public static void main(String[] args) {
	ClienteDao dao = new ClienteDao();
	String apellido = "Ramirez";
	String nombre = "Roberto";
	int dni = 777212;
	//GregorianCalendar fechaNacim = new GregorianCalendar(1992,01,24);
	LocalDate fechaNacim = LocalDate.of(1982,11,30);
	long id = dao.agregar(new Cliente(apellido,nombre,dni,fechaNacim));
	
	/*agregamos al cliente y le ponemos contacto con un update!*/
	
	
	/*em este caso llamo al 3 porque es el siguiente que voy a agregar*/
	Cliente c = dao.traerCliente(777212);
	Contacto con = new Contacto("rroberto@yahoo.com","11-4421-2121","5032-5210",c);
	ContactoDao dao1 = new ContactoDao();
	dao1.agregar(con);	// primero tenemos que agregar el contacto a la tabla, sino va a fallar
	c.setContacto(con); // modificamos el atributo mediante set
	dao.actualizar(c);	// actualizamos
	Cliente cModif = dao.traerCliente(777212);
	System.out.println("Cliente con contacto --> "+cModif.toString());
	
	
	}
	
	

}
