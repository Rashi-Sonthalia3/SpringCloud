package com.employee.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapper;

//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;

import com.employee.model.Employee;

import VO.EmployeeVO;


/**
 * @author rsonthal
 *
 */

public interface EmployeeMapper {
	
	
	  EmployeeMapper INSTANCE = Mappers.getMapper( EmployeeMapper.class );
	  
	  @Mapping(source = "dept", target = "department") EmployeeVO
	  employeeToemployeeDto(Employee employee);
	 

}
