package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_rol database table.
 * 
 */
@Entity
@Table(name="cat_rol")
@NamedQuery(name="CatRol.findAll", query="SELECT c FROM CatRol c")
public class CatRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcat_rol", unique=true, nullable=false)
	private int idcatRol;

	@Column(name="clave_rol", nullable=false, length=45)
	private String claveRol;

	@Column(name="clave_rol", nullable=false, length=45)
	private String claveRol;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(nullable=false, length=45)
	private String desc;

	@Column(nullable=false, length=45)
	private String desc;

	@Column(name="id_cat_rol", unique=true, nullable=false)
	private int idCatRol;

	@Column(nullable=false, length=45)
	private String nombre;

	@Column(nullable=false, length=45)
	private String nombre;

	@Column(nullable=false)
	private byte status;

	@Column(nullable=false)
	private byte status;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="catRol1")
	private List<UsuarioRole> usuarioRoles1;

	//bi-directional many-to-one association to UsuarioRole
	@OneToMany(mappedBy="catRol2")
	private List<UsuarioRole> usuarioRoles2;

	public CatRol() {
	}

	public int getIdcatRol() {
		return this.idcatRol;
	}

	public void setIdcatRol(int idcatRol) {
		this.idcatRol = idcatRol;
	}

	public String getClaveRol() {
		return this.claveRol;
	}

	public void setClaveRol(String claveRol) {
		this.claveRol = claveRol;
	}

	public String getClaveRol() {
		return this.claveRol;
	}

	public void setClaveRol(String claveRol) {
		this.claveRol = claveRol;
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

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getIdCatRol() {
		return this.idCatRol;
	}

	public void setIdCatRol(int idCatRol) {
		this.idCatRol = idCatRol;
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

	public List<UsuarioRole> getUsuarioRoles1() {
		return this.usuarioRoles1;
	}

	public void setUsuarioRoles1(List<UsuarioRole> usuarioRoles1) {
		this.usuarioRoles1 = usuarioRoles1;
	}

	public UsuarioRole addUsuarioRoles1(UsuarioRole usuarioRoles1) {
		getUsuarioRoles1().add(usuarioRoles1);
		usuarioRoles1.setCatRol1(this);

		return usuarioRoles1;
	}

	public UsuarioRole removeUsuarioRoles1(UsuarioRole usuarioRoles1) {
		getUsuarioRoles1().remove(usuarioRoles1);
		usuarioRoles1.setCatRol1(null);

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
		usuarioRoles2.setCatRol2(this);

		return usuarioRoles2;
	}

	public UsuarioRole removeUsuarioRoles2(UsuarioRole usuarioRoles2) {
		getUsuarioRoles2().remove(usuarioRoles2);
		usuarioRoles2.setCatRol2(null);

		return usuarioRoles2;
	}

}