package com.sdy.ocean.user;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
//次一级映射  映射到包一级就可以
@MapperScan(basePackages = "com.sdy.ocean.user.mapper")
public class OceanUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(OceanUserApplication.class, args);
	}

}
