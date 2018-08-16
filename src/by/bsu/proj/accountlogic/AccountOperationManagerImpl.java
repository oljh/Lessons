package by.bsu.proj.accountlogic;

import by.bsu.proj.annotation.BankingAnnotation;
import by.bsu.proj.annotation.SecurityLevelEnum;

public class AccountOperationManagerImpl {
	@BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
	public double depositInCash(int accountNumber, int amount) {
		return 0;
	}
	
	@BankingAnnotation(securityLevel = SecurityLevelEnum.HIGH)
	public boolean withdraw(int accountNumber, int amount) {
		//снятие суммы если величина не превышает остаток
		 return true;
	}
	
	@BankingAnnotation(securityLevel = SecurityLevelEnum.LOW)
	public boolean convert (double amount) {
	//конвертировать сумму
	return true;
	}
	
	@BankingAnnotation
	public boolean transfer(int accountNunmber, double amounnt) {
		//первести сумму на счёт
		return true;
	}
}
