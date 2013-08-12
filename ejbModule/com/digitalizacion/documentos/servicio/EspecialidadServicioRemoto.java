package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Especialidad;

@Remote
public interface EspecialidadServicioRemoto {
	public void crear(Especialidad aplicacion);

	public Especialidad actualizar(Especialidad aplicacion);
}
