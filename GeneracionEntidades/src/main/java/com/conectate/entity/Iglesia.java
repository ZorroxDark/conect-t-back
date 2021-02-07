package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the iglesia database table.
 * 
 */
@Entity
@Table(name="iglesia")
@NamedQuery(name="Iglesia.findAll", query="SELECT i FROM Iglesia i")
public class Iglesia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idiglesia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="iglesia_alias", nullable=false, length=300)
	private String iglesiaAlias;

	@Column(name="iglesia_desc", length=500)
	private String iglesiaDesc;

	@Column(name="iglesia_nom_corto", length=100)
	private String iglesiaNomCorto;

	@Column(name="iglesia_nom_largo", length=300)
	private String iglesiaNomLargo;

	@Column(name="iglesia_nombre", nullable=false, length=500)
	private String iglesiaNombre;

	//bi-directional many-to-one association to CongreganteIglesia
	@OneToMany(mappedBy="iglesia")
	private List<CongreganteIglesia> congreganteIglesias;

	//bi-directional many-to-one association to CorreosIglesia
	@OneToMany(mappedBy="iglesia")
	private List<CorreosIglesia> correosIglesias;

	//bi-directional many-to-one association to DireccionIglesia
	@OneToMany(mappedBy="iglesia")
	private List<DireccionIglesia> direccionIglesias;

	//bi-directional many-to-one association to Ministerio
	@OneToMany(mappedBy="iglesia")
	private List<Ministerio> ministerios;

	//bi-directional many-to-one association to TelefonoIglesia
	@OneToMany(mappedBy="iglesia")
	private List<TelefonoIglesia> telefonoIglesias;

	public Iglesia() {
	}

	public int getIdiglesia() {
		return this.idiglesia;
	}

	public void setIdiglesia(int idiglesia) {
		this.idiglesia = idiglesia;
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

	public String getIglesiaAlias() {
		return this.iglesiaAlias;
	}

	public void setIglesiaAlias(String iglesiaAlias) {
		this.iglesiaAlias = iglesiaAlias;
	}

	public String getIglesiaDesc() {
		return this.iglesiaDesc;
	}

	public void setIglesiaDesc(String iglesiaDesc) {
		this.iglesiaDesc = iglesiaDesc;
	}

	public String getIglesiaNomCorto() {
		return this.iglesiaNomCorto;
	}

	public void setIglesiaNomCorto(String iglesiaNomCorto) {
		this.iglesiaNomCorto = iglesiaNomCorto;
	}

	public String getIglesiaNomLargo() {
		return this.iglesiaNomLargo;
	}

	public void setIglesiaNomLargo(String iglesiaNomLargo) {
		this.iglesiaNomLargo = iglesiaNomLargo;
	}

	public String getIglesiaNombre() {
		return this.iglesiaNombre;
	}

	public void setIglesiaNombre(String iglesiaNombre) {
		this.iglesiaNombre = iglesiaNombre;
	}

	public List<CongreganteIglesia> getCongreganteIglesias() {
		return this.congreganteIglesias;
	}

	public void setCongreganteIglesias(List<CongreganteIglesia> congreganteIglesias) {
		this.congreganteIglesias = congreganteIglesias;
	}

	public CongreganteIglesia addCongreganteIglesia(CongreganteIglesia congreganteIglesia) {
		getCongreganteIglesias().add(congreganteIglesia);
		congreganteIglesia.setIglesia(this);

		return congreganteIglesia;
	}

	public CongreganteIglesia removeCongreganteIglesia(CongreganteIglesia congreganteIglesia) {
		getCongreganteIglesias().remove(congreganteIglesia);
		congreganteIglesia.setIglesia(null);

		return congreganteIglesia;
	}

	public List<CorreosIglesia> getCorreosIglesias() {
		return this.correosIglesias;
	}

	public void setCorreosIglesias(List<CorreosIglesia> correosIglesias) {
		this.correosIglesias = correosIglesias;
	}

	public CorreosIglesia addCorreosIglesia(CorreosIglesia correosIglesia) {
		getCorreosIglesias().add(correosIglesia);
		correosIglesia.setIglesia(this);

		return correosIglesia;
	}

	public CorreosIglesia removeCorreosIglesia(CorreosIglesia correosIglesia) {
		getCorreosIglesias().remove(correosIglesia);
		correosIglesia.setIglesia(null);

		return correosIglesia;
	}

	public List<DireccionIglesia> getDireccionIglesias() {
		return this.direccionIglesias;
	}

	public void setDireccionIglesias(List<DireccionIglesia> direccionIglesias) {
		this.direccionIglesias = direccionIglesias;
	}

	public DireccionIglesia addDireccionIglesia(DireccionIglesia direccionIglesia) {
		getDireccionIglesias().add(direccionIglesia);
		direccionIglesia.setIglesia(this);

		return direccionIglesia;
	}

	public DireccionIglesia removeDireccionIglesia(DireccionIglesia direccionIglesia) {
		getDireccionIglesias().remove(direccionIglesia);
		direccionIglesia.setIglesia(null);

		return direccionIglesia;
	}

	public List<Ministerio> getMinisterios() {
		return this.ministerios;
	}

	public void setMinisterios(List<Ministerio> ministerios) {
		this.ministerios = ministerios;
	}

	public Ministerio addMinisterio(Ministerio ministerio) {
		getMinisterios().add(ministerio);
		ministerio.setIglesia(this);

		return ministerio;
	}

	public Ministerio removeMinisterio(Ministerio ministerio) {
		getMinisterios().remove(ministerio);
		ministerio.setIglesia(null);

		return ministerio;
	}

	public List<TelefonoIglesia> getTelefonoIglesias() {
		return this.telefonoIglesias;
	}

	public void setTelefonoIglesias(List<TelefonoIglesia> telefonoIglesias) {
		this.telefonoIglesias = telefonoIglesias;
	}

	public TelefonoIglesia addTelefonoIglesia(TelefonoIglesia telefonoIglesia) {
		getTelefonoIglesias().add(telefonoIglesia);
		telefonoIglesia.setIglesia(this);

		return telefonoIglesia;
	}

	public TelefonoIglesia removeTelefonoIglesia(TelefonoIglesia telefonoIglesia) {
		getTelefonoIglesias().remove(telefonoIglesia);
		telefonoIglesia.setIglesia(null);

		return telefonoIglesia;
	}

}