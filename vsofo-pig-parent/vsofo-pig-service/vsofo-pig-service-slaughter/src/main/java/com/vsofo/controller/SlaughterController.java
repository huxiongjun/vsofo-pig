package com.vsofo.controller;

import com.vsofo.entity.Result;
import com.vsofo.inventory.feign.InventoryFeign;
import com.vsofo.inventory.pojo.PigsArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 16:29
 * @description 出栏控制类
 */
@RestController
@RequestMapping("/slaughter")
public class SlaughterController {
    @Autowired
    private InventoryFeign inventoryFeign;
    @GetMapping("/feignTest")
    public String feignTest(){
        Result<PigsArchive> pigsArchiveResult = inventoryFeign.findAll();
        System.out.println(pigsArchiveResult.getData());
        return "success";
    }
}
