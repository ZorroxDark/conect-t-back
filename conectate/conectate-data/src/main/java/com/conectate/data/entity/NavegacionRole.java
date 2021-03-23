package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the navegacion_roles database table.
 * 
 */
@Entity
@Table(name="navegacion_roles")
@NamedQuery(name="NavegacionRole.findAll", query="SELECT n FROM NavegacionRole n")
public class NavegacionRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_navegacion_roles", unique=true, nullable=false)
	private int idNavegacionRoles;

	

	@Column(name="id_cat_rol", nullable=false)
	private int idCatRol;

	//bi-directional many-to-one association to CatNavegacion
	@ManyToOne
	@JoinColumn(name="id_cat_navegacion", nullable=false)
	private CatNavegacion catNavegacion;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	public NavegacionRole() {
	}

	public int getIdNavegacionRoles() {
		return this.idNavegacionRoles;
	}

	public void setIdNavegacionRoles(int idNavegacionRoles) {
		this.idNavegacionRoles = idNavegacionRoles;
	}

	public Date getCtrlFechaCreate() {
		return this.ctrlFechaCreate;
	}

	public void setCtrlFechaCreate(Date ctrlFechaCreate) {
		this.ctrlFechaCreate = ctrlFechaCreate;
	}

	public Date getCtrlFechaUpdate() {
		return this.ctrlFechaUpdate;
	}

	public void setCtrlFechaUpdate(Date ctrlFechaUpdate) {
		this.ctrlFechaUpdate = ctrlFechaUpdate;
	}

	public int getCtrlUserMod() {
		return this.ctrlUserMod;
	}

	public void setCtrlUserMod(int ctrlUserMod) {
		this.ctrlUserMod = ctrlUserMod;
	}

	public int getIdCatRol() {
		return this.idCatRol;
	}

	public void setIdCatRol(int idCatRol) {
		this.idCatRol = idCatRol;
	}

	public CatNavegacion getCatNavegacion() {
		return this.catNavegacion;
	}

	public void setCatNavegacion(CatNavegacion catNavegacion) {
		this.catNavegacion = catNavegacion;
	}

}