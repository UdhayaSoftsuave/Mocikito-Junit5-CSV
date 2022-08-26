package com.example.logger;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	public static String s = "Tested successfully";
	
	@GetMapping(value = "path")
	public void  printlogger() {
		String value = "hello";
		
		logger.info("Hello world");
		logger.info("Hello world");
		logger.info("Hello world");
		logger.info("Hello world");
		logger.info("Hello world");
		
	}
	
	public String  hello() {
		return s;

	}


}
