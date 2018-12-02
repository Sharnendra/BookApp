package com.rcm.SpringBootWebApplication.controllers;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rcm.SpringBootWebApplication.data.EmployeeRepository;
import com.rcm.SpringBootWebApplication.model.Employee;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeData;
	private static final Logger LOGGER = LogManager.getLogger(EmployeeController.class);

	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
	public String newEmployee(Employee employee) {
		LOGGER.info("Info level log message");
		employeeData.save(employee);
		return ("redirect:/listEmployees.html");

	}

	@RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		//Employee emp = new Employee();
		//return new ModelAndView("newEmployee", "form", emp);
		return new ModelAndView("index");
	}

	@RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Employee> allEmployees = employeeData.findAll();
		return new ModelAndView("allEmployees", "employees", allEmployees);

	}

}
