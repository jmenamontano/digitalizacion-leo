import org.junit.Test;

import com.digitalizacion.documentos.entity.Aplicacion;
import com.digitalizacion.documentos.servicio.AplicacionServicioRemoto;
import com.digitalizacion.documentos.util.ServiceLocator;

public class AplicacionTest {
	private static final String JNDI_NAME = "AplicacionServicioImpl/remote";

	//@Test
	public void guardarAplicacion() {

		try {
			AplicacionServicioRemoto aplicacionServicio = (AplicacionServicioRemoto) ServiceLocator
					.obtenerServicioRemoto(JNDI_NAME, "localhost");
			Aplicacion aplicacion = new Aplicacion();
			aplicacion.setApliCodigo("DGD");
			aplicacion.setApliDescripcion("Digitalización Documentos");
			aplicacionServicio.crear(aplicacion);
			System.out.println("Registro guardado exitosamente");
		} catch (Exception e) {
			System.out.println("Error al Guardar el registro. " + e.getLocalizedMessage());
		}
	}

	@Test
	public void obtenerAplicacion() {
		try {
			AplicacionServicioRemoto aplicacionServicio = (AplicacionServicioRemoto) ServiceLocator.obtenerServicioRemoto(JNDI_NAME,
					"localhost");
			Aplicacion aplicacion = new Aplicacion();
			aplicacion = aplicacionServicio.obtenerAplicacionPorCodigo("DGD");
			System.out.println("Codigo de Aplicación:" + aplicacion.getApliCodigo());
			System.out.println("Descripcion de Aplicación:" + aplicacion.getApliDescripcion());
		} catch (Exception e) {
			System.out.println("Error al obtener el registro. " + e.getLocalizedMessage());
		}
	}
}
