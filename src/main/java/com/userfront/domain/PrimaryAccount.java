package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class PrimaryAccount {

	private Long id;
	private int accountNumer;
	private BigDecimal accountBalance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumer() {
		return accountNumer;
	}

	public void setAccountNumer(int accountNumer) {
		this.accountNumer = accountNumer;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}

	private List<PrimaryTransaction> primaryTransactionList;

}
