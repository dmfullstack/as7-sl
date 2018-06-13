package com.stackroute.activitystream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

import com.stackroute.activitystream.config.JwtFilter;



@ComponentScan(basePackages= {"com.stackroute"})
@SpringBootApplication(scanBasePackages={"com.stackroute"})
@EntityScan(basePackages={"com.stackroute"})
@EnableAutoConfiguration
public class AuthenticationServiceBoot {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/api/*");

		return registrationBean;
	}
	
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(AuthenticationServiceBoot.class, args);
	}
	
}
