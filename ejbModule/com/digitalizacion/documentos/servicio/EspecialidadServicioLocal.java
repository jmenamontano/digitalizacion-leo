package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Especialidad;

@Local
public interface EspecialidadServicioLocal {
	public void crear(Especialidad aplicacion);

	public Especialidad actualizar(Especialidad aplicacion);
}
