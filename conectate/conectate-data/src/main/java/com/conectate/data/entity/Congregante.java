package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the congregantes database table.
 * 
 */
@Entity
@Table(name="congregantes")
@NamedQuery(name="Congregante.findAll", query="SELECT c FROM Congregante c")
public class Congregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idcon;

	@Column(name="con_ap_mat", length=100)
	private String conApMat;

	@Column(name="con_ap_pat", nullable=false, length=100)
	private String conApPat;

	@Temporal(TemporalType.DATE)
	@Column(name="con_fecha_nac", nullable=false)
	private Date conFechaNac;

	@Column(name="con_matricula", nullable=false, length=10)
	private String conMatricula;

	@Column(name="con_nombre", nullable=false, length=100)
	private String conNombre;

	@Column(name="con_servidor", nullable=false)
	private byte conServidor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	//bi-directional many-to-one association to CongreganteIglesia
	@OneToMany(mappedBy="congregante")
	private List<CongreganteIglesia> congreganteIglesias;

	//bi-directional many-to-one association to CongreganteMinisterio
	@OneToMany(mappedBy="congregante")
	private List<CongreganteMinisterio> congreganteMinisterios;

	//bi-directional many-to-one association to CatEdoCivil
	@ManyToOne
	@JoinColumn(name="con_edo_civil", nullable=false)
	private CatEdoCivil catEdoCivil;

	//bi-directional many-to-one association to CatNacionalidad
	@ManyToOne
	@JoinColumn(name="con_nacionalidad", nullable=false)
	private CatNacionalidad catNacionalidad;

	//bi-directional many-to-one association to CatSexo
	@ManyToOne
	@JoinColumn(name="con_sexo", nullable=false)
	private CatSexo catSexo;

	//bi-directional many-to-one association to CatStatusCongregante
	@ManyToOne
	@JoinColumn(name="con_status_con", nullable=false)
	private CatStatusCongregante catStatusCongregante;

	//bi-directional many-to-one association to CorreosCongregante
	@OneToMany(mappedBy="congregante")
	private List<CorreosCongregante> correosCongregantes;

	//bi-directional many-to-one association to DireccionCongregante
	@OneToMany(mappedBy="congregante")
	private List<DireccionCongregante> direccionCongregantes;

	//bi-directional many-to-one association to FormacionCongregante
	@OneToMany(mappedBy="congregante")
	private List<FormacionCongregante> formacionCongregantes;

	//bi-directional many-to-one association to TelefonoCongregante
	@OneToMany(mappedBy="congregante")
	private List<TelefonoCongregante> telefonoCongregantes;

	public Congregante() {
	}

	public int getIdcon() {
		return this.idcon;
	}

	public void setIdcon(int idcon) {
		this.idcon = idcon;
	}

	public String getConApMat() {
		return this.conApMat;
	}

	public void setConApMat(String conApMat) {
		this.conApMat = conApMat;
	}

	public String getConApPat() {
		return this.conApPat;
	}

	public void setConApPat(String conApPat) {
		this.conApPat = conApPat;
	}

	public Date getConFechaNac() {
		return this.conFechaNac;
	}

	public void setConFechaNac(Date conFechaNac) {
		this.conFechaNac = conFechaNac;
	}

	public String getConMatricula() {
		return this.conMatricula;
	}

	public void setConMatricula(String conMatricula) {
		this.conMatricula = conMatricula;
	}

	public String getConNombre() {
		return this.conNombre;
	}

	public void setConNombre(String conNombre) {
		this.conNombre = conNombre;
	}

	public byte getConServidor() {
		return this.conServidor;
	}

	public void setConServidor(byte conServidor) {
		this.conServidor = conServidor;
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

	public List<CongreganteIglesia> getCongreganteIglesias() {
		return this.congreganteIglesias;
	}

	public void setCongreganteIglesias(List<CongreganteIglesia> congreganteIglesias) {
		this.congreganteIglesias = congreganteIglesias;
	}

	public CongreganteIglesia addCongreganteIglesia(CongreganteIglesia congreganteIglesia) {
		getCongreganteIglesias().add(congreganteIglesia);
		congreganteIglesia.setCongregante(this);

		return congreganteIglesia;
	}

	public CongreganteIglesia removeCongreganteIglesia(CongreganteIglesia congreganteIglesia) {
		getCongreganteIglesias().remove(congreganteIglesia);
		congreganteIglesia.setCongregante(null);

		return congreganteIglesia;
	}

	public List<CongreganteMinisterio> getCongreganteMinisterios() {
		return this.congreganteMinisterios;
	}

	public void setCongreganteMinisterios(List<CongreganteMinisterio> congreganteMinisterios) {
		this.congreganteMinisterios = congreganteMinisterios;
	}

	public CongreganteMinisterio addCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().add(congreganteMinisterio);
		congreganteMinisterio.setCongregante(this);

		return congreganteMinisterio;
	}

	public CongreganteMinisterio removeCongreganteMinisterio(CongreganteMinisterio congreganteMinisterio) {
		getCongreganteMinisterios().remove(congreganteMinisterio);
		congreganteMinisterio.setCongregante(null);

		return congreganteMinisterio;
	}

	public CatEdoCivil getCatEdoCivil() {
		return this.catEdoCivil;
	}

	public void setCatEdoCivil(CatEdoCivil catEdoCivil) {
		this.catEdoCivil = catEdoCivil;
	}

	public CatNacionalidad getCatNacionalidad() {
		return this.catNacionalidad;
	}

	public void setCatNacionalidad(CatNacionalidad catNacionalidad) {
		this.catNacionalidad = catNacionalidad;
	}

	public CatSexo getCatSexo() {
		return this.catSexo;
	}

	public void setCatSexo(CatSexo catSexo) {
		this.catSexo = catSexo;
	}

	public CatStatusCongregante getCatStatusCongregante() {
		return this.catStatusCongregante;
	}

	public void setCatStatusCongregante(CatStatusCongregante catStatusCongregante) {
		this.catStatusCongregante = catStatusCongregante;
	}

	public List<CorreosCongregante> getCorreosCongregantes() {
		return this.correosCongregantes;
	}

	public void setCorreosCongregantes(List<CorreosCongregante> correosCongregantes) {
		this.correosCongregantes = correosCongregantes;
	}

	public CorreosCongregante addCorreosCongregante(CorreosCongregante correosCongregante) {
		getCorreosCongregantes().add(correosCongregante);
		correosCongregante.setCongregante(this);

		return correosCongregante;
	}

	public CorreosCongregante removeCorreosCongregante(CorreosCongregante correosCongregante) {
		getCorreosCongregantes().remove(correosCongregante);
		correosCongregante.setCongregante(null);

		return correosCongregante;
	}

	public List<DireccionCongregante> getDireccionCongregantes() {
		return this.direccionCongregantes;
	}

	public void setDireccionCongregantes(List<DireccionCongregante> direccionCongregantes) {
		this.direccionCongregantes = direccionCongregantes;
	}

	public DireccionCongregante addDireccionCongregante(DireccionCongregante direccionCongregante) {
		getDireccionCongregantes().add(direccionCongregante);
		direccionCongregante.setCongregante(this);

		return direccionCongregante;
	}

	public DireccionCongregante removeDireccionCongregante(DireccionCongregante direccionCongregante) {
		getDireccionCongregantes().remove(direccionCongregante);
		direccionCongregante.setCongregante(null);

		return direccionCongregante;
	}

	public List<FormacionCongregante> getFormacionCongregantes() {
		return this.formacionCongregantes;
	}

	public void setFormacionCongregantes(List<FormacionCongregante> formacionCongregantes) {
		this.formacionCongregantes = formacionCongregantes;
	}

	public FormacionCongregante addFormacionCongregante(FormacionCongregante formacionCongregante) {
		getFormacionCongregantes().add(formacionCongregante);
		formacionCongregante.setCongregante(this);

		return formacionCongregante;
	}

	public FormacionCongregante removeFormacionCongregante(FormacionCongregante formacionCongregante) {
		getFormacionCongregantes().remove(formacionCongregante);
		formacionCongregante.setCongregante(null);

		return formacionCongregante;
	}

	public List<TelefonoCongregante> getTelefonoCongregantes() {
		return this.telefonoCongregantes;
	}

	public void setTelefonoCongregantes(List<TelefonoCongregante> telefonoCongregantes) {
		this.telefonoCongregantes = telefonoCongregantes;
	}

	public TelefonoCongregante addTelefonoCongregante(TelefonoCongregante telefonoCongregante) {
		getTelefonoCongregantes().add(telefonoCongregante);
		telefonoCongregante.setCongregante(this);

		return telefonoCongregante;
	}

	public TelefonoCongregante removeTelefonoCongregante(TelefonoCongregante telefonoCongregante) {
		getTelefonoCongregantes().remove(telefonoCongregante);
		telefonoCongregante.setCongregante(null);

		return telefonoCongregante;
	}

}