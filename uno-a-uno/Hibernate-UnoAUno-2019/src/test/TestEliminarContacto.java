package test;
import dao.ContactoDao;
import datos.Contacto;

public class TestEliminarContacto {

	public static void main(String[] args) {
		ContactoDao dao = new ContactoDao();
		Contacto con = dao.traerContacto(1);
		dao.eliminar(con);
		


	}

}
