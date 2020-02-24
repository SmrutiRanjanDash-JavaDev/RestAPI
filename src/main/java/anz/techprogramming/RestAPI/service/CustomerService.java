package anz.techprogramming.RestAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import anz.techprogramming.RestAPI.entity.AccountEntity;
import anz.techprogramming.RestAPI.entity.AccountTransactionEntity;
import anz.techprogramming.RestAPI.mapper.AccountMapper;
import anz.techprogramming.RestAPI.mapper.AccountTransactionMapper;
import anz.techprogramming.RestAPI.model.AccountDetail;
import anz.techprogramming.RestAPI.model.AccountTransactionDetail;
import anz.techprogramming.RestAPI.repository.AccountRepository;
import anz.techprogramming.RestAPI.repository.AccountTransactionRepository;

@Service
public class CustomerService {
    @Autowired
    AccountRepository accountRepository;
    
    @Autowired
    AccountTransactionRepository accountTransactionRepository;
    public List<AccountDetail> getAccountDetails(String userid)
    {
        List<AccountEntity> accountEntity = accountRepository.findByuserID(userid);
        return AccountMapper.convert(accountEntity);
    }
    
    public AccountTransactionDetail getAccountTransactionDetails(Long accountNumber)
    {
    	Optional<AccountEntity> accountEntity = accountRepository.findById(accountNumber);
        
        if(!accountEntity.isPresent()) {
            return null;
        }
        List<AccountTransactionEntity> accountTransactionEntities = accountTransactionRepository.findByaccountNumber(accountNumber);
        return AccountTransactionMapper.convert(accountEntity.get(), accountTransactionEntities);
    }
}
