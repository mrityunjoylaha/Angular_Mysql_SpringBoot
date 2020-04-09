package com.lti.demo.player;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;
	
	
//	List<Player> list = new ArrayList<>();
//	public PlayerService() {
//		//System.out.println("Service layer is created");
//		list.add(new Player(1,"Vijay"));
//		list.add(new Player(2,"Virat"));
//		list.add(new Player(3,"Sachin"));
//		
//	}
	
	
	
	//View the list of the players
	public List<Player> getAllPlayers(){
		//System.out.println("Service layer is created");
		List<Player> playerList = new ArrayList<>();
		playerRepository.findAll().forEach(playerList::add);
		return playerList;
	
		
	}
	
	
	
//	//Find the player
//	public Player getPlayer(int id) {
//		for (Player player : list) {
//			if(player.getId() == id) {
//				return player;
//			}
//		}
//		return null;
//	}

	
	//Find the player
	public Player getPlayer(int id) {
		Optional<Player> optionalPlayer = playerRepository.findById(id);
			if(optionalPlayer.isPresent()) {
				return optionalPlayer.get();
			}
		
		return null;
	}
	
	
	//Save the player
	public void savePlayer(Player player) {
	playerRepository.save(player);
	}
	
//	//Update the player
//	public void updatePlayer(Player player) {
//		for (Player p : list) {
//			if(p.getId() == player.getId()) {
//				p.setPlayerName(player.getPlayerName());
//			}
//		}
//	}

//Update the player
	public void updatePlayer(Player player) {
		playerRepository.save(player);
	}
	
	
	//Remove the player
	public void deletePlyer(int id) {
		playerRepository.deleteById(id);
	}
}
