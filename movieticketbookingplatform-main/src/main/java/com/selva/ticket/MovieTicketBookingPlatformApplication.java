package com.selva.ticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.selva"})
@EnableJpaRepositories("com.selva.ticket.booking")
@EntityScan("com.selva.ticket.booking")
@EnableSwagger2
public class MovieTicketBookingPlatformApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieTicketBookingPlatformApplication.class, args);
	}

}
