package com.gnani.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gnani.model.Bank;
import com.gnani.model.Bank1;
import com.gnani.service.BankService;
@Controller
public class BankController {
@Autowired
private BankService service;
@RequestMapping("/")
public String homePage() {
	return "home";
}
@RequestMapping("/account")
public String studentForm() {
	return "account";
}
@RequestMapping("/register")
public String saveUser(Bank bank) {
	service.saveBank(bank);
	return "success";
}
@RequestMapping("/balance")
public String balanceForm() {
	return "balance";
}
@RequestMapping("/acbal")
public String getone(ModelMap model,int ano) {
	model.put("banks",service.getBank(ano));
	return "viewaccount";
	
}
@RequestMapping("/deposite")
public String depositeForm() {
	
	return "deposite";
}
@RequestMapping("/dep")
public String updateDacc(ModelMap model,Bank bank,Bank1 bank1) {
	model.put("banks", service.updateDFBank(bank,bank1));
	return "msg1";
}
@RequestMapping("/withdraw")
public String withdrawForm() {
	
	return "withdraw";
}
@RequestMapping("/with")
public String updateWacc(ModelMap model,Bank bank,Bank1 bank1) {
	model.put("banks1", service.updateWFBank(bank,bank1));
	return "msg2";
}
@RequestMapping("/transfer")
public String transferForm() {
	
	return "transfer";
}
@RequestMapping("/trans")
public String updateTras(ModelMap model,Bank bank,Bank1 bank1) {
	model.put("banks", service.update(bank,bank1));
	return "msg3";
}
@RequestMapping("/close")
public String closeForm() {
	return "close";
}
@RequestMapping("/closeac")
public String updateClose(ModelMap model,Bank bank) {
	model.put("banks",service.updateActive(bank));
	return "msg4";
}
}
