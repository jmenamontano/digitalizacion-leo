package com.digitalizacion.documentos.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the seg_claves_opciones database table.
 * 
 */
@Entity
@NamedQueries({
	@NamedQuery(name = "Opcion.findAll", query = "select o from Opcion o"),
	@NamedQuery(name = "Opcion.findByPadre", query = "select o from Opcion o where o.opcPadre =: opcPadre"),
	@NamedQuery(name = "Opcion.findByCodigo", query = "select o from Opcion o where o.opcId =: opcId") })
@Table(name="seg_claves_opciones")
public class Opcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SEG_CLAVES_OPCIONES_OPCID_GENERATOR", sequenceName="SEQ_SEG_CLAVES_OPCIONES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEG_CLAVES_OPCIONES_OPCID_GENERATOR")
	@Column(name="opc_id")
	private Long opcId;

	@Column(name="opc_descripcion")
	private String opcDescripcion;

	@Column(name="opc_etiqueta")
	private String opcEtiqueta;

	@Column(name="opc_orden")
	private Long opcOrden;

	@Column(name="opc_pagina")
	private String opcPagina;

	//bi-directional many-to-one association to Opcion
    @ManyToOne
	@JoinColumn(name="opc_padre")
	private Opcion opcPadre;

	//bi-directional many-to-one association to Opcion
	@OneToMany(mappedBy="opcPadre")
	private Set<Opcion> segClavesOpciones;

	//bi-directional many-to-one association to OpcionesPerfil
	@OneToMany(mappedBy="opcionPerfil")
	private Set<OpcionesPerfil> opcionesPerfil;

    public Opcion() {
    }

	public Long getOpcId() {
		return this.opcId;
	}

	public void setOpcId(Long opcId) {
		this.opcId = opcId;
	}

	public String getOpcDescripcion() {
		return this.opcDescripcion;
	}

	public void setOpcDescripcion(String opcDescripcion) {
		this.opcDescripcion = opcDescripcion;
	}

	public String getOpcEtiqueta() {
		return this.opcEtiqueta;
	}

	public void setOpcEtiqueta(String opcEtiqueta) {
		this.opcEtiqueta = opcEtiqueta;
	}

	public Long getOpcOrden() {
		return this.opcOrden;
	}

	public void setOpcOrden(Long opcOrden) {
		this.opcOrden = opcOrden;
	}

	public String getOpcPagina() {
		return this.opcPagina;
	}

	public void setOpcPagina(String opcPagina) {
		this.opcPagina = opcPagina;
	}

	public Opcion getOpcPadre() {
		return this.opcPadre;
	}

	public void setOpcPadre(Opcion opcPadre) {
		this.opcPadre = opcPadre;
	}
	
	public Set<Opcion> getSegClavesOpciones() {
		return this.segClavesOpciones;
	}

	public void setSegClavesOpciones(Set<Opcion> segClavesOpciones) {
		this.segClavesOpciones = segClavesOpciones;
	}
	
	public Set<OpcionesPerfil> getOpcionesPerfil() {
		return this.opcionesPerfil;
	}

	public void setOpcionesPerfil(Set<OpcionesPerfil> opcionesPerfil) {
		this.opcionesPerfil = opcionesPerfil;
	}
	
}