package com.quest.demo.repository;

import com.quest.demo.dto.Player;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface PlayerRepo extends CrudRepository<Player, Integer> {

   //Optional<Player> findById(Integer integer);
	
	
	@Query(value = "SELECT * FROM player p WHERE p.id = ?1",
            nativeQuery = true)
	Player getPlayerInfo(Integer id);

}
