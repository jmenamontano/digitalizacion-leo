package com.digitalizacion.documentos.dao.impl;

import java.util.List;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.dao.AplicacionDao;
import com.digitalizacion.documentos.dao.AplicacionDaoRemote;
import com.digitalizacion.documentos.entity.Aplicacion;
import com.digitalizacion.documentos.util.NamedQueryParameter;

@Stateless
public class AplicacionDaoImpl extends GenericDaoImpl<Aplicacion, Long> implements AplicacionDao, AplicacionDaoRemote {

	public AplicacionDaoImpl() {
		super(Aplicacion.class);
	}
/**
 * Prueba de SVN
 */
	public Aplicacion buscarPorCodigo(String codigoAplicacion) {
		List<Aplicacion> aplicaciones;
		aplicaciones = findByNamedQueryNamedParameter("Aplicacion.findByCodigo", new NamedQueryParameter("apliCodigo",
				codigoAplicacion));
		if (aplicaciones.isEmpty()) {
			return null;
		} else {
			return aplicaciones.get(0);
		}
	}
}
