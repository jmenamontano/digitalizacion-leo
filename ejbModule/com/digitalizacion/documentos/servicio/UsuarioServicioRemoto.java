package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Usuario;

@Remote
public interface UsuarioServicioRemoto {
	public void crear(Usuario aplicacion);

	public Usuario actualizar(Usuario aplicacion);
}
