package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_status_congregante database table.
 * 
 */
@Entity
@Table(name="cat_status_congregante")
@NamedQuery(name="CatStatusCongregante.findAll", query="SELECT c FROM CatStatusCongregante c")
public class CatStatusCongregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idstatus_con", unique=true, nullable=false)
	private int idstatusCon;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="status_act", nullable=false)
	private byte statusAct;

	@Column(name="status_con_nom", nullable=false, length=45)
	private String statusConNom;

	//bi-directional many-to-one association to Congregante
	@OneToMany(mappedBy="catStatusCongregante")
	private List<Congregante> congregantes;

	public CatStatusCongregante() {
	}

	public int getIdstatusCon() {
		return this.idstatusCon;
	}

	public void setIdstatusCon(int idstatusCon) {
		this.idstatusCon = idstatusCon;
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

	public byte getStatusAct() {
		return this.statusAct;
	}

	public void setStatusAct(byte statusAct) {
		this.statusAct = statusAct;
	}

	public String getStatusConNom() {
		return this.statusConNom;
	}

	public void setStatusConNom(String statusConNom) {
		this.statusConNom = statusConNom;
	}

	public List<Congregante> getCongregantes() {
		return this.congregantes;
	}

	public void setCongregantes(List<Congregante> congregantes) {
		this.congregantes = congregantes;
	}

	public Congregante addCongregante(Congregante congregante) {
		getCongregantes().add(congregante);
		congregante.setCatStatusCongregante(this);

		return congregante;
	}

	public Congregante removeCongregante(Congregante congregante) {
		getCongregantes().remove(congregante);
		congregante.setCatStatusCongregante(null);

		return congregante;
	}

}