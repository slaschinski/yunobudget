package net.laschinski.yunobudget.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="account")
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idaccount")
	private int id;
	
	@Column(name="person")
	private Person person;
	
	@Column(name="")
	private AccountType accountType;
	
	@Column(name="label")
	private String label;
	
	@Column(name="note")
	private String note;
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="cachedBalance")
	private double cachedBalance;
	
	@Column(name="verifiedBalance")
	private double verifiedBalance;
	
	@Column(name="verified_balance_time", columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date verifiedBalanceTime;
	
	@Column(name="budgetable")
	private boolean budgetable;
	
	public Account() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getCachedBalance() {
		return cachedBalance;
	}

	public void setCachedBalance(double cachedBalance) {
		this.cachedBalance = cachedBalance;
	}

	public double getVerifiedBalance() {
		return verifiedBalance;
	}

	public void setVerifiedBalance(double verifiedBalance) {
		this.verifiedBalance = verifiedBalance;
	}

	public Date getVerifiedBalanceTime() {
		return verifiedBalanceTime;
	}

	public void setVerifiedBalanceTime(Date verifiedBalanceTime) {
		this.verifiedBalanceTime = verifiedBalanceTime;
	}

	public boolean isBudgetable() {
		return budgetable;
	}

	public void setBudgetable(boolean budgetable) {
		this.budgetable = budgetable;
	}
	
}
