package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_direccion database table.
 * 
 */
@Entity
@Table(name="cat_direccion")
@NamedQuery(name="CatDireccion.findAll", query="SELECT c FROM CatDireccion c")
public class CatDireccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_direccion", unique=true, nullable=false)
	private int idDireccion;

	@Column(length=10)
	private String c_CP;

	@Column(name="c_cve_ciudad", length=10)
	private String cCveCiudad;

	@Column(name="c_estado", length=10)
	private String cEstado;

	@Column(name="c_mnpio", length=10)
	private String cMnpio;

	@Column(name="c_oficina", length=10)
	private String cOficina;

	@Column(name="c_tipo_asenta", length=10)
	private String cTipoAsenta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="d_asenta", length=150)
	private String dAsenta;

	@Column(name="d_ciudad", length=150)
	private String dCiudad;

	@Column(name="d_codigo", nullable=false, length=10)
	private String dCodigo;

	@Column(length=10)
	private String d_CP;

	@Column(name="d_estado", length=150)
	private String dEstado;

	@Column(name="d_mnpio", length=150)
	private String dMnpio;

	@Column(name="d_tipo_asenta", length=150)
	private String dTipoAsenta;

	@Column(name="d_zona", length=10)
	private String dZona;

	@Column(name="id_asenta_cpcons", length=10)
	private String idAsentaCpcons;

	//bi-directional many-to-one association to DireccionCongregante
	@OneToMany(mappedBy="catDireccion")
	private List<DireccionCongregante> direccionCongregantes;

	//bi-directional many-to-one association to DireccionIglesia
	@OneToMany(mappedBy="catDireccion")
	private List<DireccionIglesia> direccionIglesias;

	public CatDireccion() {
	}

	public int getIdDireccion() {
		return this.idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getC_CP() {
		return this.c_CP;
	}

	public void setC_CP(String c_CP) {
		this.c_CP = c_CP;
	}

	public String getCCveCiudad() {
		return this.cCveCiudad;
	}

	public void setCCveCiudad(String cCveCiudad) {
		this.cCveCiudad = cCveCiudad;
	}

	public String getCEstado() {
		return this.cEstado;
	}

	public void setCEstado(String cEstado) {
		this.cEstado = cEstado;
	}

	public String getCMnpio() {
		return this.cMnpio;
	}

	public void setCMnpio(String cMnpio) {
		this.cMnpio = cMnpio;
	}

	public String getCOficina() {
		return this.cOficina;
	}

	public void setCOficina(String cOficina) {
		this.cOficina = cOficina;
	}

	public String getCTipoAsenta() {
		return this.cTipoAsenta;
	}

	public void setCTipoAsenta(String cTipoAsenta) {
		this.cTipoAsenta = cTipoAsenta;
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

	public String getDAsenta() {
		return this.dAsenta;
	}

	public void setDAsenta(String dAsenta) {
		this.dAsenta = dAsenta;
	}

	public String getDCiudad() {
		return this.dCiudad;
	}

	public void setDCiudad(String dCiudad) {
		this.dCiudad = dCiudad;
	}

	public String getDCodigo() {
		return this.dCodigo;
	}

	public void setDCodigo(String dCodigo) {
		this.dCodigo = dCodigo;
	}

	public String getD_CP() {
		return this.d_CP;
	}

	public void setD_CP(String d_CP) {
		this.d_CP = d_CP;
	}

	public String getDEstado() {
		return this.dEstado;
	}

	public void setDEstado(String dEstado) {
		this.dEstado = dEstado;
	}

	public String getDMnpio() {
		return this.dMnpio;
	}

	public void setDMnpio(String dMnpio) {
		this.dMnpio = dMnpio;
	}

	public String getDTipoAsenta() {
		return this.dTipoAsenta;
	}

	public void setDTipoAsenta(String dTipoAsenta) {
		this.dTipoAsenta = dTipoAsenta;
	}

	public String getDZona() {
		return this.dZona;
	}

	public void setDZona(String dZona) {
		this.dZona = dZona;
	}

	public String getIdAsentaCpcons() {
		return this.idAsentaCpcons;
	}

	public void setIdAsentaCpcons(String idAsentaCpcons) {
		this.idAsentaCpcons = idAsentaCpcons;
	}

	public List<DireccionCongregante> getDireccionCongregantes() {
		return this.direccionCongregantes;
	}

	public void setDireccionCongregantes(List<DireccionCongregante> direccionCongregantes) {
		this.direccionCongregantes = direccionCongregantes;
	}

	public DireccionCongregante addDireccionCongregante(DireccionCongregante direccionCongregante) {
		getDireccionCongregantes().add(direccionCongregante);
		direccionCongregante.setCatDireccion(this);

		return direccionCongregante;
	}

	public DireccionCongregante removeDireccionCongregante(DireccionCongregante direccionCongregante) {
		getDireccionCongregantes().remove(direccionCongregante);
		direccionCongregante.setCatDireccion(null);

		return direccionCongregante;
	}

	public List<DireccionIglesia> getDireccionIglesias() {
		return this.direccionIglesias;
	}

	public void setDireccionIglesias(List<DireccionIglesia> direccionIglesias) {
		this.direccionIglesias = direccionIglesias;
	}

	public DireccionIglesia addDireccionIglesia(DireccionIglesia direccionIglesia) {
		getDireccionIglesias().add(direccionIglesia);
		direccionIglesia.setCatDireccion(this);

		return direccionIglesia;
	}

	public DireccionIglesia removeDireccionIglesia(DireccionIglesia direccionIglesia) {
		getDireccionIglesias().remove(direccionIglesia);
		direccionIglesia.setCatDireccion(null);

		return direccionIglesia;
	}

}