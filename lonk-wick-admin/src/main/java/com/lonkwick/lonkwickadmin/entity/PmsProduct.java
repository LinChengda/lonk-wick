package com.lonkwick.lonkwickadmin.entity;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author Wick
 * @version 1.0
 * @date 2020/10/31 1:21
 */
public class PmsProduct implements Serializable {
    private static final long serialVersionUID = -92813825546574494L;

    @ApiModelProperty("$column.comment")
    private Integer brand_id;

    @ApiModelProperty("column.comment")
    private Integer product_category_id;

    public Integer getBrand_id(){return this.brand_id;}
}
