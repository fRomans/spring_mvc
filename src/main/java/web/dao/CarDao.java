package web.dao;

import web.model.CarMy;

import java.util.List;

public interface CarDao {

   void add(CarMy carMy);

   List<CarMy> listCars();

   CarMy getUserByNumberAndSeries(String number, int series);
}
