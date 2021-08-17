package com.springbootrestapi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrestapi.Model.BankUser;
import com.springbootrestapi.Repository.BankUserRepository;

@Service
public class BankUserServiceImpl implements BankUserService {

	@Autowired
	private BankUserRepository bankUserRepository;

	@Override
	public List<BankUser> getAllUsers() {
		// TODO Auto-generated method stub
		//List<BankUser> user = new ArrayList<BankUser>();
		return bankUserRepository.findAll();
	}

	@Override
	public BankUser addUser(BankUser bankUser) {
		// TODO Auto-generated method stub
		
		return bankUserRepository.save(bankUser);
		

	}

	@Override
	public void delete(long userId) {
		// TODO Auto-generated method stub
		bankUserRepository.deleteById(userId);
	}

	@Override
	public BankUser update(BankUser bankUser) {
		// TODO Auto-generated method stub
		return bankUserRepository.save(bankUser);
	}

	@Override
	public BankUser getById(long userId) {
		// TODO Auto-generated method stub
	BankUser bankUser=null;
		try {
		 bankUser= bankUserRepository.findById(userId).get();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return bankUser;
	}

}
