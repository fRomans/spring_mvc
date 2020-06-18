package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.CarMy;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarService carService ;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        List<CarMy> carMyList = carService.listCars();
//        CarMy carMy1 = new CarMy("bmw",1,"111");
//        CarMy carMy2 = new CarMy("mercedes",2,"222");
//        CarMy carMy3 = new CarMy("porshe",3,"333");
//        carService.add(carMy1);
//        carService.add(carMy2);
//        carService.add(carMy3);

        if (carMyList.equals(null) ){
            System.out.println(" nuuuuuuuuuuuuuuuuuuuuuuuuuuuulllllll");//todo пересмотреть
        }else {
            carMyList = carService.listCars();
            model.addAttribute("carsList1", carMyList);
        }


//        String carList = " fight now";
//        model.addAttribute("carsList1", carList);

        return "cars";//возвращаемая jsp страница!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

}