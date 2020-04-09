package com.lti.demo.player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class PlayerController {

	@Autowired //how spring will know that it is a dependency
	private PlayerService playerService;
	
//	//GET
//	@RequestMapping(value ="/message")	//localhost:8081/message
//	//@ResponseBody
//	public String getMessage() {
//		return "Welcome!!!";
//	}
	
	
	@RequestMapping(value ="/players", method = RequestMethod.GET)
	public List<Player> getPlayers(){
		return playerService.getAllPlayers();
	}
	
	@RequestMapping(value ="/players/{id}")
	public Player getPlayerById(@PathVariable int id) {
		return playerService.getPlayer(id);
	}
	
	//POST --> save the data
	@RequestMapping(value ="/players/save", method = RequestMethod.POST)
	public void savePlayer(@RequestBody Player player) {
		playerService.savePlayer(player);
	}
	
	//PUT
	@RequestMapping(value ="/players/update", method = RequestMethod.PUT)
	public void updatePlayer( @RequestBody Player player) {
		playerService.updatePlayer(player);
	}
	
	//DELETE
	@RequestMapping(value ="/players/delete", method = RequestMethod.DELETE)
	public void deletePlayer(int id) {
		playerService.deletePlyer(id);
	}
	
}
