package net.laschinski.yunobudget.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="budget_category")
public class BudgetCategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idbudget_category")
	private int id;
	
	@Column(name="idbudget_super_category")
	private BudgetSuperCategory budgetSuperCategory;
	
	@Column(name="label")
	private String label;
	
	@Column(name="note")
	private String note;
	
	public BudgetCategory() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BudgetSuperCategory getBudgetSuperCategory() {
		return budgetSuperCategory;
	}

	public void setBudgetSuperCategory(BudgetSuperCategory budgetSuperCategory) {
		this.budgetSuperCategory = budgetSuperCategory;
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
	
}
