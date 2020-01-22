package com.quest.demo.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "player")
public class Player {
    @Id
    private int Id;
    private String Name;
    private String cricketTeam;

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
