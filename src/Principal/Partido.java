package Principal;
// Generated 20-feb-2021 18:09:36 by Hibernate Tools 5.4.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Partido generated by hbm2java
 */
public class Partido implements java.io.Serializable {

	private Integer id;
	private Grupo grupo;
	private Date fechaHora;
	private Set sets = new HashSet(0);
	private Set equipos = new HashSet(0);

	public Partido() {
	}

	public Partido(Grupo grupo) {
		this.grupo = grupo;
	}

	public Partido(Grupo grupo, Date fechaHora, Set sets, Set equipos) {
		this.grupo = grupo;
		this.fechaHora = fechaHora;
		this.sets = sets;
		this.equipos = equipos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public Date getFechaHora() {
		return this.fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Set getSets() {
		return this.sets;
	}

	public void setSets(Set sets) {
		this.sets = sets;
	}

	public Set getEquipos() {
		return this.equipos;
	}

	public void setEquipos(Set equipos) {
		this.equipos = equipos;
	}

}