package com.conectate.entity.test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", unique=true, nullable=false)
	private int idUsuario;

	@Column(nullable=false, length=50)
	private String apellido;

	@Column(length=255)
	private String apellido;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(nullable=false, length=120)
	private String email;

	@Column(length=255)
	private String email;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_alta", nullable=false)
	private Date fechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_alta")
	private Date fechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_mod", nullable=false)
	private Date fechaMod;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_mod")
	private Date fechaMod;

	@Column(nullable=false, length=50)
	private String nombre;

	@Column(length=255)
	private String nombre;

	@Column(nullable=false, length=20)
	private String pwd;

	@Column(length=255)
	private String pwd;

	private byte status;

	@Column(nullable=false)
	private byte status;

	@Column(name="user_email", length=300)
	private String userEmail;

	@Column(name="user_id_con", nullable=false)
	private int userIdCon;

	@Column(name="user_matricula", nullable=false, length=10)
	private String userMatricula;

	@Column(name="user_pwd", nullable=false, length=200)
	private String userPwd;

	@Column(name="user_status", nullable=false)
	private int userStatus;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario")
	private List<UsuarioRole> usuarioRoles;

	public Usuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}

	public Date getFechaMod() {
		return this.fechaMod;
	}

	public void setFechaMod(Date fechaMod) {
		this.fechaMod = fechaMod;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
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

	public int getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public List<UsuarioRole> getUsuarioRoles() {
		return this.usuarioRoles;
	}

	public void setUsuarioRoles(List<UsuarioRole> usuarioRoles) {
		this.usuarioRoles = usuarioRoles;
	}

	public UsuarioRole addUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().add(usuarioRole);
		usuarioRole.setUsuario(this);

		return usuarioRole;
	}

	public UsuarioRole removeUsuarioRole(UsuarioRole usuarioRole) {
		getUsuarioRoles().remove(usuarioRole);
		usuarioRole.setUsuario(null);

		return usuarioRole;
	}

}