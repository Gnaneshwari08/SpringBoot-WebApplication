package com.gnani.repo;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.gnani.model.Bank;
@Repository
public interface BankRepo extends CrudRepository<Bank, Integer> {
	

}
