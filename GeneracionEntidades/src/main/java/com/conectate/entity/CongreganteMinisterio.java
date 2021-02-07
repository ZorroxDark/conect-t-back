package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the congregante_ministerio database table.
 * 
 */
@Entity
@Table(name="congregante_ministerio")
@NamedQuery(name="CongreganteMinisterio.findAll", query="SELECT c FROM CongreganteMinisterio c")
public class CongreganteMinisterio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcon_min", unique=true, nullable=false)
	private int idconMin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	//bi-directional many-to-one association to CargoMinisterio
	@ManyToOne
	@JoinColumn(name="idcargomini", nullable=false)
	private CargoMinisterio cargoMinisterio;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	//bi-directional many-to-one association to Ministerio
	@ManyToOne
	@JoinColumn(name="idministerio", nullable=false)
	private Ministerio ministerio;

	public CongreganteMinisterio() {
	}

	public int getIdconMin() {
		return this.idconMin;
	}

	public void setIdconMin(int idconMin) {
		this.idconMin = idconMin;
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

	public CargoMinisterio getCargoMinisterio() {
		return this.cargoMinisterio;
	}

	public void setCargoMinisterio(CargoMinisterio cargoMinisterio) {
		this.cargoMinisterio = cargoMinisterio;
	}

	public Congregante getCongregante() {
		return this.congregante;
	}

	public void setCongregante(Congregante congregante) {
		this.congregante = congregante;
	}

	public Ministerio getMinisterio() {
		return this.ministerio;
	}

	public void setMinisterio(Ministerio ministerio) {
		this.ministerio = ministerio;
	}

}