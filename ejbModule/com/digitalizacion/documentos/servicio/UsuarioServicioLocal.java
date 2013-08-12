package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Usuario;

@Local
public interface UsuarioServicioLocal {
	public void crear(Usuario aplicacion);

	public Usuario actualizar(Usuario aplicacion);
}
