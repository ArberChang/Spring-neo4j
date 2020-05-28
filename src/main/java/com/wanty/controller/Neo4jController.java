package com.wanty.controller;

import com.wanty.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Neo4jController {


    @Autowired
    private SupplyService supplyService;



    @RequestMapping(path = "/supply", method = RequestMethod.GET)
    public Boolean supply() {
        this.supplyService.testService();
        return true;
    }

}
