package anz.techprogramming.RestAPI.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import anz.techprogramming.RestAPI.entity.AccountTransactionEntity;

@Repository
public interface AccountTransactionRepository
        extends JpaRepository<AccountTransactionEntity, Long> {

	public List<AccountTransactionEntity> findByaccountNumber(long accountNumber);
}
