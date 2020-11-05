insert into city (city_name) values ('Bucuresti');
insert into city (city_name) values ('London');
insert into city (city_name) values ('Paris');
insert into city (city_name) values ('Timisoara');
--
insert into airport (airport_name, airport_iata_code, city_id) values ('Henri Coanda International Airport', 'OTP', 1);
insert into airport (airport_name, airport_iata_code) values ('London Heathrow Airport', 'LHR');
insert into airport (airport_name, airport_iata_code) values ('Charles de Gaulle International Airport', 'CHD');
insert into airport (airport_name, airport_iata_code) values ('Timisoara Traian Vuia Airport', 'TVT');

insert into airline (name, iso) values ('Tarom','OTO');
insert into airline (name, iso) values ('British Airways','OTO');
insert into airline (name, iso) values ('Air France','OTO');
insert into airline (name, iso) values ('Wizz Air','OTO');
--
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Boeing', 'B373', 160, 800,1);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Boeing', 'B737', 180, 700,2);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Boeing', 'B747', 200, 900,3);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Boeing', 'B777', 190, 750,4);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Airbus', 'A320', 150, 800,5);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Airbus', 'A300', 160, 800,6);
insert into airplane (manufacturer, model, number_of_seats, speed, airline_id) values ('Airbus', 'A340', 180, 900,7);


insert into flight (airline_id, arrival_airport_id, arrival_time, date, departure_airport_id, departure_time, price)
                values (1, 1, '06:30', '2020-11-01', 2, '09:30', 35);
insert into flight (airline_id, arrival_airport_id, arrival_time, date, departure_airport_id, departure_time, price)
                values (2, 2, '06:30', '2020-11-01', 1, '09:30', 35);
insert into flight (airline_id, arrival_airport_id, arrival_time, date, departure_airport_id, departure_time, price)
            values (3, 1, '06:30', '2020-11-01', 3, '09:30', 35);
insert into flight (airline_id, arrival_airport_id, arrival_time, date, departure_airport_id, departure_time, price)
                values (1, 3, '06:30', '2020-11-01', 1, '09:30', 35);
insert into flight (airline_id, arrival_airport_id, arrival_time, date, departure_airport_id, departure_time, price)
                values (4, 2, '06:30:00', '2020-11-01', 4, '09:30:00', 35);