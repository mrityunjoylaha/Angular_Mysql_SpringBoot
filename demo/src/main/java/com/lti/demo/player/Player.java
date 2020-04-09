package com.lti.demo.player;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lti.demo.team.Teams;

@Entity
@Table(name="PLAYER")
public class Player 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="PLAYER_ID")
	private int id; 
	
	@Column(name ="Player_Name")
	private String playerName;

	
	@ManyToOne
	@JoinColumn(name ="team_id")
	private Teams team;
	
	public Player() {
	
	}
	
	public Player(int id, String playerName) {
		super();
		this.id = id;
		this.playerName = playerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
}
