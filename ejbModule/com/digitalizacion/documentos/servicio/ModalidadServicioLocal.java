package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Modalidad;

@Local
public interface ModalidadServicioLocal {
	public void crear(Modalidad aplicacion);

	public Modalidad actualizar(Modalidad aplicacion);
}
