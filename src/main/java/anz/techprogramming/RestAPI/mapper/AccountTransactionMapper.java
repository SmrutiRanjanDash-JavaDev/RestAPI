package anz.techprogramming.RestAPI.mapper;

import java.util.ArrayList;
import java.util.List;
import anz.techprogramming.RestAPI.entity.AccountEntity;
import anz.techprogramming.RestAPI.entity.AccountTransactionEntity;
import anz.techprogramming.RestAPI.model.AccountDetail;
import anz.techprogramming.RestAPI.model.AccountTransaction;
import anz.techprogramming.RestAPI.model.AccountTransactionDetail;


public class AccountTransactionMapper {

	public static AccountTransactionDetail convert(AccountEntity accountEntity,
			List<AccountTransactionEntity> accountTransactionEntitys) {
		List<AccountTransaction> accountTransactions = new ArrayList<AccountTransaction>();
		for (AccountTransactionEntity accountTransactionEntity : accountTransactionEntitys) {
			accountTransactions
					.add(AccountTransaction.builder().transactionDate(accountTransactionEntity.getTransactionDate())
							.debit(accountTransactionEntity.getDebit()).credit(accountTransactionEntity.getCredit())
							.debitOrCredit(accountTransactionEntity.getDebit() > 0 ? "Debit" : "Credit")
							.tranactionNarrative(accountTransactionEntity.getTranactionNarrative()).build());
		}
		AccountTransaction.builder().build();
		return AccountTransactionDetail.builder()
				.accountDetail(AccountDetail.builder().accountNumber(accountEntity.getAccountNumber())
						.accountName(accountEntity.getAccountName())
						.accountType(accountEntity.getAccountType()).balanceDate(accountEntity.getBalanceDate())
						.currency(accountEntity.getCurrency()).build())
				.accountTransaction(accountTransactions).build();
	}

}
