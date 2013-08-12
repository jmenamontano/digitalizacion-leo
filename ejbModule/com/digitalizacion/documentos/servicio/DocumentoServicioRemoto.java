package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Documento;

@Remote
public interface DocumentoServicioRemoto {
	public void crear(Documento aplicacion);

	public Documento actualizar(Documento aplicacion);

}
