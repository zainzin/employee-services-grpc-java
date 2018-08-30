package com.github.zainzin.server.repository;


import com.github.zainzin.messages.Messages;
import com.github.zainzin.server.converters.EmployeeConverter;
import com.github.zainzin.server.domain.EmployeeDTO;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    private final String EMPLOYEE_TABLE_NAME = "EmployeeDTO";
    @SuppressWarnings("unchecked")
    public List<Messages.Employee> getAllEmployees() {
        System.out.println("-- loading persons --");
        List<Messages.Employee> employees = new ArrayList<>();
        Session session = HibernateUtility.getSessionFactory().openSession();
        List<EmployeeDTO> persons = session.createQuery("FROM " + EMPLOYEE_TABLE_NAME).list();
        persons.forEach((x) -> employees.add(EmployeeConverter.employeeDTOToEmployeeProto(x)));
        session.close();
        return employees;
    }

    public void saveEmployee(Messages.Employee employee) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(EmployeeConverter.employeeProtoToEmployeeDTO(employee));
        System.out.println(employee);
        session.getTransaction().commit();
    }

    public Messages.Employee getEmployeeByBadge(int badgeNumber) {
        Session session = HibernateUtility.getSessionFactory().openSession();
        session.beginTransaction();
        EmployeeDTO employeeDTO = session.createQuery("FROM " + EMPLOYEE_TABLE_NAME + " WHERE BADGENUMBER = :badgeNumber", EmployeeDTO.class)
                .setParameter("badgeNumber", badgeNumber).getSingleResult();
        return EmployeeConverter.employeeDTOToEmployeeProto(employeeDTO);
    }
}
