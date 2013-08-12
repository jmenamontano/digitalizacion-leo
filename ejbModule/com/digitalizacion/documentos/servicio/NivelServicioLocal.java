package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Nivel;

@Local
public interface NivelServicioLocal {
	public void crear(Nivel aplicacion);

	public Nivel actualizar(Nivel aplicacion);
}
