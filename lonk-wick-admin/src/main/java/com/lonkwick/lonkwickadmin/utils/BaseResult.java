package com.lonkwick.lonkwickadmin.utils;

import lombok.Data;

@Data
public class BaseResult<T> {

    private Integer code;

    private Integer status;

    private String msg;


    private T data;

    //当前页
    private Integer pageNum;
    //每页的数量
    private int pageSize;
    //总记录数
    private long total;



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }




     /**     分页
      **/



   public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }


    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }


    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;

    }
}
