package com.MoboFlux.Controller;

import java.time.Duration;
import java.util.stream.Stream;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MoboFlux.Binding.UserInfo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping( value="/get" , produces=MediaType.APPLICATION_JSON_VALUE)
	public Mono<UserInfo>  getUser() {
		
		UserInfo user=new UserInfo(123,"Vishal","Vishal@gmail.com");
		
		return Mono.justOrEmpty(user);
		
	}
	
	
	@GetMapping( value="/gets" , produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Object>  getUsers() {
		
		UserInfo user=new UserInfo(123,"Vishal","Vishal@gmail.com");
		
        Stream<UserInfo> stream= Stream.generate(()->user);		
	    Flux<UserInfo> flux=Flux.fromStream(stream);
	    Flux<Long>  interval=Flux.interval(Duration.ofSeconds(3));
	                    
	Flux<Tuple2<UserInfo, Long>> zip= Flux.zip(flux, interval);
	 
	
	Flux<Object>  infomap =  zip.map(Tuple2::getT2);
	
	
	return   infomap;
	
	}
	
	
	
	
	

}
