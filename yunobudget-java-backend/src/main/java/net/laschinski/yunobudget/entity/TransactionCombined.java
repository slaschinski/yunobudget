package net.laschinski.yunobudget.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_combined")
public class TransactionCombined {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idtransaction_combined")
	private int id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="note")
	private String note;
	
	public TransactionCombined() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
}
