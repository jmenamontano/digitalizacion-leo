package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.UsuarioPerfil;

@Remote
public interface UsuarioPerfilServicioRemoto {
	public void crear(UsuarioPerfil aplicacion);

	public UsuarioPerfil actualizar(UsuarioPerfil aplicacion);
}
