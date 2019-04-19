package cn.et;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描mapper包 一般用于全局 （推荐使用） 或许在每个类上面加 @Mapper注解效果等价
@MapperScan("cn.et.**.mapper")
public class Test {
    public static void main(String[] args) {
        SpringApplication.run(Test.class,args);
    }
}
