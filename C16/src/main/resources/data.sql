drop table if exists game;
drop table if exists console;

-- tables
create table if not exists console (
    id int auto_increment primary key,
    `name` varchar(255) not null,
    release_year int not null
);

create table if not exists  game (
    id int auto_increment primary key,
    title varchar(255) not null,
    release_year int not null,
    console_id int not null,
    foreign key (console_id) references console(id)
);

-- data
insert into console (id, name, release_year)
values (1, 'Nintendo Entertainment System', 1985),
       (2, 'Super Nintendo Entertainment System', 1991),
       (3, 'Nintendo 64', 1996),
       (4, 'GameCube', 2001),
       (5, 'Nintendo Wii', 2006),
       (6, 'Nintendo Wii U', 2012),
       (7, 'Nintendo Switch', 2017);

insert into game (id, title, release_year, console_id)
values (1, 'Super Mario Bros.', 1985, 1),
       (2, 'Super Mario Bros. 3', 1988, 1),
       (3, 'The Legend of Zelda', 1986, 1),
       (4, 'Super Mario World', 1990, 2),
       (5, 'Donkey Kong Country', 1994, 2),
       (6, 'Super Mario Kart', 1992, 2),
       (7, 'Super Mario 64', 1996, 3),
       (8, 'Banjo-Kazooie', 1998, 3),
       (9, 'Paper Mario', 2000, 3),
       (10, 'Super Smash Bros. Melee', 2001, 4),
       (11, 'Super Mario Sunshine', 2002, 4),
       (12, 'The Legend of Zelda: The Wind Waker', 2002, 4),
       (13, 'Wii Sports', 2006, 5),
       (14, 'Super Mario Galaxy', 2007, 5),
       (15, 'Mario Kart Wii', 2008, 5),
       (16, 'Wii Sports', 2006, 5),
       (17, 'Spaltoon', 2015, 6),
       (18, 'Super Mario 3D World', 2013, 6),
       (19, 'The Legend of Zelda: Breath of the Wild', 2017, 6),
       (20, 'Luigi''s Mansion 3', 2019, 7),
       (21, 'Super Mario Odyssey', 2017, 7),
       (22, 'Animal Crossing: New Horizons', 2020, 7);
