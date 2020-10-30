package com.lonkwick.lonkwickadmin.service.impl;

import com.lonkwick.lonkwickadmin.dao.PmsProductDao;
import com.lonkwick.lonkwickadmin.entity.PmsProduct;
import com.lonkwick.lonkwickadmin.service.PmsProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/31 0:46
 */

@Service("PmsProductService")
public class PmsProductServiceImpl implements PmsProductService {
    @Resource
    private PmsProductDao pmsProductDao;

    @Override
    public PmsProduct queryById(Integer brand_id){return this.pmsProductDao.queryById(brand_id);}

    @Override
    public List<PmsProduct> queryAllByLimit(int offset,int limit){return this.pmsProductDao.queryAllByLimit(offset,limit);}

    @Override
    public PmsProduct addPmsProduct(PmsProduct pmsProduct){
        this.pmsProductDao.addPmsProduct(pmsProduct);
        return pmsProduct;
    }

    @Override
    public PmsProduct updatePmsProduct(PmsProduct pmsProduct){
        this.pmsProductDao.updatePmsProduct(pmsProduct);
        return this.queryById(pmsProduct.getBrand_id());
    }

    @Override
    public boolean deleteById(Integer brand_id){return this.pmsProductDao.deleteById(brand_id)>0;}


    @Override
    public List<PmsProduct> queryAllPmsProduct(PmsProduct pmsProduct){return this.pmsProductDao.queryAll(pmsProduct);}

    @Override
    public List<PmsProduct> countPmsProduct(PmsProduct pmsProduct){return this.pmsProductDao.queryAll(pmsProduct);}
}
