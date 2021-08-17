package com.springbootrestapi.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestapi.Model.BankUser;
import com.springbootrestapi.Service.BankUserService;

@RestController
public class BankUserController {
	@Autowired
	private BankUserService bankuserService;

	@GetMapping("/users")
	public ResponseEntity<List<BankUser>> getAllUsers() {
		List<BankUser> bankuser = bankuserService.getAllUsers();
		return new ResponseEntity<>(bankuser,HttpStatus.OK);

	}

	@PostMapping("/users")
	public ResponseEntity<BankUser> addUser(@RequestBody BankUser bankUser) {
		bankuserService.addUser(bankUser);
		return new ResponseEntity<>(bankUser,HttpStatus.OK);
	}

	@DeleteMapping("/users/{userId}")
	public ResponseEntity<String> delete(@PathVariable("userId") long userId) {
		 bankuserService.delete(userId);
		 return new ResponseEntity<>("Id No" +userId+ "Delete successfully",HttpStatus.OK);
		
	}

	@PutMapping("/users")
	public ResponseEntity<BankUser> update(@RequestBody BankUser bankUser) {
		bankuserService.update(bankUser);
		return new ResponseEntity<>(bankUser,HttpStatus.OK);
	}

	@GetMapping("/users/{userId}")
	public ResponseEntity<BankUser> getById(@PathVariable("userId") long userId) {
		BankUser bankuser= bankuserService.getById(userId);
		if(bankuser==null)
		{
			return new ResponseEntity<>(bankuser,HttpStatus.NOT_FOUND);
		}
		else {
		return new ResponseEntity<>(bankuser,HttpStatus.OK);
	}
		
	}
}
