package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestActualizarCliente {
	public static void main(String[] args) {
		
		
		try {
		ClienteABM abm = new ClienteABM();
		long id = 17;
		// traer el obj a modificar
		Cliente c = abm.traerCliente(id);
		System.out.println("Cliente a Modificar -->" + c);
		// modificar por set los atributos
		c.setDni(223345);
		abm.modificar(c); // update del objeto
		int dni = 223345;
		Cliente cModif = abm.traerCliente(dni);
		System.out.println("Cliente Modificado -->" + cModif);
		
		}
		catch(Exception e) {
			System.out.println(""+e.getMessage());
		}
	}
}
