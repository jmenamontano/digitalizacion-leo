import org.junit.Test;

import com.digitalizacion.documentos.dao.AplicacionDaoRemote;
import com.digitalizacion.documentos.entity.Aplicacion;
import com.digitalizacion.documentos.util.ServiceLocator;

public class AplicacionTest {
	private static final String JNDI_NAME = "AplicacionDaoImpl/remote";

	//@Test
	public void guardarAplicacion() {

		try {
			AplicacionDaoRemote aplicacionDao = (AplicacionDaoRemote) ServiceLocator.obtenerServicioRemoto(JNDI_NAME,"localhost");
			Aplicacion aplicacion = new Aplicacion();
			aplicacion.setApliCodigo("DGD");
			aplicacion.setApliDescripcion("Digitalizaci�n Documentos Leo");
			aplicacionDao.guardar(aplicacion);
			System.out.println("Registro guardado exitosamente");
		} catch (Exception e) {
			System.out.println("Error al Guardar el registro. " + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void obtenerAplicacion() {
		try {
			AplicacionDaoRemote aplicacionDao = (AplicacionDaoRemote) ServiceLocator.obtenerServicioRemoto(JNDI_NAME,"localhost");
			Aplicacion aplicacion = new Aplicacion();
			aplicacion=aplicacionDao.findByPK(5050L);
			System.out.println("Codigo de Aplicaci�n:" + aplicacion.getApliCodigo());
			System.out.println("Descripcion de Aplicaci�n:" + aplicacion.getApliDescripcion());
		} catch (Exception e) {
			System.out.println("Error al obtener el registro. " + e.getLocalizedMessage());
		}
	}
}
