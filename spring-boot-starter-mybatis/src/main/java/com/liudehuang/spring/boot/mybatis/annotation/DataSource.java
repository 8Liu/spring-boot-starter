package com.liudehuang.spring.boot.mybatis.annotation;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-26
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-26
 * @UpdateRemark:
 * @Version: 1.0
 */
@Documented
@Inherited
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSource {
    String value() default "";
}