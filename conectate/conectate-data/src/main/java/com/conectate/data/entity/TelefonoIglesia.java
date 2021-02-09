package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the telefono_iglesia database table.
 * 
 */
@Entity
@Table(name="telefono_iglesia")
@NamedQuery(name="TelefonoIglesia.findAll", query="SELECT t FROM TelefonoIglesia t")
public class TelefonoIglesia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idtel_iglesia", unique=true, nullable=false)
	private int idtelIglesia;

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

	//bi-directional many-to-one association to Iglesia
	@ManyToOne
	@JoinColumn(name="idiglesia", nullable=false)
	private Iglesia iglesia;

	public TelefonoIglesia() {
	}

	public int getIdtelIglesia() {
		return this.idtelIglesia;
	}

	public void setIdtelIglesia(int idtelIglesia) {
		this.idtelIglesia = idtelIglesia;
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

	public Iglesia getIglesia() {
		return this.iglesia;
	}

	public void setIglesia(Iglesia iglesia) {
		this.iglesia = iglesia;
	}

}