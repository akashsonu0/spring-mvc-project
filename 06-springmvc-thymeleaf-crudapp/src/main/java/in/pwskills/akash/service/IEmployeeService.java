package in.pwskills.akash.service;

import java.util.List;

import in.pwskills.akash.model.Employee;

public interface IEmployeeService {
	
	// save the record
	void saveRecord(Employee employee);
	
	// display the records 
	List<Employee> displayAllRecords();
	
	// delete the records
	void deleteRecord(Integer eid);
	
	//get the records
	Employee findEmployee(Integer eid);

}
