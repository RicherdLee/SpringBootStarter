#整合Dubbo
##采用注解方式整合Dubbo
采用alibaba的依赖,但由于dubbo在2.6.6之前存在于SpingBoot注解加载顺序问题,导致客户端使用@Reference时出现空指针异常,因此将alibaba中的dubbo依赖升级为2.6.6
依赖如下
```
<dependency>
    <groupId>com.alibaba.spring.boot</groupId>
    <artifactId>dubbo-spring-boot-starter</artifactId>
        <exclusions>
        <!-- 去除旧依赖 -->
        <exclusion>
        <groupId>com.alibaba</groupId>
        <artifactId>dubbo</artifactId>
        </exclusion>
    </exclusions>
    <version>2.0.0</version>
</dependency>
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>dubbo</artifactId>
    <version>2.6.6</version>
</dependency>
```
##dubbo-interfaces为接口定义模块,dubbo-service*为服务提供方,dubbo-customer为服务使用方

