package com.quest.demo.service;

import com.quest.demo.dto.Player;
import com.quest.demo.repository.MappingTableRepo;
import com.quest.demo.repository.MatchRepo;
import com.quest.demo.repository.PlayerRepo;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PlayerInfoService {

    @Autowired
    private MatchRepo matchRepo;

    @Autowired
    private PlayerRepo playerRepo;

    @Autowired
    private MappingTableRepo mappingTableRepo;

    public String getInfoService(int id) {
        //check for id presency
        Player playerObj = playerRepo.getPlayerInfo(id);

        if (!playerObj.equals(null)) {
           
        	JSONObject jsonObject1 = new JSONObject();
            jsonObject1.put("id", playerObj.getId());
            jsonObject1.put("name", playerObj.getName());
            jsonObject1.put("cricketTeam", playerObj.getCricketTeam());
            jsonObject1.put("total", mappingTableRepo.getScore(id));
            ArrayList<Integer> integers = mappingTableRepo.getMatchIds(id);
            JSONArray jsonArray = new JSONArray();
            for (Integer i : integers) {
                JSONObject obj = new JSONObject();
                obj.put("id", i);
                obj.put("score", mappingTableRepo.getScore(id, i));
                obj.put("series name", matchRepo.getSeriesName(i));
                obj.put("location", matchRepo.getLocation(i));
                jsonArray.put(obj);
            }
            jsonObject1.put("Matches", jsonArray);
            return jsonObject1.toString();
        }
        
        	 
     else
     {
    	 System.out.println("not present");
    	return new JSONObject().put("message", "Id is not present").toString();
     }
    }

}
