package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.UsuarioPerfil;

@Local
public interface UsuarioPerfilServicioLocal {
	public void crear(UsuarioPerfil aplicacion);

	public UsuarioPerfil actualizar(UsuarioPerfil aplicacion);
}
