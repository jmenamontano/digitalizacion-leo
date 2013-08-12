package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Documento;

@Local
public interface DocumentoServicioLocal {
	public void crear(Documento aplicacion);

	public Documento actualizar(Documento aplicacion);

}
