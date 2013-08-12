package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Seccion;

@Local
public interface SeccionServicioLocal {
	public void crear(Seccion aplicacion);

	public Seccion actualizar(Seccion aplicacion);
}
