package in.pwskills.akash.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pwskills.akash.exception.EmployeeNotFoundException;
import in.pwskills.akash.model.Employee;
import in.pwskills.akash.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeRepository repo;
	
	@Override
	public void saveRecord(Employee employee) {
		repo.save(employee);

	}

	@Override
	public List<Employee> displayAllRecords() {
		return repo.findAllByOrderByLastNameAsc();
	}

	@Override
	public void deleteRecord(Integer eid) {
		repo.delete(repo.findById(eid).orElseThrow(
				()->new EmployeeNotFoundException("record not found for deletion")));
		
	}

	@Override
	public Employee findEmployee(Integer eid) {
		return repo.findById(eid).get();
	}

}

