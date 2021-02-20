package com.conectate.entity.test;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


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
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_status_con", unique=true, nullable=false)
	private int idStatusCon;

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

	public CatStatusCongregante() {
	}

	public int getIdStatusCon() {
		return this.idStatusCon;
	}

	public void setIdStatusCon(int idStatusCon) {
		this.idStatusCon = idStatusCon;
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

}