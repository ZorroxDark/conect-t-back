package com.conectate.data.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the usuario_roles database table.
 * 
 */
@Entity
@Table(name="usuario_roles")
@NamedQuery(name="UsuarioRole.findAll", query="SELECT u FROM UsuarioRole u")
public class UsuarioRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usu_rol", nullable=false)
	private int idUsuRol;
	
	@Column(name="id_usuario", nullable=false , insertable=false ,updatable=false)
	private int idUsuario;

	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;
	

	//bi-directional many-to-one association to CatStatusUsuario
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="usu_cat_rol", nullable=false)
	private CatRol CatRol;
	

	//bi-directional many-to-one association to CatRol 
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuarioRole;


	


	public UsuarioRole() {
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

	

	public int getIdUsuRol() {
		return this.idUsuRol;
	}

	public void setIdUsuRol(int idUsuRol) {
		this.idUsuRol = idUsuRol;
	}

	
	
//    
//	//Funciono
//	public Usuario getCatRol() {
//		return catRol;
//	}
//
//
//
//	public void setCatRol(Usuario catRol) {
//		this.catRol = catRol;
//	}



	public CatRol getCatRol() {
		return CatRol;
	}



	public void setCatRol(CatRol catRol) {
		CatRol = catRol;
	}



	public int getIdUsuario() {
		return this.idUsuario;
	}



	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	public Usuario getUsuarioRole() {
		return usuarioRole;
	}



	public void setUsuarioRole(Usuario usuarioRole) {
		this.usuarioRole = usuarioRole;
	}







}
