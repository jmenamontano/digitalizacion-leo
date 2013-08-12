package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.Persona;
import com.digitalizacion.documentos.servicio.PersonaServicioLocal;
import com.digitalizacion.documentos.servicio.PersonaServicioRemoto;

@Stateless
public class PersonaServicioImpl implements PersonaServicioLocal,PersonaServicioRemoto {

	public void crear(Persona aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public Persona actualizar(Persona aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
