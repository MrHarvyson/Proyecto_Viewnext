package com.viewnext.inicio.reservamicroservicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jose Moreno
 */
@EntityScan(basePackages="com.viewnext.model")
@EnableJpaRepositories(basePackages="com.viewnext.dao")
@SpringBootApplication(scanBasePackages = {"com.viewnext.controller","com.viewnext.service"})
public class ReservaMicroservicioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservaMicroservicioApplication.class, args);
    }

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }

}
