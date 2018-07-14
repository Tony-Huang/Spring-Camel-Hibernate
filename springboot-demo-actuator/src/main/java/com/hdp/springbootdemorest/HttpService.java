package com.hdp.springbootdemorest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@RestController
public class HttpService {

    static int cummu_male = 200;
    static int cummu_female = 120;


    @GetMapping("/temperature")
    public Temperature getTemperature() {
       return this.genRandonTemperature();
    }

    private Temperature genRandonTemperature(){
        Random  rand = new Random();
        int  tempInt  = rand.nextInt(40);
        Float temp =  (float)tempInt   +rand.nextFloat();
        Temperature t = new Temperature("1",temp);
        return t;
    }

  

}
