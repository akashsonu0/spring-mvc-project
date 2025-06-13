package in.pwskills.akash.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pwskills.akash.model.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
}
