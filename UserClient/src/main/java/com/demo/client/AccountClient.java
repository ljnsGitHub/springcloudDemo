package com.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.client.fallback.AccountClientFallback;
import com.demo.pojo.Account;

@FeignClient(value = "account-service",fallback = AccountClientFallback.class)
public interface AccountClient {
	
	@GetMapping("account/{id}")
	Account queryById(@PathVariable Long id);
}
