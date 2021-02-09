package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the congregante_iglesia database table.
 * 
 */
@Entity
@Table(name="congregante_iglesia")
@NamedQuery(name="CongreganteIglesia.findAll", query="SELECT c FROM CongreganteIglesia c")
public class CongreganteIglesia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcon_igle", unique=true, nullable=false)
	private int idconIgle;

	@Column(nullable=false)
	private byte activo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	//bi-directional many-to-one association to Iglesia
	@ManyToOne
	@JoinColumn(name="idiglesia", nullable=false)
	private Iglesia iglesia;

	public CongreganteIglesia() {
	}

	public int getIdconIgle() {
		return this.idconIgle;
	}

	public void setIdconIgle(int idconIgle) {
		this.idconIgle = idconIgle;
	}

	public byte getActivo() {
		return this.activo;
	}

	public void setActivo(byte activo) {
		this.activo = activo;
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

	public Congregante getCongregante() {
		return this.congregante;
	}

	public void setCongregante(Congregante congregante) {
		this.congregante = congregante;
	}

	public Iglesia getIglesia() {
		return this.iglesia;
	}

	public void setIglesia(Iglesia iglesia) {
		this.iglesia = iglesia;
	}

}