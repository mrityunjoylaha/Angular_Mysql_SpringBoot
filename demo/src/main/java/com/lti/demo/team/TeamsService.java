package com.lti.demo.team;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.demo.player.Player;


@Service
public class TeamsService {

	@Autowired
	private TeamsRepository teamsRepository;
	
	
	//View the list of the teams
	public List<Teams> getAllTeams(){
		//System.out.println("Service layer is created");
		List<Teams> teamsList = new ArrayList<>();
	teamsRepository.findAll().forEach(teamsList::add);
		return teamsList;
	
		
	}
	
	
	//Find the player
	public Teams getTeam(int id) {
		Optional<Teams> optionalTeams = teamsRepository.findById(id);
			if(optionalTeams.isPresent()) {
				return optionalTeams.get();
			}
		
		return null;
	}
	
	
	//Save the player
	public void saveTeam(Teams teams) {
		teamsRepository.save(teams);
	}
	
	//Update the player
		public void updateTeam(Teams team) {
			teamsRepository.save(team);
		}
		
		
		//Remove the player
		public void deleteTeam(int id) {
			teamsRepository.deleteById(id);
		}
}
