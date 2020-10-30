package com.lonkwick.lonkwickadmin.utils;


import com.lonkwick.lonkwickadmin.dao.PmsProductDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResultUtil {

    public static PmsProductDao success;
    private static Logger logger =  LoggerFactory.getLogger(ResultUtil.class);


    /*去掉pageNum，pageSize,total的入参，分页将会失效*/
    public static <T> BaseResult<T> success(T data) {
        return commonResult(1, 200, "请求成功",data);
    }

    public static <T> BaseResult<T> success(String errMsg,T data ) {
        return commonResult(1, 200, errMsg,data);
    }

/*临时增加:查询分页专用*/
    public static <T> BaseResult<T> success(T data,Integer pageNum,Integer pageSize,Long total) {
        return commonResult(1, 200, "请求成功",data,pageNum,pageSize,total);
    }

    public static <T> BaseResult<T> success(String errMsg,T data ,Integer pageNum,Integer pageSize,Long total) {
        return commonResult(1, 200, errMsg,data,pageNum,pageSize,total);
    }


    public static <T> BaseResult<T> success() {
        return commonResult(1, 200, "请求成功");
    }


    public static <T> BaseResult<T> error(String errorMsg) {
        return error(200, errorMsg);
    }

    public static <T> BaseResult<T> error(Integer code, String errorMsg) {
        return commonResult(0, code, errorMsg);
    }

    private static <T> BaseResult<T> commonResult(Integer status, Integer code, String errMsg, T data
                                                    ,Integer pageNum,Integer pageSize,Long total) {
        BaseResult<T> result = new BaseResult<>();
        result.setStatus(status);
        result.setCode(code);
        result.setMsg(errMsg);
        result.setData(data);
        result.setPageNum(pageNum);
        result.setPageSize(pageSize);
        result.setTotal(total);

        /**
         *额外增加，分页
         */
//        String str = (String)data.getClass();
/*        if(data.getClass().toString().compareTo("class java.util.ArrayList") == 0) {
            System.out.println("------List类型为：---------"+List.class);
            System.out.println("-------data类型为：------------"+data.getClass());
            PageInfo<T> info = new PageInfo<>((List<T>) data);
            logger.info(info.getPageNum() + "");
            result.setPageNum(info.getPageNum());
            result.setTotal(info.getTotal());

        }*/

/*       PageHelper.startPage(pageNum, pageSize);
       PageInfo<User> pageInfo = new PageInfo<>((List<User>) data);
        logger.info(data.getClass().toString());

        result.setPageNum(pageNum);
        result.setPageSize(pageSize);
        result.setTotal(pageInfo.getTotal());*/


        return result;
    }
    private static <T> BaseResult<T> commonResult(Integer status, Integer code, String errMsg) {
        BaseResult<T> result = new BaseResult<>();
        result.setStatus(status);
        result.setCode(code);
        result.setMsg(errMsg);

        return result;
    }
    private static <T> BaseResult<T> commonResult(Integer status, Integer code, String errMsg,T data) {
        BaseResult<T> result = new BaseResult<>();
        result.setStatus(status);
        result.setCode(code);
        result.setMsg(errMsg);
        result.setData(data);

        return result;
    }

}
