package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.Usuario;
import com.digitalizacion.documentos.servicio.UsuarioServicioLocal;
import com.digitalizacion.documentos.servicio.UsuarioServicioRemoto;

@Stateless
public class UsuarioServicioImpl implements UsuarioServicioLocal,UsuarioServicioRemoto {

	public void crear(Usuario aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public Usuario actualizar(Usuario aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
