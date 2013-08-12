package com.digitalizacion.documentos.servicio;

import javax.ejb.Local;

import com.digitalizacion.documentos.entity.Matricula;

@Local
public interface MatriculaServicioLocal {
	public void crear(Matricula aplicacion);

	public Matricula actualizar(Matricula aplicacion);

}
