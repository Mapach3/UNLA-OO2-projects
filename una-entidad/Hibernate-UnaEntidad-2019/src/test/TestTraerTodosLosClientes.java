package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerTodosLosClientes {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			System.out.println(""+abm.traerCliente());
			
			
		}catch(Exception e) {
			System.out.println(""+e.getMessage());
			
		}
		
		
		

	}

}
