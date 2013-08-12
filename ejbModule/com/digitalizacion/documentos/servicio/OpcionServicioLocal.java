package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Opcion;

@Local
public interface OpcionServicioLocal {
	public void crear(Opcion aplicacion);

	public Opcion actualizar(Opcion aplicacion);
}
