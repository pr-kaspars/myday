drop table if exists experiment;
drop table if exists reaction;
drop table if exists recognition;

create table experiment(
  id         serial PRIMARY KEY,
things     jsonb
);

create table recognition(
  id         serial PRIMARY KEY,
  message    varchar(2000) NOT NULL,
  author     varchar(128) NOT NULL,
  recipient  varchar(128) NOT NULL
);

create table reaction(
  id             serial PRIMARY KEY,
recognition_id integer NOT NULL,
author         varchar(128) NOT NULL,
kind           varchar(32) NOT NULL,
message        varchar(1000),
foreign key(recognition_id) references recognition(id)
);
