package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cargo_ministerio database table.
 * 
 */
@Entity
@Table(name="cargo_ministerio")
@NamedQuery(name="CargoMinisterio.findAll", query="SELECT c FROM CargoMinisterio c")
public class CargoMinisterio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idcargo_ministerio", unique=true, nullable=false)
	private int idcargoMinisterio;

	@Column(name="cargo_min_desc", nullable=false, length=250)
	private String cargoMinDesc;

	@Column(name="cargo_min_nombre", nullable=false, length=45)
	private String cargoMinNombre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	//bi-directional many-to-one association to Ministerio
	@ManyToOne
	@JoinColumn(name="idministerio", nullable=false)
	private Ministerio ministerio;

	//bi-directional many-to-one association to CongreganteMinisterio
	@OneToMany(mappedBy="cargoMinisterio")
	private List<CongreganteMinisterio> congreganteMinisterios;

	public CargoMinisterio() {
	}

	public int getIdcargoMinisterio() {
		return this.idcargoMinisterio;
	}

	public void setIdcargoMinisterio(int idcargoMinisterio) {
		this.idcargoMinisterio = idcargoMinisterio;
	}

	public String getCargoMinDesc() {
		return this.cargoMinDesc;
	}

	public void setCargoMinDesc(String cargoMinDesc) {
		this.cargoMinDesc = cargoMinDesc;
	}

	public String getCargoMinNombre() {
		return this.cargoMinNombre;
	}

	public void setCargoMinNombre(String cargoMinNombre) {
		this.cargoMinNombre = cargoMinNombre;
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

	public Ministerio getMinisterio() {
		return this.ministerio;
	}

	public void setMinisterio(Ministerio ministerio) {
		this.ministerio = ministerio;
	}

	public List<CongreganteMinisterio> getCongreganteMinisterios() {
		return this.congreganteMinisterios;
	}

	public void setCongreganteMinisterios(List<CongreganteMinisterio> congreganteMinisterios) {
		this.congreganteMinisterios = congreganteMinisterios;
	}

	public CongreganteMinisterio addCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().add(congreganteMinisterio);
		congreganteMinisterio.setCargoMinisterio(this);

		return congreganteMinisterio;
	}

	public CongreganteMinisterio removeCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().remove(congreganteMinisterio);
		congreganteMinisterio.setCargoMinisterio(null);

		return congreganteMinisterio;
	}

}