package com.vsofo.controller;

import com.vsofo.entity.Result;
import com.vsofo.inventory.feign.InventoryFeign;
import com.vsofo.inventory.pojo.PigsArchive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    /**
     * feign 调用测试
     * @return 测试结果
     */
    @GetMapping("/feignTest")
    public Result<List<PigsArchive>> feignTest(){
        Result<List<PigsArchive>> listResult = inventoryFeign.findAll();
        System.out.println(listResult);
        return listResult;
    }
}
