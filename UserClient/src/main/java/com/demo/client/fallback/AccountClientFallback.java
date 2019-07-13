package com.demo.client.fallback;

import org.springframework.stereotype.Component;

import com.demo.client.AccountClient;
import com.demo.pojo.Account;

@Component
public class AccountClientFallback implements AccountClient {

	@Override
	public Account queryById(Long id) {
		Account account = new Account();
		account.setName("服务器繁忙，请求失败");
		return account;
	}

}
