package kr.co.jkonury.test.controller;

import java.util.List;

import kr.co.jkonury.test.model.Test;
import kr.co.jkonury.test.service.TestService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	TestService testService;
	
	
	@RequestMapping("/list")
	public ModelAndView list(ModelAndView mav){
		
		try {
			List<Test> test = testService.getAll();
			System.out.println(test);
			logger.info(test.toString());
			logger.debug(test.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return mav;
	}
	
	@RequestMapping("/insert")
	public String insert(){
		Test test = new Test(0, "제목입력", "내용 ㅋ", null, null, null, 0);
		
		try {
			testService.insert(test);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/test/list";
	}
}
