package com.Spring.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class UserSecurity   {


	@Bean
    public SecurityFilterChain  getFilter(HttpSecurity http) throws Exception {
    	
		http.authorizeHttpRequests()
		.requestMatchers( "/user/**")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and().formLogin();
    	
        return  http.build();
        }
	
//    @Bean
//   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//       return http.authorizeHttpRequests(request -> request.requestMatchers(new AntPathRequestMatcher("/user/**"))
//               .permitAll())
//           .authorizeHttpRequests(request -> request.requestMatchers(new AntPathRequestMatcher("/user/**"))
//               .hasRole("ADMIN")
//               .anyRequest()
//               .authenticated())
//           .httpBasic(Customizer.withDefaults())
//           .build();
//   }
}



