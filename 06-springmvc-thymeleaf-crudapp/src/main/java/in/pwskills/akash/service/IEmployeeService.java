package in.pwskills.akash.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import in.pwskills.akash.model.Employee;

public interface IEmployeeService {
	
	// save the record
	void saveRecord(Employee employee);
	
	// display the records 
	Page<Employee> displayAllRecords(Pageable pageable);
	
	// delete the records
	void deleteRecord(Integer eid);
	
	//get the records
	Employee findEmployee(Integer eid);

}
