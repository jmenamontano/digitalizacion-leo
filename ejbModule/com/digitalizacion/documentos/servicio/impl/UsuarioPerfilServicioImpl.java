package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.UsuarioPerfil;
import com.digitalizacion.documentos.servicio.UsuarioPerfilServicioLocal;
import com.digitalizacion.documentos.servicio.UsuarioPerfilServicioRemoto;

@Stateless
public class UsuarioPerfilServicioImpl implements UsuarioPerfilServicioLocal,UsuarioPerfilServicioRemoto{

	public void crear(UsuarioPerfil aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public UsuarioPerfil actualizar(UsuarioPerfil aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
