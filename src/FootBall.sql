create schema "FootBall";

create table "FootBall"."FootBall_club"
(
    id serial not null,
    name_of_club varchar not null,
    place_in_table int not null
);

create unique index football_club_id_uindex
	on "FootBall"."FootBall_club" (id);

create unique index football_club_name_of_club_uindex
	on "FootBall"."FootBall_club" (name_of_club);

create unique index football_club_place_in_table_uindex
	on "FootBall"."FootBall_club" (place_in_table);

alter table "FootBall"."FootBall_club"
    add constraint football_club_pk
        primary key (id);


create table "FootBall"."Workers"
(
    id            serial  not null,
    fio           varchar not null,
    name_of_work  varchar not null,
    football_club integer not null
        constraint workers_football_club_fk
            references "FootBall"."FootBall_club",
    money         integer not null
);