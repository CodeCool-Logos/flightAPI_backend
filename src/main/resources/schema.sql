DROP TABLE IF EXISTS AIRLINE;
drop table if exists airplane;
drop table if exists airport;
drop table if exists city;
drop table if exists flight;

create table AIRLINE (
    id BIGINT auto_increment not null, primary key (id),
    name varchar(255) NOT NULL,
    iso varchar(255) NOT NULL );

create table CITY (
    city_id bigint not null auto_increment,
    city_name varchar(255),
    primary key (city_id));

create table airplane (id bigint not null auto_increment, manufacturer varchar(255), model varchar(255), number_of_seats bigint, speed double not null, airline_id bigint, primary key (id));
create table AIRPORT (
    airport_id BIGINT auto_increment not null, primary key (airport_id),
    airport_name varchar(255),
    airport_iata_code varchar(3),
    city_id bigint, foreign key (city_id) references city(city_id));

create table FLIGHT (
    flight_id bigint not null auto_increment,
    arrival_time time,
    date date,
    departure_time time,
    price bigint,
    airline_id bigint,
    arrival_airport_id bigint,
    departure_airport_id bigint,
    primary key (flight_id));

-- alter table airplane add constraint foreign key (airline_id) references airline;
-- alter table airport add foreign key (city_id) references city;
-- alter table flight add constraint foreign key (airline_id) references airline;
-- alter table flight add constraint foreign key (arrival_airport_id) references airport;
-- alter table flight add constraint foreign key (departure_airport_id) references airport;