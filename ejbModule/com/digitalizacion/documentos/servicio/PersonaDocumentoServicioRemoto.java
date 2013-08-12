package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.PersonaDocumento;

@Remote
public interface PersonaDocumentoServicioRemoto {
	public void crear(PersonaDocumento aplicacion);

	public PersonaDocumento actualizar(PersonaDocumento aplicacion);
}
