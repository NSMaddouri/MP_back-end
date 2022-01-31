package com.examplegroupe.interiorservice.controller;

import com.examplegroupe.interiorservice.entity.Info;
import com.examplegroupe.interiorservice.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class InfoController {

    @Autowired
    private InfoService infoService;

    @PostMapping("/")
    public Info saveInfo(@RequestBody Info info){

        return infoService.saveInfo(info) ;

    }
    @GetMapping("/{id}")
    public Info findInfoById(@PathVariable ("id") Long id) {
        return infoService.findInfoById(id);
    }
}
