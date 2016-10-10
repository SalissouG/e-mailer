# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table login (
  mdp                       varchar(255),
  email                     varchar(255))
;

create table message (
  id                        varchar(255) not null,
  message                   varchar(255),
  destination               varchar(255),
  objet                     varchar(255),
  constraint pk_message primary key (id))
;

create sequence message_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists login;

drop table if exists message;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists message_seq;

