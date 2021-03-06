package Principal;
// Generated 20-feb-2021 18:09:36 by Hibernate Tools 5.4.3.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Equipo generated by hbm2java
 */
public class Equipo implements java.io.Serializable {

	private Integer id;
	private Set competicions = new HashSet(0);
	private Set jugadors = new HashSet(0);
	private Set sets = new HashSet(0);
	private Set grupos = new HashSet(0);
	private Set partidos = new HashSet(0);

	public Equipo() {
	}

	public Equipo(Set competicions, Set jugadors, Set sets, Set grupos, Set partidos) {
		this.competicions = competicions;
		this.jugadors = jugadors;
		this.sets = sets;
		this.grupos = grupos;
		this.partidos = partidos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set getCompeticions() {
		return this.competicions;
	}

	public void setCompeticions(Set competicions) {
		this.competicions = competicions;
	}

	public Set getJugadors() {
		return this.jugadors;
	}

	public void setJugadors(Set jugadors) {
		this.jugadors = jugadors;
	}

	public Set getSets() {
		return this.sets;
	}

	public void setSets(Set sets) {
		this.sets = sets;
	}

	public Set getGrupos() {
		return this.grupos;
	}

	public void setGrupos(Set grupos) {
		this.grupos = grupos;
	}

	public Set getPartidos() {
		return this.partidos;
	}

	public void setPartidos(Set partidos) {
		this.partidos = partidos;
	}

}
