package com.ks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tk.mybatis.mapper.autoconfigure.ConfigurationCustomizer;

@Configuration //mybatis的配置类
public class MyBatisConfig {
	
	@Bean
	public ConfigurationCustomizer configurationCustomizer(){
		return new ConfigurationCustomizer() {
//			@Override
			public void customize(org.apache.ibatis.session.Configuration configuration) {
				//开启驼峰命名法
				configuration.setMapUnderscoreToCamelCase(true);
			}
		};
	}
}