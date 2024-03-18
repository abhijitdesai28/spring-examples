package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId1() {
		Student std= new Student();
		std.setName("sham");
		std.setRollNo(103);
		std.setEmail("sham12@gmail.com");
		
		return std;
	}
	
	@Bean("stdObj")
	public Student stdId2() {
		Student std= new Student();
		std.setName("dip");
		std.setRollNo(104);
		std.setEmail("dip12@gmail.com");
		
		return std;
	}

}
