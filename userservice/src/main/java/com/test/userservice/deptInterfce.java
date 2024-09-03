package com.test.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "deptservice", url = "http://localhost:8080/")
public interface deptInterfce {

	@RequestMapping(value = "/getdept", method = RequestMethod.GET)
	public ResponseEntity<Dept> getDept(@RequestParam String deptname);

}
