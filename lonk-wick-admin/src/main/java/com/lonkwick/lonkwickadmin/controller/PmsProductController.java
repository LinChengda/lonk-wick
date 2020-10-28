package com.lonkwick.lonkwickadmin.controller;

import com.lonkwick.lonkwickadmin.common.api.CommonPage;
import com.lonkwick.lonkwickadmin.dto.PmsProductParam;
import com.lonkwick.lonkwickadmin.dto.PmsProductQueryParam;
import com.lonkwick.lonkwickadmin.dto.PmsProductResult;
import com.lonkwick.lonkwickadmin.model.PmsProduct;
import com.lonkwick.lonkwickadmin.dto.PmsProductResult;
import com.lonkwickcommon.lonkwickcommon.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/24 21:24
 */
@Controller
@Api(tags="PmsProductController",description="商品管理")
@RequestMapping("/product")
public class PmsProductController {
    @Autowired
    private PmsProductController productService;
    @ApiOperation("创建商品")
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@ResponseBody PmsProductParam productParam){
        int count = productService.create(productParam);
        if(count>0){
            return CommonResult.success(count);
        }
        else {
            return CommonResult.failed();
        }
    }
    @ApiOperation("根据商品id获取商品编辑信息")
    @RequestMapping(value = "/updateInfo/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<PmsProductResult> getUpdateInfo(@PathVariable Long id) {
        PmsProductResult productResult = productService.getUpdateInfo(id);
        return CommonResult.success(productResult);
    }

    @ApiOperation("更新商品")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@PathVariable Long id, @RequestBody PmsProductParam productParam) {
        int count = productService.update(id, productParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("查询商品")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<PmsProduct>> getList(PmsProductQueryParam productQueryParam,
                                                        @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                        @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<PmsProduct> productList = productService.list(productQueryParam, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(productList));
    }


}
