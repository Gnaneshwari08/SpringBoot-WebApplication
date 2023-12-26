package com.gnani.service;

import java.util.List;



import com.gnani.model.Bank;
import com.gnani.model.Bank1;

public interface BankService {
	public Bank saveBank(Bank bank);
	public Bank validateBank(Bank bank);
	public Bank updateDFBank(Bank bank,Bank1 bank1);
	public Bank updateWFBank(Bank bank,Bank1 bank1);
	public Bank update(Bank bank,Bank1 bank1);
	public Bank updateActive(Bank bank);
	public Bank getBank(int ano);
	public List<Bank> getAllBank();

}
