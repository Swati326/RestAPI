package com.springbootrestapi.Service;

import java.util.List;

import com.springbootrestapi.Model.BankUser;

public interface BankUserService {
	
	public List<BankUser> getAllUsers();

	public BankUser addUser(BankUser bankUser);

	public void delete(long userId);

	public BankUser update(BankUser bankUser);

	public BankUser getById(long userId);
}
