package demo;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public HealthIndicator myHealthIndicator() {
		return () -> {
			if (new Random().nextBoolean()) {
				return Health.up().build();
			}
			else {
				return Health.down().withDetail("booooooo", 42).build();
			}
		};
	}

}
