package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.CarMy;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

   @Autowired
   private CarDao carDao;

   @Transactional
   @Override
   public void add(CarMy carMy) {
      carDao.add(carMy);
   }


   @Transactional(readOnly = true)
   @Override
   public List<CarMy> listCars() {
      return carDao.listCars();
   }


   @Override
   public CarMy getUserByNumberAndSeries(String number, int series){
     return carDao.getUserByNumberAndSeries(number,series);
   }

}
