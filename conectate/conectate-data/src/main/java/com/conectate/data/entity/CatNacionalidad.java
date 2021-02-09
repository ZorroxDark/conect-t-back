package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_nacionalidad database table.
 * 
 */
@Entity
@Table(name="cat_nacionalidad")
@NamedQuery(name="CatNacionalidad.findAll", query="SELECT c FROM CatNacionalidad c")
public class CatNacionalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idnacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="gentilicio_nac", nullable=false, length=150)
	private String gentilicioNac;

	@Column(name="iso_nac", nullable=false, length=5)
	private String isoNac;

	@Column(name="pais_nac", nullable=false, length=150)
	private String paisNac;

	//bi-directional many-to-one association to Congregante
	@OneToMany(mappedBy="catNacionalidad")
	private List<Congregante> congregantes;

	public CatNacionalidad() {
	}

	public int getIdnacion() {
		return this.idnacion;
	}

	public void setIdnacion(int idnacion) {
		this.idnacion = idnacion;
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

	public String getGentilicioNac() {
		return this.gentilicioNac;
	}

	public void setGentilicioNac(String gentilicioNac) {
		this.gentilicioNac = gentilicioNac;
	}

	public String getIsoNac() {
		return this.isoNac;
	}

	public void setIsoNac(String isoNac) {
		this.isoNac = isoNac;
	}

	public String getPaisNac() {
		return this.paisNac;
	}

	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}

	public List<Congregante> getCongregantes() {
		return this.congregantes;
	}

	public void setCongregantes(List<Congregante> congregantes) {
		this.congregantes = congregantes;
	}

	public Congregante addCongregante(Congregante congregante) {
		getCongregantes().add(congregante);
		congregante.setCatNacionalidad(this);

		return congregante;
	}

	public Congregante removeCongregante(Congregante congregante) {
		getCongregantes().remove(congregante);
		congregante.setCatNacionalidad(null);

		return congregante;
	}

}