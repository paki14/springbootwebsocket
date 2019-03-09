package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

	@Override
	public void configureMessageBroker(MessageBrokerRegistry config) {
		config.enableSimpleBroker("/topic");
		config.setApplicationDestinationPrefixes("/gkz");
	}

	@Override
//	@Schthis.userideduled(fixedRate = 10000)
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry
		.addEndpoint("/gkz-stomp-endpoint")
		.setAllowedOrigins("http://localhost:4200")
//		.setAllowedOrigins("http://localhost:8001/careperson/1")
		.withSockJS();
//		registry
//		.addEndpoint("/getServer")
////		.setAllowedOrigins("http://localhost:4200")
//		.setAllowedOrigins("http://localhost:8001/careperson/1")
//		.withSockJS();
	}
}