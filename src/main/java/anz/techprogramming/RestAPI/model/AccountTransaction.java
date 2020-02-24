package anz.techprogramming.RestAPI.model;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountTransaction {

	private Date transactionDate;
	private long debit;
	private long credit;
	private String debitOrCredit;
	private String tranactionNarrative;

}
