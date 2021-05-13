select members->>'$.developers[*].name' from team;

select team_name from team where members->'$.qa' = JSON_ARRAY('nastya');
select team_name from team where JSON_CONTAINS(members, '{}', '$.developers') ;

select team.team_name, subsystems->'$**.name' from team ;

select JSON_EXTRACT(members, '$.lead') from team;
select JSON_EXTRACT(members->'$.developers', '$**.name') from team;


select JSON_EXTRACT('{"firstname": "irina", "lastname": "petrovskaya"}', '$.firstname');