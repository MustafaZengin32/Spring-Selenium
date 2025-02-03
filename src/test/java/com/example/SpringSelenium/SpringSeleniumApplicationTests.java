package com.example.SpringSelenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Autowired
	private User user;

	@Autowired
	private Faker faker;

	@Value("PATH") //Bu sekilde direk icinde yazani verir String , int ...
	private String path;

	@Value("${fruits}") //Bu sekilde ise app prop icinde veri arar.
	private String fruits;//value da ki deger app.prop icinde

	@Value("${fruits}")
	private List<String> fruitss;

	@Value("${timeout}")
	private int timeout;

	@Value("${myusername}")
	private String myusername;

	@Value("${TEST_URL:https://www.google.com}") //default veri , eger app pro de yoksa bunu verir
	private String road;


	@Test
	void contextLoads() {
		/*
		user.printDetails();
		System.out.println(this.path);//PATH
		System.out.println(this.fruits);
		System.out.println(this.fruitss.size());
		System.out.println(this.timeout);
		System.out.println(this.myusername);
		System.out.println(this.road);
		this.user.printDetails();

		 */

		//Faker faker=new Faker();Bu sekilde biz urettik, bunu Autowired ile de yapabiliriz.

		System.out.println(this.faker.name().firstName());




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

		/*
		Salary (@Component)
		Adress (Component)   -->User (Component)<--Test Class(Autowired)
		 */

		/*
		@Value

		primitive
		properties
		env variables
		url
		array
		file-path
		default values
		 */

		/*
		Autowired Obj From external Libraries




		 */

	}

}
