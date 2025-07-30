package com.project.PCBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;


@SpringBootApplication
public class PcBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcBuilderApplication.class, args);
    }

}
