package com.springbootrestapi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootrestapi.Model.BankUser;
@Repository
public interface BankUserRepository extends JpaRepository<BankUser,Long>{

}
