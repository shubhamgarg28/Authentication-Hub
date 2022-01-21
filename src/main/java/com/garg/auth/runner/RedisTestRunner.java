package com.garg.auth.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisTestRunner implements CommandLineRunner {
	
	@Autowired
	StringRedisTemplate redisTemp;

	@Override
	public void run(String... args) throws Exception {
		
		redisTemp.opsForHash().put("1234", "1234", "My Book");
		System.out.println("eXECUTED");
	}

}
