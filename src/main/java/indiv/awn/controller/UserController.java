package indiv.awn.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indiv.awn.po.User;
import indiv.awn.service.inf.IUserService;

@RequestMapping("/user")
@RestController
public class UserController {
	
	public static Logger log = LogManager.getLogger(UserController.class);
	@Autowired
	IUserService userService;
	
	@RequestMapping("/load/{id}")
	public User findById(@PathVariable (value= "id" )int id) {
		double sum=0.0;
		for(int i=0;i<1000000000;i++) {
			sum+=Math.random()*i;
		}
		System.out.println(sum);
		return userService.findById(id);
	}
}
