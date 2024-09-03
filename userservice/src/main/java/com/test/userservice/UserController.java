package com.test.userservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserRepo userrepo;
	
	@Autowired
	deptInterfce  deptinterfce;
	
	@RequestMapping(value="/add" ,method = RequestMethod.POST)
	public ResponseEntity<User> saveUser(@RequestBody User user){
		System.out.println(user);
		Dept dept = deptinterfce.getDept(user.getDept()).getBody();
		if(dept.getHeadOfdept()!=null) {
			user.setHOD(dept.getHeadOfdept());
		}
		
		userrepo.save(user);
		return new ResponseEntity<User>(HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value="/get" ,method = RequestMethod.GET)
	public ResponseEntity<List<User>> get(){
		
		List<User> user = userrepo.findAll();
		return new ResponseEntity<List<User>>(user,HttpStatus.OK);
		
	}

}
