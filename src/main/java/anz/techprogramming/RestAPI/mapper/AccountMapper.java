package anz.techprogramming.RestAPI.mapper;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import anz.techprogramming.RestAPI.entity.AccountEntity;
import anz.techprogramming.RestAPI.model.AccountDetail;


@Component
public class AccountMapper {

	public static List<AccountDetail> convert(List<AccountEntity> accountEntity) {
		List<AccountDetail> accountDetails = new ArrayList<AccountDetail>();
		for(AccountEntity accent : accountEntity) {
			accountDetails.add(AccountDetail.builder().accountNumber(accent.getAccountNumber()).accountName(accent.getAccountName()).accountType(accent.getAccountType())
					.balanceDate(accent.getBalanceDate()).currency(accent.getCurrency()).openingAvailableBalance(accent.getOpeningBalance()).build());
		}
		return accountDetails;
	}
}
