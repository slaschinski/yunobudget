package net.laschinski.yunobudget.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account_type")
public class AccountType {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idaccount_type")
	private int id;

	@Column(name="label")
	private String label;
	
	@Column(name="description")
	private String description;
	
	public AccountType() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
