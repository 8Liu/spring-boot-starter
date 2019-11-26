package com.liudehuang.spring.boot.mybatis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

/**
 * @Description:
 * @Author: liudehuang
 * @CreateDate: 2019-11-26
 * @UpdateUser: liudehuang
 * @UpdateDate: 2019-11-26
 * @UpdateRemark:
 * @Version: 1.0
 */
@ConfigurationProperties(prefix = "spring")
public class DataSourceConfiguration {
    /**
     * 默认数据源配置信息(读取的是)
     */
    private Map<String, String> datasource;
    /**
     * 动态数据源
     */
    private Map<String, DataSourceProperties> dynamicDataBases;

}
