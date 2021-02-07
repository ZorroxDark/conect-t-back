package com.conectate.entity;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
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

	@Column(unique=true, nullable=false)
	private int idusuario;

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

	@Column(name="user_pwd", nullable=false, length=45)
	private String userPwd;

	//bi-directional many-to-one association to CatStatusUsuario
	@ManyToOne
	@JoinColumn(name="user_status", nullable=false)
	private CatStatusUsuario catStatusUsuario;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario1")
	private List<UsuarioRole> usuarioRoles1;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario2")
	private List<UsuarioRole> usuarioRoles2;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="usuario3")
	private List<UsuarioRole> usuarioRoles3;

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

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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

	public UsuarioRole addUsuarioRoles1(UsuarioRole usuarioRoles1) {
		getUsuarioRoles1().add(usuarioRoles1);
		usuarioRoles1.setUsuario1(this);

		return usuarioRoles1;
	}

	public UsuarioRole removeUsuarioRoles1(UsuarioRole usuarioRoles1) {
		getUsuarioRoles1().remove(usuarioRoles1);
		usuarioRoles1.setUsuario1(null);

		return usuarioRoles1;
	}

	public List<UsuarioRole> getUsuarioRoles2() {
		return this.usuarioRoles2;
	}

	public void setUsuarioRoles2(List<UsuarioRole> usuarioRoles2) {
		this.usuarioRoles2 = usuarioRoles2;
	}

	public UsuarioRole addUsuarioRoles2(UsuarioRole usuarioRoles2) {
		getUsuarioRoles2().add(usuarioRoles2);
		usuarioRoles2.setUsuario2(this);

		return usuarioRoles2;
	}

	public UsuarioRole removeUsuarioRoles2(UsuarioRole usuarioRoles2) {
		getUsuarioRoles2().remove(usuarioRoles2);
		usuarioRoles2.setUsuario2(null);

		return usuarioRoles2;
	}

	public List<UsuarioRole> getUsuarioRoles3() {
		return this.usuarioRoles3;
	}

	public void setUsuarioRoles3(List<UsuarioRole> usuarioRoles3) {
		this.usuarioRoles3 = usuarioRoles3;
	}

	public UsuarioRole addUsuarioRoles3(UsuarioRole usuarioRoles3) {
		getUsuarioRoles3().add(usuarioRoles3);
		usuarioRoles3.setUsuario3(this);

		return usuarioRoles3;
	}

	public UsuarioRole removeUsuarioRoles3(UsuarioRole usuarioRoles3) {
		getUsuarioRoles3().remove(usuarioRoles3);
		usuarioRoles3.setUsuario3(null);

		return usuarioRoles3;
	}

}