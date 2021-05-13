CREATE TABLE team(
                       id int auto_increment primary key,
                       team_name varchar(255),
                       size int,
                       subsystems json,
                       members json
);