package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Perfil;

@Remote
public interface PerfilServicioRemoto {
	public void crear(Perfil aplicacion);

	public Perfil actualizar(Perfil aplicacion);
}
