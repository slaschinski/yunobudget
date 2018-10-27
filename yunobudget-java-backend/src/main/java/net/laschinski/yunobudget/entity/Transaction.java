package net.laschinski.yunobudget.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idtransaction")
	private int id;
	
	@Column(name="idaccount_from")
	private Account accountFrom;
	
	@Column(name="idaccount_to")
	private Account accountTo;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="time_booking_from")
	private Date timeBookingFrom;
	
	@Column(name="time_booking_to")
	private Date timeBookingTo;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="budget_category")
	private BudgetCategory budgetCategory;
	
	@Column(name="description")
	private String description;
	
	@Column(name="note")
	private String note;
	
	@Column(name="idtransaction_combined")
	private TransactionCombined transactionCombined;
	
	@Column(name="accepted_by_recipient")
	private boolean acceptedByRecipient;
	
	public Transaction() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Account getAccountFrom() {
		return accountFrom;
	}

	public void setAccountFrom(Account accountFrom) {
		this.accountFrom = accountFrom;
	}

	public Account getAccountTo() {
		return accountTo;
	}

	public void setAccountTo(Account accountTo) {
		this.accountTo = accountTo;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getTimeBookingFrom() {
		return timeBookingFrom;
	}

	public void setTimeBookingFrom(Date timeBookingFrom) {
		this.timeBookingFrom = timeBookingFrom;
	}

	public Date getTimeBookingTo() {
		return timeBookingTo;
	}

	public void setTimeBookingTo(Date timeBookingTo) {
		this.timeBookingTo = timeBookingTo;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public BudgetCategory getBudgetCategory() {
		return budgetCategory;
	}

	public void setBudgetCategory(BudgetCategory budgetCategory) {
		this.budgetCategory = budgetCategory;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public TransactionCombined getTransactionCombined() {
		return transactionCombined;
	}

	public void setTransactionCombined(TransactionCombined transactionCombined) {
		this.transactionCombined = transactionCombined;
	}

	public boolean isAcceptedByRecipient() {
		return acceptedByRecipient;
	}

	public void setAcceptedByRecipient(boolean acceptedByRecipient) {
		this.acceptedByRecipient = acceptedByRecipient;
	}
	
}
