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

        String rez="";
        for (TeamEntity teamEntity : teamRepository.findAll()) {
            rez = rez +"\n"+ teamEntity.getDevelopers();
        }
        return rez;
    }

    @GetMapping("/test_formula_field")
    public String testFF(){
        String rez = "";
        for (TeamEntity entity : teamRepository.findByDevelopersContains("sasha")) {
            rez = rez+"\n"+entity.getTransformedName()+" developers: "+entity.getDevelopers();
        }
        return rez;
    }
}
