package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddObj() {
		Address addr =new Address();
		
		addr.setCity("pune");
		addr.setPincode(411007);
		return addr;
	}
	@Bean
	public Student createStudObj() {
		Student std=new Student();
		std.setName("sandip");
		std.setRollNo(101);
		std.setEmail("sandy1@gmail.com");
		//std.setAddress(createAddObj());// manually DI
		
		return std;
		
	}

}
