package in.pwskills.akash.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import in.pwskills.akash.bean.Employee;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
 
	/***
	 * 1. METHOD TYPE :: GET
	 * 2. INPUT       :: Model
	 * 3. PATH        :: /user
	 * 4. R.T         :: UserData
	 * 
	 */
	@GetMapping(value="/user")
	public String saveFormData(Model model) {
		model.addAttribute("user", "akash");
		model.addAttribute("addr","bihar");
		
		return "UserData";
	}
	
	/***
	 * 1. METHOD TYPE :: GET
	 * 2. INPUT       :: Model
	 * 3. PATH        :: /list
	 * 4. R.T         :: EmployeeData
	 * 
	 */
	@GetMapping(value="/list")
	public String showEmployeeData(Model model) {
		model.addAttribute("employee", new Employee(19, "dravid",25000.0));
		
		model.addAttribute("list",
					List.of(new Employee(10,"sachin",3500.0),
							new Employee(7,"dhoni",2800.0),
							new Employee(18,"kohli",3000.0)
							)
						);
		return "EmployeeData";
	}
	
}
