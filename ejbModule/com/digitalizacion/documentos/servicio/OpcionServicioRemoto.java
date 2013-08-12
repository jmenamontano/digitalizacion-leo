package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Opcion;

@Remote
public interface OpcionServicioRemoto {
	public void crear(Opcion aplicacion);

	public Opcion actualizar(Opcion aplicacion);
}
