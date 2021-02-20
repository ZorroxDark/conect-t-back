package com.conectate.entity.test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cat_rol", unique=true, nullable=false)
	private int idCatRol;

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

	@Column(name="id_cat_rol", nullable=false)
	private int idCatRol;

	@Column(nullable=false, length=45)
	private String nombre;

	@Column(nullable=false, length=45)
	private String nombre;

	@Column(nullable=false)
	private byte status;

	@Column(nullable=false)
	private byte status;

	public CatRol() {
	}

	public int getIdCatRol() {
		return this.idCatRol;
	}

	public void setIdCatRol(int idCatRol) {
		this.idCatRol = idCatRol;
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

}