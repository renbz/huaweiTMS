package com.ren.dubbocustomer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ren.bean.GoodsInfo;
import com.ren.service.GoodsInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Ren
 */


@Controller
public class GoodsController {


    @Reference
    GoodsInfoService goodsInfoService;


    @RequestMapping("/testDubbo")
    @ResponseBody
    public List<GoodsInfo> test(){


       return goodsInfoService.getGoodsInfo();
    }


}
