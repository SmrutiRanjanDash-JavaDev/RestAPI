DROP TABLE IF EXISTS ACCOUNT;

CREATE TABLE ACCOUNT (
  account_number INT AUTO_INCREMENT  PRIMARY KEY,
  account_name VARCHAR(250) NOT NULL,
  account_type VARCHAR(250) NOT NULL,
  balance_date date NOT NULL,
  opening_balance VARCHAR(250) DEFAULT NULL,
  currency VARCHAR(3) DEFAULT NULL,
  user_id VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS ACCOUNT_TRANSACTION;

CREATE TABLE ACCOUNT_TRANSACTION (
  transaction_id INT AUTO_INCREMENT  PRIMARY KEY,
  account_number INT,
  transaction_date date NOT NULL,
  debit double NOT NULL,
  credit double NOT NULL,
  transaction_narrative VARCHAR(200) DEFAULT NULL,
  
  CONSTRAINT FK_ACC_NUM FOREIGN KEY (account_number) REFERENCES ACCOUNT(account_number)
);