package com.lonkwick.lonkwickadmin.dao;

import com.lonkwick.lonkwickadmin.entity.PmsProduct;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/31 1:02
 * (PmsProduct)表数据库访问层
 */

@Mapper
@Repository
public interface PmsProductDao {

    PmsProduct queryById(Integer brand_id);


    List<PmsProduct> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

    List<PmsProduct> queryAll(PmsProduct pmsProduct);

    int addPmsProduct(PmsProduct pmsProduct);

    int updatePmsProduct(PmsProduct pmsProduct);

    int deleteById(Integer brand_id);
}
