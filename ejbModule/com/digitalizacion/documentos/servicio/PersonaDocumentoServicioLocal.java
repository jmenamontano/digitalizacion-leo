package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.PersonaDocumento;

@Local
public interface PersonaDocumentoServicioLocal {
	public void crear(PersonaDocumento aplicacion);

	public PersonaDocumento actualizar(PersonaDocumento aplicacion);
}
