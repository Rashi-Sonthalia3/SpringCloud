package VO;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;




public class EmployeeVO {
	
	@JsonProperty("id")
	private Long id ;
	
	@NotNull
	@JsonProperty("name")
	private String name;
	
	@NotNull
	@JsonProperty("dept")
	private String department;
	
	@NotNull
	@Min(value = 23, message = "Value should be greater than equal to 23" )
	@Max(value = 65, message = "Value should be greater than equal to 65")
	@JsonProperty("age")
	private String age;
	
	@NotNull
	@Email
	@JsonProperty("email")
	private String email;
	
	
}
