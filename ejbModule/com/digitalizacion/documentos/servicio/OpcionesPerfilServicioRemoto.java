package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.OpcionesPerfil;

@Remote
public interface OpcionesPerfilServicioRemoto {
	public void crear(OpcionesPerfil aplicacion);

	public OpcionesPerfil actualizar(OpcionesPerfil aplicacion);
}
