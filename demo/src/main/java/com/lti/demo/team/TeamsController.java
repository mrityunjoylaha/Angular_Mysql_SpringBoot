package com.lti.demo.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class TeamsController {
	
	@Autowired //how spring will know that it is a dependency
	private TeamsService teamsService;
	
//	//GET
//	@RequestMapping(value ="/message")	//localhost:8081/message
//	//@ResponseBody
//	public String getMessage() {
//		return "Welcome!!!";
//	}
	
	
	@RequestMapping(value ="/teams", method = RequestMethod.GET)
	public List<Teams> getTeams(){
		return teamsService.getAllTeams();
	}
	
	@RequestMapping(value ="/teams/{id}")
	public Teams getTeamById(@PathVariable int id) {
		return teamsService.getTeam(id);
	}
	
	//POST --> save the data
	@RequestMapping(value ="/teams/save", method = RequestMethod.POST)
	public void saveTeam(@RequestBody Teams team) {
		teamsService.saveTeam(team);
	}
	
	//PUT
	@RequestMapping(value ="/teams/update", method = RequestMethod.PUT)
	public void updateTeam( @RequestBody Teams team) {
		teamsService.updateTeam(team);
	}
	
	//DELETE
	@RequestMapping(value ="/teams/delete", method = RequestMethod.DELETE)
	public void deleteTeam(int id) {
		teamsService.deleteTeam(id);
	}
	

}
