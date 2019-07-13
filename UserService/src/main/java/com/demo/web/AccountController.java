package com.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.pojo.Account;
import com.demo.service.AccountService;



@RestController
@RequestMapping("account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	
	@GetMapping("{id}")
	@ResponseBody
	public Object getAccount(@PathVariable Long id) {
		return accountService.getAccount(id);
	}
	
	@PostMapping("addAccount")
	@ResponseBody
	public Object addAccount(@RequestBody Account account) {
		System.out.println(account);
		return accountService.getAccount(1l);
	}
}
