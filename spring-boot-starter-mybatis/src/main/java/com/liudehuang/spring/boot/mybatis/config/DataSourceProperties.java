package com.liudehuang.spring.boot.mybatis.config;


import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-26
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-26
 * @UpdateRemark:
 * @Version: 1.0
 */
@Data
public class DataSourceProperties implements Serializable {
    /**
     * 数据源类型
     */
    private String type;
    /**
     * 驱动
     */
    private String driverClassName;
    /**
     * 数据库路径
     */
    private String url;
    /**
     * 数据库名称
     */
    private String username;
    /**
     * 数据库密码
     */
    private String password;





}
