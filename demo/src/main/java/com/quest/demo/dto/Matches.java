package com.quest.demo.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Component
@Entity
@Table(name = "matches")
public class Matches {
    @Id
    private int Id;
    private String SeriesName;
    private String Location;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getSeriesName() {
        return SeriesName;
    }

    public void setSeriesName(String seriesName) {
        this.SeriesName = seriesName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    @Override
    public String toString() {
        return "matchInfo{" +
                "id=" + Id +
                ", seriesName='" + SeriesName + '\'' +
                ", location='" + Location + '\'' +
                '}';
    }
}
