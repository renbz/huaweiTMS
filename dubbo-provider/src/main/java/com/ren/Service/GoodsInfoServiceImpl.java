package com.ren.Service;

import com.alibaba.dubbo.config.annotation.Service;
import com.ren.bean.GoodsInfo;
import com.ren.dao.GoodsInfoDao;
import com.ren.service.GoodsInfoService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Ren
 */


@Component  // 将服务对象交给spring管理  目的是为了生产服务对象
@Service   //dubbo提供的service注解   是为了将spring生产的服务对象提交给注册中心
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Resource
    GoodsInfoDao goodsInfoDao;


    @Override
    public List<GoodsInfo> getGoodsInfo() {



        return goodsInfoDao.getGoodsInfo();
    }
}
