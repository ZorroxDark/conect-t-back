package com.conectate.data.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
@NamedQuery(name="Usuario.findAll", query="SELECT u FROM Usuario u")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usuario", unique=true, nullable=false)
	private int idUsuario;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	
	@Column(name="user_email", length=300)
	private String userEmail;

	@Column(name="user_id_con", nullable=false)
	private int userIdCon;

	@Column(name="user_matricula", nullable=false, length=10)
	private String userMatricula;

	@Column(name="user_pwd", nullable=false, length=45)
	private String userPwd;

	//bi-directional many-to-one association to CatStatusUsuario
	@ManyToOne
	@JoinColumn(name="user_status", nullable=false)
	private CatStatusUsuario catStatusUsuario;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario1")
	private List<UsuarioRole> usuarioRoles1;

	

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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

	



	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getUserIdCon() {
		return this.userIdCon;
	}

	public void setUserIdCon(int userIdCon) {
		this.userIdCon = userIdCon;
	}

	public String getUserMatricula() {
		return this.userMatricula;
	}

	public void setUserMatricula(String userMatricula) {
		this.userMatricula = userMatricula;
	}

	public String getUserPwd() {
		return this.userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public CatStatusUsuario getCatStatusUsuario() {
		return this.catStatusUsuario;
	}

	public void setCatStatusUsuario(CatStatusUsuario catStatusUsuario) {
		this.catStatusUsuario = catStatusUsuario;
	}

	public List<UsuarioRole> getUsuarioRoles1() {
		return this.usuarioRoles1;
	}

	public void setUsuarioRoles1(List<UsuarioRole> usuarioRoles1) {
		this.usuarioRoles1 = usuarioRoles1;
	}

	

	

	

}