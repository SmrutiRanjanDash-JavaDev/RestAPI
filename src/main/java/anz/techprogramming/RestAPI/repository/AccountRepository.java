package anz.techprogramming.RestAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import anz.techprogramming.RestAPI.entity.AccountEntity;

 
@Repository
public interface AccountRepository
        extends JpaRepository<AccountEntity, Long> {
	public List<AccountEntity> findByuserID(String userID);
}
