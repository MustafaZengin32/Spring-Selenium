package com.example.SpringSelenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;
	@Test
	void contextLoads() {
		user.printDetails();


		/*
		Adress address = new Adress();
		Salary salary=new Salary();


		User user=new User(address,salary);
		user.printDetails();
		 */

		/*
		Autowired sayesinde Spring Boot senin yerine yukaridaki objeleri olusturur.
		Bunun icinde class larda Component Anotation i olmalidir.
		Spring, @Component ile işaretlenmiş sınıfları otomatik olarak algılar ve bir bean olarak yönetir.
		@Autowired, bir sınıfın başka bir sınıfa bağımlı olduğu durumlarda, Spring'in bu bağımlılığı otomatik olarak enjekte etmesini sağlar.
        Spring, uygun bean'i (nesneyi) bulur ve enjekte eder.
		 */


	}

}
