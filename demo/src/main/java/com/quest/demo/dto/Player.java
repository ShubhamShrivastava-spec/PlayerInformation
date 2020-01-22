package com.quest.demo.dto;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "player")
public class Player {
    
	@Id
	private int Id;
    private String Name;
    private String cricketTeam;
    
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<MappingTable> lst;
    
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getCricketTeam() {
        return cricketTeam;
    }

    public void setCricketTeam(String cricketTeam) {
        this.cricketTeam = cricketTeam;
    }

    @Override
    public String toString() {
        return "playerInfo{" +
                "id=" + Id +
                ", name='" + Name + '\'' +
                ", cricketTeam='" + cricketTeam + '\'' +
                '}';
    }
}
