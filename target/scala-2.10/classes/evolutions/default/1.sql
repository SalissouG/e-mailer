# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table message (
  id                        varchar(255) not null,
  message                   varchar(255),
  destination               varchar(255),
  objet                     varchar(255),
  constraint pk_message primary key (id))
;

create table user (
  nom                       varchar(255),
  email                     varchar(255),
  mdp                       varchar(255),
  is_active                 boolean)
;

create sequence message_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists message;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists message_seq;

