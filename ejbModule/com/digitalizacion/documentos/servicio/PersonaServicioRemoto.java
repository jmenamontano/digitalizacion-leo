package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Persona;

@Remote
public interface PersonaServicioRemoto {
	public void crear(Persona aplicacion);

	public Persona actualizar(Persona aplicacion);
}
