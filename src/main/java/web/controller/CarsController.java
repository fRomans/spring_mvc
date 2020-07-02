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

        if (carMyList.equals(null) ){
            System.out.println(" nuuuuuuuuuuuuuuuuuuuuuuuuuuuulllllll");//todo пересмотреть
        }else {
            carMyList = carService.listCars();
            model.addAttribute("carsList1", carMyList);
        }

        return "cars";//возвращаемая jsp страница!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }

}