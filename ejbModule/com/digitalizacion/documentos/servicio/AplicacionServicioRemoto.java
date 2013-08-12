package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Aplicacion;

@Remote
public interface AplicacionServicioRemoto {

	public void crear(Aplicacion aplicacion);

	public Aplicacion actualizar(Aplicacion aplicacion);

	public Aplicacion obtenerAplicacionPorCodigo(String codigoAplicacion);

}
