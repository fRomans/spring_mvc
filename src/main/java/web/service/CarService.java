package web.service;

import web.model.CarMy;

import java.util.List;

public interface CarService {
    void add(CarMy carMy);
    List<CarMy> listCars();
    CarMy getUserByNumberAndSeries(String number, int series);

}
