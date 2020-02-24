INSERT INTO 
	ACCOUNT (account_number, account_name, account_type,balance_date,currency,opening_balance,user_id) 
VALUES
  	('11111111', 'Acct1', 'Saving Account','2020-02-24','INR','30000','Smruti'),
  	('11111112', 'Acct2', 'Current Account','2020-02-24','INR','40000','Ranjan'),
  	('11111113', 'Acct3', 'Saving Account','2020-02-24','INR','50000','Smruti'),
  	('11111114', 'Acct4', 'Current account','2020-02-24','INR','60000','Ranjan');
  	
INSERT INTO 
	ACCOUNT_TRANSACTION (account_number,transaction_date,debit,credit,transaction_narrative) 
VALUES
  	('11111111', '2020-02-24', '1000','0','Tesco'),
  	('11111111', '2020-02-23', '0','3000','Amazon refund'),
  	('11111111', '2020-01-24', '0','3000','Amazon refund'),
  	('11111112', '2020-01-23', '0','4444','Amazon refund'),
  	('11111112', '2020-01-24', '0','3000','Amazon Refund');