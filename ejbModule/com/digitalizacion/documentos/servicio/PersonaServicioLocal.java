package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Persona;

@Local
public interface PersonaServicioLocal {
	public void crear(Persona aplicacion);

	public Persona actualizar(Persona aplicacion);
}
