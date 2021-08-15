DROP TABLE IF EXISTS teams;

CREATE TABLE teams
(
    team_id   INT AUTO_INCREMENT PRIMARY KEY,
    season    INT     NOT NULL,
    driver    VARCHAR NOT NULL,
    team_name VARCHAR NOT NULL,
    place     INT     NOT NULL
);

-- 2008
INSERT INTO teams (season, driver, team_name, place)
VALUES (2008, 'Lewis Hamilton', 'McLaren', 1),
       (2008, 'Felipe Massa', 'Ferrari', 2),
       (2008, 'Kimi Raikkonen', 'Ferrari', 3);

-- 2009
INSERT INTO teams (season, driver, team_name, place)
VALUES (2009, 'Jenson Button', 'Brawn GP', 1),
       (2009, 'Sebastian Vettel', 'Red Bull Racing', 2),
       (2009, 'Rubens Barichello', 'Brawn GP', 3);

-- 2010
INSERT INTO teams (season, driver, team_name, place)
VALUES (2010, 'Sebastian Vettel', 'Red Bull Racing', 1),
       (2010, 'Fernando Alonso', 'Ferrari', 2),
       (2010, 'Mark Webber', 'Red Bull Racing', 3);

-- 2011
INSERT INTO teams (season, driver, team_name, place)
VALUES (2011, 'Sebastian Vettel', 'Red Bull Racing', 1),
       (2011, 'Jenson Button', 'McLaren', 2),
       (2011, 'Mark Webber', 'Red Bull Racing', 3);

-- 2012
INSERT INTO teams (season, driver, team_name, place)
VALUES (2012, 'Sebastian Vettel', 'Red Bull Racing', 1),
       (2012, 'Fernando Alonso', 'Ferrari', 2),
       (2012, 'Kimi Raikkonen', 'Lotus F1', 3);

-- 2013
INSERT INTO teams (season, driver, team_name, place)
VALUES (2013, 'Sebastian Vettel', 'Red Bull Racing', 1),
       (2013, 'Fernando Alonso', 'Ferrari', 2),
       (2013, 'Mark Webber', 'Red Bull Racing', 3);

-- 2014
INSERT INTO teams (season, driver, team_name, place)
VALUES (2014, 'Lewis Hamilton', 'Mercedes', 1),
       (2014, 'Nico Rosberg', 'Mercedes', 2),
       (2014, 'Daniel Ricciardo', 'Red Bull Racing', 3);

-- 2015
INSERT INTO teams (season, driver, team_name, place)
VALUES (2015, 'Lewis Hamilton', 'Mercedes', 1),
       (2015, 'Nico Rosberg', 'Mercedes', 2),
       (2015, 'Sebastian Vettel', 'Ferrari', 3);