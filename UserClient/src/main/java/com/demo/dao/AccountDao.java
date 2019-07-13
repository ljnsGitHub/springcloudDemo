package com.demo.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.pojo.Account;

import com.netflix.ribbon.proxy.annotation.Hystrix;

@Component
//@DefaultProperties(defaultFallback = "queryUserByIdFallback")
public class AccountDao {
	private static final Logger logger = LoggerFactory.getLogger(AccountDao.class);
	@Autowired
	private RestTemplate restTemplate;

//	@HystrixCommand(fallbackMethod = "queryUserByIdFallback")  //单一配置服务降级
	public Account getOneAccountById(Long id) {
		long begin = System.currentTimeMillis();
		String baseUrl = "http://account-service/account/";
		Account account = restTemplate.getForObject(baseUrl + id, Account.class);
		long end = System.currentTimeMillis();
		logger.info("访问用时：{}", end - begin);

		return account;
	}
	
	
	public Account queryUserByIdFallback(Long id){
		Account user = new Account();
		user.setId(id);
        user.setName("用户信息查询出现异常！");
        return user;
    }
}
