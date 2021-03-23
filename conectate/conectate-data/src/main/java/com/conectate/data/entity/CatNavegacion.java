package com.conectate.data.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cat_navegacion database table.
 * 
 */
@Entity
@Table(name="cat_navegacion")
@NamedQuery(name="CatNavegacion.findAll", query="SELECT c FROM CatNavegacion c")
public class CatNavegacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_cat_navegacion", unique=true, nullable=false)
	private int idCatNavegacion;

	private Integer active;

	@Column(name="badge_background", length=150)
	private String badgeBackground;

	@Column(name="badge_color", length=150)
	private String badgeColor;

	@Column(name="badge_style", length=150)
	private String badgeStyle;

	@Column(name="badge_title", length=150)
	private String badgeTitle;

	@Column(length=150)
	private String classes;

	private Integer disabled;

	@Column(name="exact_match")
	private Integer exactMatch;

	@Column(name="external_link")
	private Integer externalLink;

	@Column(nullable=false)
	private int grupo;

	@Column(length=150)
	private String hijo;

	@Column(length=150)
	private String icon;

	@Column(name="icon_classes", length=150)
	private String iconClasses;

	@Column(length=150)
	private String id;

	@Column(length=150)
	private String link;

	@Column(length=150)
	private String meta;

	@Column(nullable=false)
	private int nivel;

	@Column(length=150)
	private String subtitle;

	@Column(length=150)
	private String title;

	@Column(length=150)
	private String type;

	//bi-directional many-to-one association to NavegacionRole
	@OneToMany(mappedBy="catNavegacion")
	private List<NavegacionRole> navegacionRoles;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_create")
	private Date ctrlFechaCreate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ctrl_fecha_update", nullable=false)
	private Date ctrlFechaUpdate;

	@Column(name="ctrl_user_mod", nullable=false)
	private int ctrlUserMod;

	public CatNavegacion() {
	}

	public int getIdCatNavegacion() {
		return this.idCatNavegacion;
	}

	public void setIdCatNavegacion(int idCatNavegacion) {
		this.idCatNavegacion = idCatNavegacion;
	}

	
	public String getBadgeBackground() {
		return this.badgeBackground;
	}

	public void setBadgeBackground(String badgeBackground) {
		this.badgeBackground = badgeBackground;
	}

	public String getBadgeColor() {
		return this.badgeColor;
	}

	public void setBadgeColor(String badgeColor) {
		this.badgeColor = badgeColor;
	}

	public String getBadgeStyle() {
		return this.badgeStyle;
	}

	public void setBadgeStyle(String badgeStyle) {
		this.badgeStyle = badgeStyle;
	}

	public String getBadgeTitle() {
		return this.badgeTitle;
	}

	public void setBadgeTitle(String badgeTitle) {
		this.badgeTitle = badgeTitle;
	}

	public String getClasses() {
		return this.classes;
	}

	public void setClasses(String classes) {
		this.classes = classes;
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

	

	public int getGrupo() {
		return this.grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

	public String getHijo() {
		return this.hijo;
	}

	public void setHijo(String hijo) {
		this.hijo = hijo;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIconClasses() {
		return this.iconClasses;
	}

	public void setIconClasses(String iconClasses) {
		this.iconClasses = iconClasses;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getMeta() {
		return this.meta;
	}

	public void setMeta(String meta) {
		this.meta = meta;
	}

	public int getNivel() {
		return this.nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getSubtitle() {
		return this.subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<NavegacionRole> getNavegacionRoles() {
		return this.navegacionRoles;
	}

	public void setNavegacionRoles(List<NavegacionRole> navegacionRoles) {
		this.navegacionRoles = navegacionRoles;
	}

	public NavegacionRole addNavegacionRole(NavegacionRole navegacionRole) {
		getNavegacionRoles().add(navegacionRole);
		navegacionRole.setCatNavegacion(this);

		return navegacionRole;
	}

	public NavegacionRole removeNavegacionRole(NavegacionRole navegacionRole) {
		getNavegacionRoles().remove(navegacionRole);
		navegacionRole.setCatNavegacion(null);

		return navegacionRole;
	}

	public Integer getActive() {
		return active;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	public Integer getDisabled() {
		return disabled;
	}

	public void setDisabled(Integer disabled) {
		this.disabled = disabled;
	}

	public Integer getExactMatch() {
		return exactMatch;
	}

	public void setExactMatch(Integer exactMatch) {
		this.exactMatch = exactMatch;
	}

	public Integer getExternalLink() {
		return externalLink;
	}

	public void setExternalLink(Integer externalLink) {
		this.externalLink = externalLink;
	}
	
	

}