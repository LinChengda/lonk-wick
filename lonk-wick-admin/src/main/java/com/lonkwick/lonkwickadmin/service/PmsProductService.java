package com.lonkwick.lonkwickadmin.service;

import com.lonkwick.lonkwickadmin.entity.PmsProduct;

import java.util.List;

/**
 * (PmsProduct 表服务接口）
 * @author Wick
 * @version 1.0
 * @date 2020/10/31 0:45
 */
public interface PmsProductService {

    /**
     * 通过brand_id查询单挑数据
     * @param brand_id
     * @return 实例对象
     */

    PmsProduct queryById(Integer brand_id);

    /**
     * 查询多条数据
     * @param offset
     * @param limit
     * @return 对象列表
     */

    List<PmsProduct> queryAllByLimit(int offset, int limit);


    /**
     * 新增商品
     * @param pmsProduct
     * @return 实例对象
     */
     PmsProduct addPmsProduct(PmsProduct pmsProduct);

    PmsProduct updatePmsProduct(PmsProduct pmsProduct);

    boolean deleteById(Integer brand_id);

    List<PmsProduct> queryAllPmsProduct(PmsProduct pmsProduct);

    List<PmsProduct> countPmsProduct(PmsProduct pmsProduct);
}
