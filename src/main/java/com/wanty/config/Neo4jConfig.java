package com.wanty.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration //springboot声明配置类，一般为单例模式
@EnableNeo4jRepositories(basePackages = "io.fredia.femicro.graph.repository") //Neo4j扫描Repositories所在包，理解为mybatis扫描mapper包
@EnableTransactionManagement // 激活SDN隐式事务 Neo4j完整的支持ACID，所以此处开启事务功能。
public class Neo4jConfig {
}
