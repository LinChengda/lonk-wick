package com.lonkwick.lonkwickadmin.dao;

import com.lonkwick.lonkwickadmin.dto.PmsProductResult;
import org.apache.ibatis.annotations.Param;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/26 23:46
 */
public interface PmsProductDao {
    /**
     * 获取商品编辑信息
     */
    PmsProductResult getUpdateInfo(@Param("id") Long id);
}
