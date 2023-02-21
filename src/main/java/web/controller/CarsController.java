package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String getCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        if (count.isEmpty() || count.get() > 5) {
            model.addAttribute("cars", carService.findNCars());
        } else {
            model.addAttribute("cars", carService.findNCars(count.get()));
        }
        return "cars";
    }
}
