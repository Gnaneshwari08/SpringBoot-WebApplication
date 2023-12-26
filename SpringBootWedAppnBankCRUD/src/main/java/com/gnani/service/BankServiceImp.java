package com.gnani.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gnani.model.Bank;
import com.gnani.model.Bank1;
import com.gnani.repo.BankRepo;
@Service
public class BankServiceImp implements BankService {
	@Autowired
	private BankRepo repo;
	@Override
	public Bank saveBank(Bank bank) {
		// TODO Auto-generated method stub
		int a=1;
		bank.setActive(a);
		return repo.save(bank);
	}

	@Override
	public Bank validateBank(Bank bank) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bank updateDFBank(Bank bank,Bank1 bank1) {
		Optional<Bank> record=repo.findById(bank.getAno());
		if(record.isPresent()) {
		Bank obj1=record.get();
		obj1.setAmt(obj1.getAmt()+bank1.getNamt());
		return repo.save(obj1); 
		}
		else {
			return null;
		}
	}

	@Override
	public Bank updateWFBank(Bank bank,Bank1 bank1) {
		Optional<Bank> record1=repo.findById(bank.getAno());
		if(record1.isPresent()) {
		Bank obj2=record1.get();
		obj2.setAmt(obj2.getAmt()-bank1.getWamt());
		return repo.save(obj2);
		}
		else {
			return null;
		}
	}
	@Override
	public Bank update(Bank bank,Bank1 bank1) {
		Optional<Bank> record2=repo.findById(bank.getAno());
		if(record2.isPresent()) {
		Bank obj=record2.get();
		obj.setAmt(obj.getAmt()-bank1.getTamt());
		repo.save(obj);
		Optional<Bank> record3=repo.findById(bank1.getTano());
		if(record3.isPresent()) {
		Bank obj1=record3.get();
		obj1.setAmt(obj1.getAmt()+bank1.getTamt());
		return repo.save(obj1); 
		}
		else {
			return null;
		}
		}
		else {
			return null;
		}
	}
	@Override
	public Bank updateActive(Bank bank) {
		Optional<Bank> record=repo.findById(bank.getAno());
		//Bank obj1=record.get();
		if(record.isPresent()) {
		//Bank null1=new Bank();
		Bank obj1=record.get();
		int a=obj1.getActive();
		if(a!=1) {
			obj1.setActive(0);
			
		}else {
			obj1.setActive(1);
		}
		return repo.save(obj1);
		}
		else {
			return null;
		}
	}
	
	@Override
	public Bank getBank(int ano) {
		Bank getOne= repo.findById(ano).orElse(null);
		return getOne;
	}

	@Override
	public List<Bank> getAllBank() {
		List<Bank> bankList=(List<Bank>) repo.findAll();
		return bankList;
	}

}
