package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.Documento;
import com.digitalizacion.documentos.servicio.DocumentoServicioLocal;
import com.digitalizacion.documentos.servicio.DocumentoServicioRemoto;

@Stateless
public class DocumentoServicioImpl implements DocumentoServicioLocal, DocumentoServicioRemoto{

	public void crear(Documento aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public Documento actualizar(Documento aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
