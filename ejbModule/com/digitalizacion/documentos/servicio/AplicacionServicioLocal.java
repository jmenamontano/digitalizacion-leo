package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Aplicacion;

@Local
public interface AplicacionServicioLocal {
	
	public void crear(Aplicacion aplicacion);

	public Aplicacion actualizar(Aplicacion aplicacion);
	
	public Aplicacion obtenerAplicacionPorCodigo(String codigoAplicacion);

}
