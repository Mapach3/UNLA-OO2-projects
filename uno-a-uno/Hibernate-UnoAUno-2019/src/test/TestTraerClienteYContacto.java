package test;

import dao.ClienteDao;
import datos.Cliente;

public class TestTraerClienteYContacto {
	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		long idCliente = 1;
		Cliente c = dao.traerClienteYContacto(idCliente);
		System.out.println("\nTraer Cliente y Contacto: \n" + c + "\n");
	}
}