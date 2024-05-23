package com.ohgiraffers.semi_project.subpage.car.controller;


import com.ohgiraffers.semi_project.auth.model.service.Userdata;
import com.ohgiraffers.semi_project.subpage.car.model.dto.CarJoinDTO;
import com.ohgiraffers.semi_project.subpage.car.model.service.CarService;
import com.ohgiraffers.semi_project.user.model.dto.LoginUserDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/subpage")
public class CarSituationController {

    private static final Logger logger = LogManager.getLogger(CarController.class);

    private final CarService carService;
    private final MessageSource messageSource;

    @Autowired
    public CarSituationController(CarService carService, MessageSource messageSource) {
        this.carService = carService;
        this.messageSource = messageSource;
    }


    @GetMapping("car_situation")
    public String siCarList(Model model, @RequestParam(required = false) String type) {
        System.out.println(type);
        List<CarJoinDTO> siCarList = carService.findAllSiCar();
        model.addAttribute("siCarList", siCarList);

        System.out.println("siCarList = " + siCarList);


        return "subpage/car_situation";
    }

    @GetMapping("car_situation_mypage")
    public String siCarMyList(Model model) {

        Userdata userdata = new Userdata();
        LoginUserDTO userDTO = userdata.getloginUserDTO();
        int userCode = userDTO.getUserCode();


        List<CarJoinDTO> siCarMyList = carService.findAllSiMyCar(userCode);
        model.addAttribute("siCarMyList", siCarMyList);

        System.out.println("siCarMyList = " + siCarMyList);


        return "subpage/car_situation_mypage";
    }
}
