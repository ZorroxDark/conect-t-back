package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the telefono_congregantes database table.
 * 
 */
@Entity
@Table(name="telefono_congregantes")
@NamedQuery(name="TelefonoCongregante.findAll", query="SELECT t FROM TelefonoCongregante t")
public class TelefonoCongregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idtel_congregante", unique=true, nullable=false)
	private int idtelCongregante;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(nullable=false, length=100)
	private String telefono;

	@Column(nullable=false, length=45)
	private String tipo;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	public TelefonoCongregante() {
	}

	public int getIdtelCongregante() {
		return this.idtelCongregante;
	}

	public void setIdtelCongregante(int idtelCongregante) {
		this.idtelCongregante = idtelCongregante;
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

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Congregante getCongregante() {
		return this.congregante;
	}

	public void setCongregante(Congregante congregante) {
		this.congregante = congregante;
	}

}