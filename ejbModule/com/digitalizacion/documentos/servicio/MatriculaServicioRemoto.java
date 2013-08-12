package com.digitalizacion.documentos.servicio;

import javax.ejb.Remote;

import com.digitalizacion.documentos.entity.Matricula;

@Remote
public interface MatriculaServicioRemoto {
	public void crear(Matricula aplicacion);

	public Matricula actualizar(Matricula aplicacion);

}
