package com.vsofo.inventory.feign;

import com.vsofo.entity.Result;
import com.vsofo.inventory.pojo.PigsArchive;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 16:20
 * @description 存栏feign
 */
@FeignClient(name = "pig-service-inventory") // 定义降级的方法
@RequestMapping("/inventory") //会根据动态代理,生成对应的sku 的访问路径拼接起来
public interface InventoryFeign {

    @GetMapping(value = "/findAll")
    public Result<List<PigsArchive>> findAll();
}
