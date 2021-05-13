package com.mytests.spring.data.mysqlJson;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 06.05.2021.</p>
 * <p>Project: spring-data-mysql-json</p>
 * *
 */
@Repository
public interface TeamRepository extends CrudRepository<TeamEntity,Integer> {


    @Query(nativeQuery = true, value = "select * from team where members->'$.qa' = JSON_ARRAY(:name)")
    List<TeamEntity> findTeamWhereSpecificQaWorks(@Param("name") String name);

    List<TeamEntity> findByDevelopersContains(String developers);
}
