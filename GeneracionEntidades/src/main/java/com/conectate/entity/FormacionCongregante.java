package com.conectate.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the formacion_congregantes database table.
 * 
 */
@Entity
@Table(name="formacion_congregantes")
@NamedQuery(name="FormacionCongregante.findAll", query="SELECT f FROM FormacionCongregante f")
public class FormacionCongregante implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idfor_congre", unique=true, nullable=false)
	private int idforCongre;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	@Column(name="for_con_estudiante", nullable=false)
	private byte forConEstudiante;

	@Column(name="for_con_trabajador", nullable=false)
	private byte forConTrabajador;

	//bi-directional many-to-one association to Congregante
	@ManyToOne
	@JoinColumn(name="idcon", nullable=false)
	private Congregante congregante;

	public FormacionCongregante() {
	}

	public int getIdforCongre() {
		return this.idforCongre;
	}

	public void setIdforCongre(int idforCongre) {
		this.idforCongre = idforCongre;
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

	public byte getForConEstudiante() {
		return this.forConEstudiante;
	}

	public void setForConEstudiante(byte forConEstudiante) {
		this.forConEstudiante = forConEstudiante;
	}

	public byte getForConTrabajador() {
		return this.forConTrabajador;
	}

	public void setForConTrabajador(byte forConTrabajador) {
		this.forConTrabajador = forConTrabajador;
	}

	public Congregante getCongregante() {
		return this.congregante;
	}

	public void setCongregante(Congregante congregante) {
		this.congregante = congregante;
	}

}