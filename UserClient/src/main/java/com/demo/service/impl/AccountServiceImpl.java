package com.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AccountDao;
import com.demo.pojo.Account;
import com.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
//	@Autowired
//    private RestTemplate restTemplate;

//    @Autowired
//    private DiscoveryClient discoveryClient;// Eureka客户端，可以获取到服务实例信息
	
	@Autowired
	private AccountDao accountDao;
    
    public Account getOneAccountById(Long id) {
    	// 根据服务名称，获取服务实例
//        List<ServiceInstance> instances = discoveryClient.getInstances("account-service");
        // 因为只有一个UserService,因此我们直接get(0)获取
//        ServiceInstance instance = instances.get(0);
        // 获取ip和端口信息
//        String baseUrl = "http://"+instance.getHost() + ":" + instance.getPort()+"/account/";
        
        
//        String baseUrl = "http://account-service/account/";
//        Account account = this.restTemplate.getForObject(baseUrl + id, Account.class);
        
        return accountDao.getOneAccountById(id);
    }
}

