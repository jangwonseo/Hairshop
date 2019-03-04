package com.example.jangwonseo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages={"com.example.jangwonseo"}) //@Configuration + @EvableAutoConfiguration + @ComponentScan
@EnableJpaAuditing
public class HairShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(HairShopApplication.class, args);
	}

}
