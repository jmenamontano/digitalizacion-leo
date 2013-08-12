package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Modalidad;

@Remote
public interface ModalidadServicioRemoto {
	public void crear(Modalidad aplicacion);

	public Modalidad actualizar(Modalidad aplicacion);
}
