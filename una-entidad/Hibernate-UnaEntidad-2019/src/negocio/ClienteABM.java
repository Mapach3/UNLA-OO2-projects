package negocio;

import java.util.GregorianCalendar;
import java.util.List;
import dao.ClienteDao;
import datos.Cliente;
import java.time.LocalDate;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();

	public Cliente traerCliente(long idCliente) throws Exception{
		Cliente c = dao.traerCliente(idCliente);
		return c;
	
	}

	public Cliente traerCliente(int dni) throws Exception{
		Cliente c = dao.traerCliente(dni);
		return c;
		
	}

	public int agregar(String apellido, String nombre, int dni, LocalDate fechaDeNacimiento) throws Exception {
		Cliente c = new Cliente(apellido, nombre, dni, fechaDeNacimiento);
		if (traerCliente(dni) != null) {
			throw new Exception("ERROR: El cliente " + nombre + " " + apellido + " ya existe en la base de datos");
		}

		return dao.agregar(c);

	}

	public void modificar(Cliente c) throws Exception{
		if (traerCliente(c.getIdCliente()) == null) { /*Que exista un cliente con ese ID*/
			throw new Exception("ERROR: El cliente no se puede modificar porque no existe uno con el ID: "+c.getIdCliente());
		}
		else if(traerCliente(c.getDni()) != null) {	/*Que el documento que se quiere poner no este ya siendo utilizado por otro*/
			throw new Exception("ERROR: El cliente no se puede modificar porque ya existe un cliente con el documento: "+c.getDni());
		}
	
		dao.actualizar(c);
	}

	public void eliminar(long idCliente) throws Exception{/* * en este caso es física en gral. no se se aplicaría este caso de uso, si
											 				* se hiciera habría que validar que el cliente no tenga dependencias*/				 								
		Cliente c = dao.traerCliente(idCliente);
		if (c == null) {
			throw new Exception("Error: El cliente de id "+idCliente+" no existe en la base de datos");
		}
		dao.eliminar(c);
	}

	public List<Cliente> traerCliente() {
		return dao.traerCliente();
	}
}
