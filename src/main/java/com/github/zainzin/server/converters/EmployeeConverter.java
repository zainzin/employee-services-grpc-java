package com.github.zainzin.server.converters;

import com.github.zainzin.messages.Messages;
import com.github.zainzin.server.domain.EmployeeDTO;

public class EmployeeConverter {

    public static EmployeeDTO employeeProtoToEmployeeDTO (Messages.Employee employeeProto) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(employeeProto.getId());
        dto.setBadgeNumber(employeeProto.getBadgeNumber());
        dto.setFirstName(employeeProto.getFirstName());
        dto.setLastName(employeeProto.getLastName());
        dto.setVacationAccrualRate(employeeProto.getVacationAccrualRate());
        dto.setVacationAccrued(employeeProto.getVacationAccrued());
        return dto;
    }

    public static Messages.Employee employeeDTOToEmployeeProto (EmployeeDTO dto) {
        return Messages.Employee
                .newBuilder()
                .setId(dto.getId())
                .setBadgeNumber(dto.getBadgeNumber())
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setVacationAccrualRate(dto.getVacationAccrualRate())
                .setVacationAccrued(dto.getVacationAccrued())
                .build();
    }
}
