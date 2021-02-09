package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_sexo database table.
 * 
 */
@Entity
@Table(name="cat_sexo")
@NamedQuery(name="CatSexo.findAll", query="SELECT c FROM CatSexo c")
public class CatSexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idsexo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(nullable=false, length=45)
	private String nombre;

	//bi-directional many-to-one association to Congregante
	@OneToMany(mappedBy="catSexo")
	private List<Congregante> congregantes;

	public CatSexo() {
	}

	public int getIdsexo() {
		return this.idsexo;
	}

	public void setIdsexo(int idsexo) {
		this.idsexo = idsexo;
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

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Congregante> getCongregantes() {
		return this.congregantes;
	}

	public void setCongregantes(List<Congregante> congregantes) {
		this.congregantes = congregantes;
	}

	public Congregante addCongregante(Congregante congregante) {
		getCongregantes().add(congregante);
		congregante.setCatSexo(this);

		return congregante;
	}

	public Congregante removeCongregante(Congregante congregante) {
		getCongregantes().remove(congregante);
		congregante.setCatSexo(null);

		return congregante;
	}

}