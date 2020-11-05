package com.codecool.flight_api_project.airplane;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class AirplaneServiceImpl implements AirplaneService {

    @Autowired
    private AirplaneRepository airplaneRepository;

    @Override
    public Airplane saveAirplane(Airplane airplane) {
        return airplaneRepository.save(airplane);
    }

    @Override
    public void deleteAirplaneByID(Long id) {
        airplaneRepository.deleteById(id);
    }


    @Override
    public Airplane updateAirplaneById(Long id, Airplane airplaneToUpdate) {
        Airplane airplane = airplaneRepository.findById(id).get();

        airplane.setManufacturer(airplaneToUpdate.getManufacturer());
        airplane.setModel(airplaneToUpdate.getModel());
        airplane.setNumberOfSeats(airplaneToUpdate.getNumberOfSeats());
        airplane.setSpeed(airplaneToUpdate.getNumberOfSeats());

        return airplaneRepository.save(airplane);
    }
}
