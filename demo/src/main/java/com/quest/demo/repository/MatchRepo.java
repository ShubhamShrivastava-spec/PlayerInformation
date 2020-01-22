package com.quest.demo.repository;

import com.quest.demo.dto.Matches;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface MatchRepo extends CrudRepository<Matches, Integer> {

    @Query(value = "SELECT seriesName FROM matches m WHERE m.id = ?1",
            nativeQuery = true)
    String getSeriesName(Integer id);

    @Query(value = "SELECT location FROM matches m WHERE m.id = ?1",
            nativeQuery = true)
    String getLocation(Integer id);

}
