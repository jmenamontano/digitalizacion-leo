package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.PersonaDocumento;
import com.digitalizacion.documentos.servicio.PersonaDocumentoServicioLocal;
import com.digitalizacion.documentos.servicio.PersonaDocumentoServicioRemoto;

@Stateless
public class PersonaDocumentoServicioImpl implements PersonaDocumentoServicioLocal,PersonaDocumentoServicioRemoto {

	public void crear(PersonaDocumento aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public PersonaDocumento actualizar(PersonaDocumento aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
