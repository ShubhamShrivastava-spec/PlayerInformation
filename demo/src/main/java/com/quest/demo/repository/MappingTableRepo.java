package com.quest.demo.repository;

import com.quest.demo.dto.MappingTable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface MappingTableRepo extends CrudRepository<MappingTable, Integer> {

    @Query(value = "SELECT SUM(score) FROM MappingTable mt WHERE mt.playerId = ?1",
            nativeQuery = true)
    Integer getScore(Integer id);

    @Query(value = "SELECT matchId FROM MappingTable mt where mt.playerId =?1",
            nativeQuery = true)
    ArrayList<Integer> getMatchIds(Integer id);

    @Query(value = "SELECT score FROM MappingTable mt where mt.playerId =?1 AND mt.matchId= ?2",
            nativeQuery = true)
    Integer getScore(Integer pid, Integer mid);

}
