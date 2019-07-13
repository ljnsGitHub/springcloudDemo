package com.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.client.AccountClient;
import com.demo.pojo.Account;


@RestController
@RequestMapping("/consumer")
//@DefaultProperties(defaultFallback = "defaultFallback") //feign中提供了另外一种熔断配置
public class AccountController {
//	@Autowired
//	private RestTemplate restTemplate;
//	@Autowired
//	private AccountService accountService;

	@Autowired
	private AccountClient accountClient;

	@GetMapping("{id}")
	@ResponseBody
//	@HystrixCommand   //单独使用hystrix得熔断配置使用的注解   引入feign后可以使用另外一种配置熔断器的方式 在 接口AccountClient中 feign
	public String queryById(@PathVariable Long id) {
		Account account = accountClient.queryById(id);
		return account.toString();
	}

//	@GetMapping("{id}")
//	@ResponseBody
//	@HystrixCommand(commandProperties= {   // 类名：HystrixCommandProperties
//			//@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds",value = "3000"),//单独设置超时时长
//			//熔断处理：
//			@HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value = "10"),//每次统计的请求个数
//			@HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value = "5000"),//停止窗口
//			@HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "60")  //触发熔断器的统计请求失败个数占比
//	})
//	public String queryById(@PathVariable Long id){
//        String url = "http://localhost:8080/Account/" + id;
//        return this.restTemplate.getForObject(url, Account.class);

//		if(id%2==0) {
//			throw new RuntimeException("");
//		}
//		String string = accountService.getOneAccountById(id).toString();
//		return string;
//    }

	public String defaultFallback() {
		return "服务器繁忙";
	}
}
