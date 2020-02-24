package anz.techprogramming.RestAPI.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name="ACCOUNT")
@Data
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="account_number")
    public Long accountNumber;
    
    @Column(name="account_name")
    public String accountName;
    
    @Column(name="account_type")
    public String accountType;
    
    @Column(name="balance_date")
    public String balanceDate;
    
    @Column(name="currency")
    public String currency;
    
    @Column(name="opening_balance")
    public Long openingBalance;
    
    @Column(name="user_id")
    public String userID;
}