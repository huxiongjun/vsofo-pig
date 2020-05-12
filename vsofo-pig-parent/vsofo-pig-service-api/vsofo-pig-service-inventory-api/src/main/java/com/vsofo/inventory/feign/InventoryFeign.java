package com.vsofo.inventory.feign;

import com.vsofo.entity.Result;
import com.vsofo.inventory.pojo.PigsArchive;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/12 16:20
 * @description 存栏feign
 */
@FeignClient(name = "pig-service-inventory")
@RequestMapping("/inventory") //会根据动态代理,生成对应的sku 的访问路径拼接起来
public interface InventoryFeign {
    /**
     * 查询猪只档案的所有数据,得到猪只档案全部数据
     * @return 所有猪只档案列表
     */
    @GetMapping(value = "/findAll")
    public Result<PigsArchive> findAll();
}
