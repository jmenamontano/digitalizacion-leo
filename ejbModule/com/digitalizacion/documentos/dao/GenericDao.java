package com.digitalizacion.documentos.dao;

import java.io.Serializable;
import java.util.List;

import com.digitalizacion.documentos.exception.EntidadNoExisteException;
import com.digitalizacion.documentos.util.NamedQueryParameter;

/**
 * Interface para DAO Generico utilizando Generics de Java 5.0.
 * 
 * @author Juanma
 * 
 * @param <T>
 * @param <PK>
 */
public interface GenericDao<T, PK extends Serializable> {

	/**
	 * Finder Gen�rico.
	 * 
	 * @param queryName
	 * @return
	 */
	public List<T> findByNamedQuery(String queryName);

	/**
	 * Finder que recibe un solo par�metro.
	 * 
	 * @param queryName
	 * @param name
	 * @param value
	 * @return
	 */
	public List<T> findByNamedQueryNamedParameter(String queryName, String name, Object value);

	/**
	 * Finder que recibe una lista de par�metros.
	 * 
	 * @param queryName
	 * @param args
	 * @return
	 */
	public List<T> findByNamedQueryNamedParameter(String queryName, NamedQueryParameter... args);

	/**
	 * Gen�rico para persistir la entidad.
	 * 
	 * @param o
	 */
	public void guardar(T o);

	/**
	 * Gen�rico para actualizar la entidad.
	 * 
	 * @param o
	 */
	public T actualizar(T o);

	/**
	 * Gen�rico para buscar de acuerdo a la clave principal.
	 * 
	 * @param codigo
	 * @return
	 * @throws EntidadNoExisteException
	 */
	public T findByPK(PK codigo) throws EntidadNoExisteException;

	/**
	 * Gen�rico utilizado para la eliminaci�n de datos de la entidad.
	 * 
	 * @param o
	 */
	public void delete(T o);

	/**
	 * Finder utilizado par obtener los registros ordenados.
	 * 
	 * @param propiedadOrden
	 * @param primerResultado
	 * @param resultadosMaximos
	 * @return
	 */
	public List<T>findAll(String propiedadOrden, Integer primerResultado, Integer resultadosMaximos);

}
