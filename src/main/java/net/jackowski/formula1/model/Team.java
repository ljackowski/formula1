package net.jackowski.formula1.model;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "team_id")
    private int teamId;

    @Column(name = "season")
    private int season;

    @Column(name = "driver")
    private String driver;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "place")
    private int place;

    public Team() {
    }

    public Team(int season, String driver, String teamName, int place) {
        this.season = season;
        this.driver = driver;
        this.teamName = teamName;
        this.place = place;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }
}
