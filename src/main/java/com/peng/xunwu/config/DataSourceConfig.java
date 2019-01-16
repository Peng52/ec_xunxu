package com.peng.xunwu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;


/**
 * @author : peng
 * @Description : 数据库连接池配置
 * @Date : 2019-01-16 14:31
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.peng.xunwu.repository")//扫描基础包
@EnableTransactionManagement//开启事务支持
public class DataSourceConfig {

    //配置Druid数据源
    @Bean("dataSource")
    //注入spring.datasource的配置信息
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource getDataSource(){
        return new DruidDataSource();
    }
    //创建实体类管理工厂
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
       /* Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");*/
        jpaVendorAdapter.setGenerateDdl(false);//不自动生成sql,自己掌握sql
        LocalContainerEntityManagerFactoryBean entityManagerFactory = new LocalContainerEntityManagerFactoryBean();
        entityManagerFactory.setDataSource(getDataSource());
        entityManagerFactory.setJpaVendorAdapter(jpaVendorAdapter);
        //?实体类的扫描
        entityManagerFactory.setPackagesToScan("com.peng.xunwu.entity");
        return entityManagerFactory;

    }
    //事务管理类
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory){
        JpaTransactionManager jpaTransactionManager = new JpaTransactionManager();
        jpaTransactionManager.setEntityManagerFactory(entityManagerFactory);
        return jpaTransactionManager;
    }


}
