package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.AplicacionDao;
import com.digitalizacion.documentos.entity.Aplicacion;
import com.digitalizacion.documentos.servicio.AplicacionServicioLocal;
import com.digitalizacion.documentos.servicio.AplicacionServicioRemoto;

@Stateless
public class AplicacionServicioImpl implements AplicacionServicioLocal, AplicacionServicioRemoto {

	@EJB(mappedName = "AplicacionDaoImpl/local")
	private AplicacionDao aplicacionDao;

	public void crear(Aplicacion aplicacion) {
		aplicacionDao.guardar(aplicacion);
	}

	public Aplicacion actualizar(Aplicacion aplicacion) {
		return aplicacionDao.actualizar(aplicacion);
	}

	public Aplicacion obtenerAplicacionPorCodigo(String codigoAplicacion) {
		return aplicacionDao.buscarPorCodigo(codigoAplicacion);
	}

}
