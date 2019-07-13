package com.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.pojo.Account;

public interface AccountDao extends CrudRepository<Account, Long>{

}
