package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Seccion;

@Remote
public interface SeccionServicioRemoto {
	public void crear(Seccion aplicacion);

	public Seccion actualizar(Seccion aplicacion);
}
