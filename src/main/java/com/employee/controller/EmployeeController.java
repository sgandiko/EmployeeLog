package com.employee.controller;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee.dto.EmployeeClockInClockOutDTO;
import com.employee.dto.EmployeeDTO;
import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Customer;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;
import com.employee.service.EmployeeService;

@Controller
@RequestMapping("/employee")
@PropertySource(value = { "classpath:log4j.properties" })
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	final static Logger logger = Logger.getLogger(EmployeeController.class);
	
	
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String listEmployees(Model model) {
		logger.info("Entering listEmployees method");
		//get the customers from the service
		List<EmployeeDTO> empList =  employeeService.getEmployees();
		
		// add the customers to the model
		model.addAttribute("employee", empList);
		logger.info("Exiting listEmployees method ");
		return "list-employees";
	}
	
	@RequestMapping(value="/showFormForAdd",method=RequestMethod.GET)
	public String showEmployeeForm(Model model) {
		logger.info("Entering showEmployeeForm method ");
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		logger.info("Exiting showEmployeeForm method ");
		return "employee-form";
	}
	
	@RequestMapping(value="/showFormForEmployeeLog",method=RequestMethod.GET)
	public String showEmployeeLogForm(Model model) {
		logger.info("Entering showEmployeeLogForm method ");
		List<EmployeeDTO> empList =  employeeService.getEmployees();
		
		model.addAttribute("employees",empList);
		logger.info("Entering showEmployeeLogForm method ");
		return "employee-log";
	}
	
	@RequestMapping(value="/searchEmployeeForm",method=RequestMethod.GET)
	public String searchEmployeeForm(Model model) {
		logger.info("Entering searchEmployeeForm method ");
		Employee emp = new Employee();
		model.addAttribute("employee",emp);
		logger.info("Exiting searchEmployeeForm method ");
		return "searchemployee-form";
	}
	
	@RequestMapping(value="/saveEmployee",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		logger.info("Entering saveEmployee method ");
		employeeService.saveEmployee(employee);
		logger.info("Exiting saveEmployee method ");
		return "redirect:/employee/list";
	}
	
	@RequestMapping(value="/saveEmployeelog",method=RequestMethod.POST)
	public String saveEmployeeLog(@ModelAttribute("employeeLog") List<EmployeeClockInClockOutDTO> employeeLogs) {
		logger.info("Entering saveEmployeeLog method ");
		employeeService.saveEmployeeLogs(employeeLogs);
		logger.info("Exiting saveEmployeeLog method ");
		return "redirect:/employee/list";
	}
	
	@RequestMapping(value="/loglist",method=RequestMethod.GET)
	public String listEmployeesLog(Model model) {
		logger.info("Entering listEmployeesLog method");
		List<EmployeeLogDTO> employeeLogList =  employeeService.getEmployeesLog();
		
		// add the customers to the model
		model.addAttribute("employeeLog", employeeLogList);
		logger.info("Exiting listEmployeesLog method ");
		return "list-employeeLogs";
	}
	
	
	@RequestMapping(value="/employee/{empId}",method=RequestMethod.GET)
	public String getEmployee(@RequestParam("employeeId") int employeeId) {
		employeeService.getEmployee(employeeId);
		return "redirect:/employee/list";
	}
	
	@GetMapping("/delete")
	public String deleteCustomer(@RequestParam("customerId") int custid) {
		employeeService.deleteCustomer(custid);
		return "redirect:/employee/list";
	}
	
	@RequestMapping(value="/search",method=RequestMethod.POST)
    public String searchEmployee(@RequestParam("theSearchName") String theSearchName,
                                    Model theModel) {
        // search customers from the service
        List<EmployeeDTO> employee = employeeService.searchEmployee(theSearchName);
        // add the customers to the model
        theModel.addAttribute("employee", employee);
        return "list-employees";        
    }
	/*@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@ModelAttribute("employeeId") int employeeId, Model model) {
		Customer updatedEmployee = employeeService.getCustomer(employeeId);
		model = model.addAttribute("employee",updatedEmployee) ;
		return "employee-form";
	}*/
	
}
