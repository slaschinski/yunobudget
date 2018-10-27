package net.laschinski.yunobudget.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="budget_entry")
public class BudgetEntry {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idbudget_entry")
	private int id;
	
	@Column(name="idbudget_category")
	private BudgetCategory budgetCategory;
	
	@Column(name="time")
	private Date time;
	
	@Column(name="amount")
	private double amount;
	
	public BudgetEntry() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BudgetCategory getBudgetCategory() {
		return budgetCategory;
	}

	public void setBudgetCategory(BudgetCategory budgetCategory) {
		this.budgetCategory = budgetCategory;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
