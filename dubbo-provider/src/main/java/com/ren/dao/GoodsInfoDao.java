package com.ren.dao;



import com.ren.bean.GoodsInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Ren
 */

public interface GoodsInfoDao {

    @Select("select * from goodsinfo")
    List<GoodsInfo> getGoodsInfo();

}
