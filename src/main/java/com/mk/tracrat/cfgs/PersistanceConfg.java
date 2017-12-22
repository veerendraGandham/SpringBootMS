package com.mk.tracrat.cfgs;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.mk.tracrat.dao")
public class PersistanceConfg {
	@Bean
	public BasicDataSource dataSource() {
		BasicDataSource source=new BasicDataSource();
		source.setDriverClassName("oracle:jdbc:driver:OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("system");
		source.setPassword("manager");
		return source;
	}
	@Bean
public JdbcTemplate template() {
	return new JdbcTemplate(dataSource());
}
}
