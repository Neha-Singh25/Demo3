package in.sp.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;
import in.sp.beans.Subjects;

@Configuration
public class SpringConfigFile 
{
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		
		addr.setHouseno(1001);
		addr.setCity("Delhi");
		addr.setPincode(251001);
		
		return addr;
	}
	@Bean
	public Subjects createSubObj() {
		Subjects subj = new Subjects();
		List<String> subjects_list = new ArrayList<String>();
		subjects_list.add("java");
		subjects_list.add("python");
		subjects_list.add("c++");
		
		subj.setSubjects(subjects_list);
		return subj;
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(25);
		std.setName("mini");
//		std.setAddress(createAddrObj());
//		std.setSubjects(createSubObj());
		return std;
	}
}
