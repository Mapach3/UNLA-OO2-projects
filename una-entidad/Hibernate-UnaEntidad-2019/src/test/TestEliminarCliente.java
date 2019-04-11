package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			long id = 18;
			abm.eliminar(id);
			
			
		}catch(Exception e) {
			System.out.println(""+e.getMessage());
			
		}
		
		
		

	}

}
