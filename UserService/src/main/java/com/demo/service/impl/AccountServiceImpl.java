package com.demo.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.AccountDao;
import com.demo.pojo.Account;
import com.demo.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountDao accountDao;

	@Override
	public Account getAccount(Long id) {
		if(id==2) {
			try {
				Thread.sleep(new Random().nextInt(2000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return accountDao.findById(id).get();
	}
	
	
}
