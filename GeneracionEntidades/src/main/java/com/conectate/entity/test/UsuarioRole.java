package com.conectate.entity.test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


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
	@Column(name="id_rol_usuario", unique=true, nullable=false)
	private int idRolUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="id_cat_rol", nullable=false)
	private int idCatRol;

	@Column(name="id_cat_rol")
	private int idCatRol;

	@Column(name="id_rol_usuario", nullable=false)
	private int idRolUsuario;

	@Column(name="id_usu_rol", nullable=false)
	private int idUsuRol;

	@Column(name="id_usuario", nullable=false)
	private int idUsuario;

	@Column(name="usu_cat_rol", nullable=false)
	private int usuCatRol;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_user", nullable=false)
	private Usuario usuario;

	public UsuarioRole() {
	}

	public int getIdRolUsuario() {
		return this.idRolUsuario;
	}

	public void setIdRolUsuario(int idRolUsuario) {
		this.idRolUsuario = idRolUsuario;
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

	public int getIdCatRol() {
		return this.idCatRol;
	}

	public void setIdCatRol(int idCatRol) {
		this.idCatRol = idCatRol;
	}

	public int getIdRolUsuario() {
		return this.idRolUsuario;
	}

	public void setIdRolUsuario(int idRolUsuario) {
		this.idRolUsuario = idRolUsuario;
	}

	public int getIdUsuRol() {
		return this.idUsuRol;
	}

	public void setIdUsuRol(int idUsuRol) {
		this.idUsuRol = idUsuRol;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getUsuCatRol() {
		return this.usuCatRol;
	}

	public void setUsuCatRol(int usuCatRol) {
		this.usuCatRol = usuCatRol;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}