package com.digitalizacion.documentos.servicio.impl;

import javax.ejb.Stateless;

import com.digitalizacion.documentos.entity.Seccion;
import com.digitalizacion.documentos.servicio.SeccionServicioLocal;
import com.digitalizacion.documentos.servicio.SeccionServicioRemoto;

@Stateless
public class SeccionServicioImpl implements SeccionServicioLocal,SeccionServicioRemoto{

	public void crear(Seccion aplicacion) {
		// TODO Auto-generated method stub
		
	}

	public Seccion actualizar(Seccion aplicacion) {
		// TODO Auto-generated method stub
		return null;
	}

}
