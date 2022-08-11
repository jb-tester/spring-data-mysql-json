package com.mytests.spring.data.mysqlJson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * *
 * <p>Created by irina on 06.05.2021.</p>
 * <p>Project: spring-data-mysql-json</p>
 * *
 */
@RestController
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/qa/{qa}")
    public String teams_by_qa(@PathVariable("qa") String qa) {
        List<TeamEntity> teams = teamRepository.findTeamWhereSpecificQaWorks(qa);
        String rez="";
        for (TeamEntity el : teams) {
            rez = rez +"\n"+ el.toString();
        }
        return "got " + rez;
    }

    @GetMapping("/developers")
    public String getAllDevelopers(){

        StringBuilder rez= new StringBuilder();
        for (TeamEntity teamEntity : teamRepository.findAll()) {
            rez.append("\n").append(teamEntity.getDevelopers());
        }
        return rez.toString();
    }

    @GetMapping("/test_formula_field")
    public String testFF(){
        StringBuilder rez = new StringBuilder();
        for (TeamEntity entity : teamRepository.findByDevelopersContains("sasha")) {
            rez.append("\n").append(entity.getTransformedName()).append(" developers: ").append(entity.getDevelopers());
        }
        return rez.toString();
    }
}
