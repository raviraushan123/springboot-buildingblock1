package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
	//simple method
	//url /helloworld
	//get
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld()
	{
	return "Hello  World";
	}
	@GetMapping("/helloworld-bean")
	public UsersDetails HelloWorldBean()
	{
		return new UsersDetails("RAVI", "RAUSHAN", "MUZ");
	}

}

