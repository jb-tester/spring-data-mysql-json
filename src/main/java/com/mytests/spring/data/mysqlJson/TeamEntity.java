package com.mytests.spring.data.mysqlJson;

import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.util.Map;
import java.util.Objects;

/**
 * *
 * <p>Created by irina on 06.05.2021.</p>
 * <p>Project: spring-data-mysql-json</p>
 * *
 */
@Entity
@Table(name = "team", schema = "jbtests")
public class TeamEntity {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "team_name")
    private String teamName;
    @Column(name = "size")
    private Integer size;
    @Column(name = "subsystems")
    private String subsystems;
    @Column(name = "members")
    private String members;
    @Formula("members->>'$.developers[*].name'")
    private String developers;
    @Formula("upper(team_name)")
    private String transformedName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getSubsystems() {
        return subsystems;
    }

    public void setSubsystems(String subsystems) {
        this.subsystems = subsystems;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }


    public String getDevelopers() {
        return developers;
    }

    public void setDevelopers(String developers) {
        this.developers = developers;
    }

    public String getTransformedName() {
        return transformedName;
    }

    public void setTransformedName(String transformedName) {
        this.transformedName = transformedName;
    }

    @Override
    public String toString() {
        return
                "teamName='" + teamName + '\'' +
                ", size=" + size +
                ", subsystems='" + subsystems + '\'' +
                ", members='" + members + '\'' +
                '}';
    }
}
