package com.Git.Project.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.savedrequest.NullRequestCache;


@Configuration
public class UserConfiguration  {
	
	//this is used to define some creditencial to particluar members.
	
	@Bean
	public InMemoryUserDetailsManager  getAccessed() {
		
		UserDetails  userdetail=User.withDefaultPasswordEncoder().username("Vishal").password("Vishal@123").authorities("Admin").build();
		
		UserDetails   userdetails=User.withDefaultPasswordEncoder().username("Nishu").password("Nishu@123").authorities("User").build();
		
		
		return new InMemoryUserDetailsManager(userdetail,userdetails);
	}
	
	
	//providing security to specific methods 
	
	@Bean
	SecurityFilterChain   getfilter(HttpSecurity  http) throws Exception {
		
		http.csrf(AbstractHttpConfigurer::disable);
		
		
		http.authorizeHttpRequests(req->req.requestMatchers(HttpMethod.POST,"/user/add").permitAll().anyRequest().authenticated()).formLogin();
		
		
		return http.build();
		
		
	}
	
	
	
//	@Bean
//	SecurityFilterChain configure(HttpSecurity http) throws Exception {
//	    http
//	        .csrf().disable();// Disable CSRF protection
//	      
//	    
//	    return http.build();
//	}
	
//	@Bean
//	SecurityFilterChain configuree(HttpSecurity http) throws Exception {
//	    http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().
//	        authorizeRequests().requestMatchers(HttpMethod.GET, "/**").hasAnyAuthority("USER")
//	                           .requestMatchers(HttpMethod.POST, "/**").hasAnyRole("ADMIN", "USER")
//	                           .and().
//	      
//	        cors().and().
//	        csrf().disable();
//	    
//	    return http.build();
//	}
	
	
	
	
	
	
	

}
