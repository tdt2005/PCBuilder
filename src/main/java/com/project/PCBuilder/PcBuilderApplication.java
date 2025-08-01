package com.project.PCBuilder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
     info = @Info(title = "PC Builder API", version = "1.0", description = "API for PC Builder project"),
     servers = @Server(url = "https://pcbuilder-production-592f.up.railway.app")
)
@SpringBootApplication
public class PcBuilderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcBuilderApplication.class, args);
    }

}
