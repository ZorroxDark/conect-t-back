package com.conectate.entity;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Column(name="id_rol_usuario", nullable=false)
	private int idRolUsuario;

	@Column(name="id_usu_rol", nullable=false)
	private int idUsuRol;

	//bi-directional many-to-one association to CatRol
	@ManyToOne
	@JoinColumn(name="id_cat_rol", nullable=false)
	private CatRol catRol1;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_user", nullable=false)
	private Usuario usuario1;

	//bi-directional many-to-one association to CatRol
	@ManyToOne
	@JoinColumn(name="usu_cat_rol", nullable=false)
	private CatRol catRol2;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_usuario", nullable=false)
	private Usuario usuario2;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="id_user", nullable=false)
	private Usuario usuario3;

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

	public CatRol getCatRol1() {
		return this.catRol1;
	}

	public void setCatRol1(CatRol catRol1) {
		this.catRol1 = catRol1;
	}

	public Usuario getUsuario1() {
		return this.usuario1;
	}

	public void setUsuario1(Usuario usuario1) {
		this.usuario1 = usuario1;
	}

	public CatRol getCatRol2() {
		return this.catRol2;
	}

	public void setCatRol2(CatRol catRol2) {
		this.catRol2 = catRol2;
	}

	public Usuario getUsuario2() {
		return this.usuario2;
	}

	public void setUsuario2(Usuario usuario2) {
		this.usuario2 = usuario2;
	}

	public Usuario getUsuario3() {
		return this.usuario3;
	}

	public void setUsuario3(Usuario usuario3) {
		this.usuario3 = usuario3;
	}

}