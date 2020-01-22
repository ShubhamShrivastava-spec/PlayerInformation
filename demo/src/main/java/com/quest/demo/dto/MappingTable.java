package com.quest.demo.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Component
@Entity
@Table(name = "mappingTable")
public class MappingTable implements Serializable {

    @Id
    private int Id;
    private int PlayerId;
    private int MatchId;
    private int Score;
    
    @ManyToOne
    @JoinColumn(name = "PlayerId",referencedColumnName="Id", insertable=false, updatable=false)
    private Player player;
    
    @ManyToOne
    @JoinColumn(name = "MatchId",referencedColumnName="Id", insertable=false, updatable=false)
    private Matches matches;
    
    public int getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(int playerId) {
        this.PlayerId = playerId;
    }

    public int getMatchId() {
        return MatchId;
    }

    public void setMatchId(int matchId) {
        this.MatchId = matchId;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        this.Score = score;
    }

    @Override
    public String toString() {
        return "MappingTable{" +
                "playerId=" + PlayerId +
                ", matchId=" + MatchId +
                ", score=" + Score +
                '}';
    }
}
