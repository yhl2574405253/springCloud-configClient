package cn.et.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {
    @Value("${url}")
    private String url;

    @Value("${driverClass}")
    private String driverClass;

    @Value("${password}")
    private String password;

    @Value("${username}")
    private String userName;

    @Bean
    public DataSource myDataSource(){
        DruidDataSource dds =new DruidDataSource();
        dds.setDriverClassName(driverClass);
        dds.setPassword(password);
        dds.setUrl(url);
        dds.setUsername(userName);
        return dds;
    }
}
