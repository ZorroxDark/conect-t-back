package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the direccion_congregante database table.
 * 
 */
@Entity
@Table(name="direccion_congregante")
@NamedQuery(name="DireccionCongregante.findAll", query="SELECT d FROM DireccionCongregante d")
public class DireccionCongregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="iddir_iglesia", unique=true, nullable=false)
	private int iddirIglesia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="dir_calle", nullable=false, length=300)
	private String dirCalle;

	@Column(name="dir_entre_calles", length=200)
	private String dirEntreCalles;

	@Column(name="dir_num_ext", length=10)
	private String dirNumExt;

	@Column(name="dir_num_int", length=10)
	private String dirNumInt;

	//bi-directional many-to-one association to CatDireccion
	@ManyToOne
	@JoinColumn(name="id_direccion", nullable=false)
	private CatDireccion catDireccion;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	public DireccionCongregante() {
	}

	public int getIddirIglesia() {
		return this.iddirIglesia;
	}

	public void setIddirIglesia(int iddirIglesia) {
		this.iddirIglesia = iddirIglesia;
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

	public String getDirCalle() {
		return this.dirCalle;
	}

	public void setDirCalle(String dirCalle) {
		this.dirCalle = dirCalle;
	}

	public String getDirEntreCalles() {
		return this.dirEntreCalles;
	}

	public void setDirEntreCalles(String dirEntreCalles) {
		this.dirEntreCalles = dirEntreCalles;
	}

	public String getDirNumExt() {
		return this.dirNumExt;
	}

	public void setDirNumExt(String dirNumExt) {
		this.dirNumExt = dirNumExt;
	}

	public String getDirNumInt() {
		return this.dirNumInt;
	}

	public void setDirNumInt(String dirNumInt) {
		this.dirNumInt = dirNumInt;
	}

	public CatDireccion getCatDireccion() {
		return this.catDireccion;
	}

	public void setCatDireccion(CatDireccion catDireccion) {
		this.catDireccion = catDireccion;
	}

	public Congregante getCongregante() {
		return this.congregante;
	}

	public void setCongregante(Congregante congregante) {
		this.congregante = congregante;
	}

}