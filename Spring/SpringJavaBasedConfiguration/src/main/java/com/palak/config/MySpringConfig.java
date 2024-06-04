package com.palak.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.palak.Message;

@Configuration
public class MySpringConfig {

	@Bean(name="message")
	public Message message()
	{
		return new Message();
	}
}
