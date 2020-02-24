package anz.techprogramming.RestAPI.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="ACCOUNT_TRANSACTION")
@Data
public class AccountTransactionEntity {

	@Id
	@Column(name="transaction_id")
	public Long transactionId;
	
    @Column(name="account_number")
    public Long accountNumber;
    
    @Column(name="transaction_date")
    public Date transactionDate;
    
    @Column(name="debit")
    public Long debit;
    
    @Column(name="credit")
    public Long credit;
    
    @Column(name="transaction_narrative")
    public String tranactionNarrative;
    
}
