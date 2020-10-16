package com.lonkwick.lonkwicksecurity.annotation;

import java.lang.annotation.*;

/**
 * 自定义缓存异常注解
 *
 * @author linchengda
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
