package com.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class PrimaryAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@OneToMany(mappedBy = "primaryAccount", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonIgnore
	private List<PrimaryTransaction> primaryTransactionList;

}
