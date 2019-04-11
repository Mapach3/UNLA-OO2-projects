package test;

import dao.ContactoDao;
import dao.ClienteDao;
import datos.Contacto;
import datos.Cliente;

public class TestActualizarContacto {
	
	public static void main(String[] args) {
		
		try {
			ContactoDao dao = new ContactoDao();
			Contacto con = dao.traerContacto(3);	//traemos el contacto a modificar por ID
			con.setEmail("abc123@gmail.com");		//cambiamos los valores por set.
			con.setFijo("4111-1111");
			con.setMovil("15-8872-7782");
			dao.actualizar(con);

			
			
		}catch(Exception e) {
			System.out.print("" + e.getMessage());
		}
		
		
		
		
		
	}

}
