package anz.techprogramming.RestAPI.model;

import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountTransactionDetail {

	private AccountDetail accountDetail;
	private List<AccountTransaction> accountTransaction;

}
