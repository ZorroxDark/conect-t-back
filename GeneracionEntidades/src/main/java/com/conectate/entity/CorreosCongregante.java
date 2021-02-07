package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the correos_congregantes database table.
 * 
 */
@Entity
@Table(name="correos_congregantes")
@NamedQuery(name="CorreosCongregante.findAll", query="SELECT c FROM CorreosCongregante c")
public class CorreosCongregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idcorreo;

	@Column(nullable=false, length=300)
	private String correo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(nullable=false)
	private byte status;

	@Column(nullable=false, length=45)
	private String tipo;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	public CorreosCongregante() {
	}

	public int getIdcorreo() {
		return this.idcorreo;
	}

	public void setIdcorreo(int idcorreo) {
		this.idcorreo = idcorreo;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
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