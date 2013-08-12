package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.OpcionesPerfil;

@Local
public interface OpcionesPerfilServicioLocal {
	public void crear(OpcionesPerfil aplicacion);

	public OpcionesPerfil actualizar(OpcionesPerfil aplicacion);
}
