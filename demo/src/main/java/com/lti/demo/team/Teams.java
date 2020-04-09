package com.lti.demo.team;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.lti.demo.player.Player;



@Entity
@Table(name="team")
public class Teams {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	@Column(name ="team")
	private String team;
	
	@Column(name ="description")
	private String description;
	
	@Column(name ="owner")
	private String owner;
	
	@OneToMany(mappedBy = "team", cascade= CascadeType.MERGE , fetch= FetchType.LAZY)
	private List<Player> players = new ArrayList<>() ;
	
	
	
	public int getId() {
		return id;
	}
	
	public Teams() {
	
	}

	public Teams(int id, String team, String description, String owner, List<Player> players) {
		super();
		this.id = id;
		this.team = team;
		this.description = description;
		this.owner = owner;
		this.players = players;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}



}
