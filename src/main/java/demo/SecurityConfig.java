package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
class SecurityConfig {

	@Bean
	@SuppressWarnings("deprecation")
	public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
		return new InMemoryUserDetailsManager(
				User.withDefaultPasswordEncoder().username("hero").password("hero").roles("HERO", "USER").build(),
				User.withDefaultPasswordEncoder().username("user").password("user").roles("USER").build()
		);
	}

}
