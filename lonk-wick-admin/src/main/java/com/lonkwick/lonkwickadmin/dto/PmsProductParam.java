package com.lonkwick.lonkwickadmin.dto;

import com.lonkwick.lonkwickadmin.model.PmsProduct;
import com.lonkwick.lonkwickadmin.model.PmsProductLadder;
import com.lonkwick.lonkwickadmin.model.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 创建和修改商品时使用的参数
 * Created by macro on 2018/4/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PmsProductParam extends PmsProduct {
    @ApiModelProperty("商品阶梯价格设置")
   private List<PmsProductLadder> productLadderList;

}
