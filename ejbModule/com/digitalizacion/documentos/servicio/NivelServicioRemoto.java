package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Nivel;

@Remote
public interface NivelServicioRemoto {
	public void crear(Nivel aplicacion);

	public Nivel actualizar(Nivel aplicacion);

}
