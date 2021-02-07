package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ministerios database table.
 * 
 */
@Entity
@Table(name="ministerios")
@NamedQuery(name="Ministerio.findAll", query="SELECT m FROM Ministerio m")
public class Ministerio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idministerio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="ministerio_act", nullable=false)
	private byte ministerioAct;

	@Column(name="ministerio_desc", nullable=false, length=250)
	private String ministerioDesc;

	@Column(name="ministerio_desc_corta", nullable=false, length=45)
	private String ministerioDescCorta;

	@Column(name="ministerio_nombre", nullable=false, length=100)
	private String ministerioNombre;

	//bi-directional many-to-one association to CargoMinisterio
	@OneToMany(mappedBy="ministerio")
	private List<CargoMinisterio> cargoMinisterios;

	//bi-directional many-to-one association to CongreganteMinisterio
	@OneToMany(mappedBy="ministerio")
	private List<CongreganteMinisterio> congreganteMinisterios;

	//bi-directional many-to-one association to Iglesia
	@ManyToOne
	@JoinColumn(name="idiglesia", nullable=false)
	private Iglesia iglesia;

	public Ministerio() {
	}

	public int getIdministerio() {
		return this.idministerio;
	}

	public void setIdministerio(int idministerio) {
		this.idministerio = idministerio;
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

	public byte getMinisterioAct() {
		return this.ministerioAct;
	}

	public void setMinisterioAct(byte ministerioAct) {
		this.ministerioAct = ministerioAct;
	}

	public String getMinisterioDesc() {
		return this.ministerioDesc;
	}

	public void setMinisterioDesc(String ministerioDesc) {
		this.ministerioDesc = ministerioDesc;
	}

	public String getMinisterioDescCorta() {
		return this.ministerioDescCorta;
	}

	public void setMinisterioDescCorta(String ministerioDescCorta) {
		this.ministerioDescCorta = ministerioDescCorta;
	}

	public String getMinisterioNombre() {
		return this.ministerioNombre;
	}

	public void setMinisterioNombre(String ministerioNombre) {
		this.ministerioNombre = ministerioNombre;
	}

	public List<CargoMinisterio> getCargoMinisterios() {
		return this.cargoMinisterios;
	}

	public void setCargoMinisterios(List<CargoMinisterio> cargoMinisterios) {
		this.cargoMinisterios = cargoMinisterios;
	}

	public CargoMinisterio addCargoMinisterio(CargoMinisterio cargoMinisterio) {
		getCargoMinisterios().add(cargoMinisterio);
		cargoMinisterio.setMinisterio(this);

		return cargoMinisterio;
	}

	public CargoMinisterio removeCargoMinisterio(CargoMinisterio cargoMinisterio) {
		getCargoMinisterios().remove(cargoMinisterio);
		cargoMinisterio.setMinisterio(null);

		return cargoMinisterio;
	}

	public List<CongreganteMinisterio> getCongreganteMinisterios() {
		return this.congreganteMinisterios;
	}

	public void setCongreganteMinisterios(List<CongreganteMinisterio> congreganteMinisterios) {
		this.congreganteMinisterios = congreganteMinisterios;
	}

	public CongreganteMinisterio addCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().add(congreganteMinisterio);
		congreganteMinisterio.setMinisterio(this);

		return congreganteMinisterio;
	}

	public CongreganteMinisterio removeCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().remove(congreganteMinisterio);
		congreganteMinisterio.setMinisterio(null);

		return congreganteMinisterio;
	}

	public Iglesia getIglesia() {
		return this.iglesia;
	}

	public void setIglesia(Iglesia iglesia) {
		this.iglesia = iglesia;
	}

}