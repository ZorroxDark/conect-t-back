package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_edo_civil database table.
 * 
 */
@Entity
@Table(name="cat_edo_civil")
@NamedQuery(name="CatEdoCivil.findAll", query="SELECT c FROM CatEdoCivil c")
public class CatEdoCivil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idedocivil;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="edo_civil", nullable=false, length=45)
	private String edoCivil;

	@Column(name="edo_desc", length=200)
	private String edoDesc;

	//bi-directional many-to-one association to Congregante
	@OneToMany(mappedBy="catEdoCivil")
	private List<Congregante> congregantes;

	public CatEdoCivil() {
	}

	public int getIdedocivil() {
		return this.idedocivil;
	}

	public void setIdedocivil(int idedocivil) {
		this.idedocivil = idedocivil;
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

	public String getEdoCivil() {
		return this.edoCivil;
	}

	public void setEdoCivil(String edoCivil) {
		this.edoCivil = edoCivil;
	}

	public String getEdoDesc() {
		return this.edoDesc;
	}

	public void setEdoDesc(String edoDesc) {
		this.edoDesc = edoDesc;
	}

	public List<Congregante> getCongregantes() {
		return this.congregantes;
	}

	public void setCongregantes(List<Congregante> congregantes) {
		this.congregantes = congregantes;
	}

	public Congregante addCongregante(Congregante congregante) {
		getCongregantes().add(congregante);
		congregante.setCatEdoCivil(this);

		return congregante;
	}

	public Congregante removeCongregante(Congregante congregante) {
		getCongregantes().remove(congregante);
		congregante.setCatEdoCivil(null);

		return congregante;
	}

}