package com.viewnext.inicio.vuelomicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 * @author Jose Moreno
 */
@EntityScan(basePackages="com.viewnext.model")
@EnableJpaRepositories(basePackages="com.viewnext.dao")
@SpringBootApplication(scanBasePackages = {"com.viewnext.controller","com.viewnext.service"})
public class VueloMicroservicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueloMicroservicioApplication.class, args);
    }

}
