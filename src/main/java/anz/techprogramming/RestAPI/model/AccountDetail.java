package anz.techprogramming.RestAPI.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountDetail {

    private Long accountNumber;
    private String accountName;  
    private String accountType;
    private String balanceDate;
    private String currency;
    private Long openingAvailableBalance;
}
