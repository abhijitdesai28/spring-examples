package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subject;

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
	public Subject createSubObj() {
		Subject sub=new Subject();
		List <String> subject_list=new ArrayList();
		subject_list.add("java");
		subject_list.add("python");
		subject_list.add("c++");
		subject_list.add("sql");
		sub.setSubjects(subject_list);
		return sub;
		
	}
	@Bean
	public Student createStudObj() {
		Student std=new Student();
		std.setName("sandip");
		std.setRollNo(101);
		std.setEmail("sandy1@gmail.com");
		//std.setAddress(createAddObj());// manually DI
		//std.setSubject(createSubObj());//manually DI
		
		return std;
		
	}

}
