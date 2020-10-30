package com.lonkwick.lonkwickadmin.controller;


import com.lonkwick.lonkwickadmin.entity.PmsProduct;
import com.lonkwick.lonkwickadmin.service.PmsProductService;
import com.lonkwick.lonkwickadmin.utils.BaseResult;
import com.lonkwick.lonkwickadmin.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/31 0:26
 */

@Api(tags = "(PmsProduct)")
@RestController
@RequestMapping("PmsProduct")
public class PmsProductController {

    @Autowired
    private PmsProductService pmsProductService;




    @ApiOperation(value = "根据id查询")
    @GetMapping("queryPmsProductById")  //
    public BaseResult<PmsProduct> queryPmsProductById (Integer brand_id){return ResultUtil.success(pmsProductService.queryById(brand_id));}

//    @ApiOperation(value = "查询所有商品")
//    @GetMapping("queryAllPmsProduct")
//    public BaseResult<List<PmsProduct>> queryAllPmsProduct(PmsProduct pmsProduct.Integer pageNum, Integer pageSize){
//
//
//    }
    //添加商品的接口
//    @ApiOperation(value = "根据id查询")
//    @GetMapping("addPmsProduct")
//    public BaseResult<PmsProduct> addPmsProduct(PmsProduct pmsProduct){
//        return ResultUtil.success(PmsProductService.addPmsProduct(pmsProduct));
//    }
    @ApiOperation(value = "根据id查询")
    @GetMapping("addPmsProduct")
    public BaseResult<PmsProduct> addPmsProduct(PmsProduct pmsProduct){
        return ResultUtil.success(pmsProductService.addPmsProduct(pmsProduct));
    }



}