package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService es;

	@PostMapping("postEmp")
	public Employee add(@RequestBody Employee e)
	{
		return es.setValues(e);
	}

	@GetMapping("getEmp")
	public List<Employee> disp()
	{
		return es.showValues();
	}

	@GetMapping("/getEmp/{id}")
	public Optional<Employee> display(@PathVariable(value = "id") int id)
	{
		return es.show(id);
	}

}