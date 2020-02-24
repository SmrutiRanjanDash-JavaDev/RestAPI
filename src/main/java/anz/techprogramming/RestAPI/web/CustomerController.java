package anz.techprogramming.RestAPI.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import anz.techprogramming.RestAPI.exception.RecordNotFoundException;
import anz.techprogramming.RestAPI.model.AccountDetail;
import anz.techprogramming.RestAPI.model.AccountTransactionDetail;
import anz.techprogramming.RestAPI.service.CustomerService;

 
@RestController
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    CustomerService customerService;
 
    @GetMapping("/accountDetail/{userid}")
    public ResponseEntity<List<AccountDetail>> getAccountDetail(@PathVariable("userid") String userid)
                                                    throws RecordNotFoundException {
    	List<AccountDetail> accountDetail = customerService.getAccountDetails(userid);
 
        return new ResponseEntity<List<AccountDetail>>(accountDetail, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/accountTransactionDetail/{accountnumber}")
    public ResponseEntity<AccountTransactionDetail> getTransactionDetails(@PathVariable("accountnumber") Long accountnumber)
                                                    throws RecordNotFoundException {
        AccountTransactionDetail accountTransactionDetail = customerService.getAccountTransactionDetails(accountnumber);
 
        return new ResponseEntity<AccountTransactionDetail>(accountTransactionDetail, new HttpHeaders(), HttpStatus.OK);
    }
 
}
