

INSERT INTO team(team_name, size, subsystems, members)
VALUES (
           'vcs',
           8,
           '[ {"name": "git", "state": "development"},{"name": "svn", "state": "support"},{"name": "hg", "state": "support"},{"name": "perforce", "state": "support"},{"name": "cvs", "state": "unbundled"},{"name": "tfs", "state": "unbundled"},{"name": "clearcase", "state": "unbundled"} ]',
           '{ "developers": [{"name": "vanya", "responsible_for": ["github","git authentication"]}, {"name": "julia", "responsible_for": ["git/hg log","history","stash"]},{"name": "lesha", "responsible_for": ["diff","vcs general"]},{"name": "kostya", "responsible_for": ["commit","svn"]},{"name": "nadya", "responsible_for": ["hg","patches"]},{"name": "dima", "responsible_for": ["cvs","perforce","tfs","clearcase"]}],"qa":["veronika","vika"],"support":["dima"],"lead":"nadya" }'
       ),
       (
           'buildtools',
           5,
           '[ {"name": "gradle", "state": "development"},{"name": "maven", "state": "development"},{"name": "ant", "state": "support"} ]',
           '{ "developers": [{"name": "nikita", "responsible_for": ["gradle"]}, {"name": "sasha", "responsible_for": ["maven"]},{"name": "vlad", "responsible_for": ["gradle","run targets"]}],"qa":["nastya"],"support":["andrey"],"lead":"nikita" }'
       ),
       (
           'ultimate',
           8,
           '[ {"name": "spring", "state": "development"},{"name": "javaee", "state": "development"},{"name": "jpa", "state": "development"},{"name": "microservices", "state": "development"},{"name": "jboss", "state": "support"},{"name": "docker", "state": "development"},{"name": "diagrams", "state": "support"},{"name": "appservers", "state": "support"},{"name": "http client", "state": "development"} ]',
           '{ "developers": [{"name": "serega", "responsible_for": ["spring","j2ee"]}, {"name": "yura", "responsible_for": ["microservices","mq","toolbox"]},{"name": "kostya", "responsible_for": ["spring","services view"]},{"name": "nikita", "responsible_for": ["jpa"]},{"name": "misha", "responsible_for": ["docker","appservers"]},{"name": "sashaI", "responsible_for": ["http client"]},{"name": "sashaB", "responsible_for": ["diagrams"]}],"qa":["olya","ira","filipp"],"support":[],"lead":"serega" }'
       );