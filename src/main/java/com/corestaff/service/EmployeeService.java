package com.corestaff.service;

import com.corestaff.model.Employee;
import com.corestaff.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {


    private final EmployeeRepository employeeRepository;

    @CacheEvict(value = "employees", allEntries = true)
    public Employee create(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Cacheable("employees")
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    public Employee getById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
