package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Perfil;

@Local
public interface PerfilServicioLocal {
	public void crear(Perfil aplicacion);

	public Perfil actualizar(Perfil aplicacion);

}
