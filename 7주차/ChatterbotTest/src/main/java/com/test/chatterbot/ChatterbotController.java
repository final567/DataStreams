package com.test.chatterbot;

import javax.servlet.http.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;



public class ChatterbotController implements Controller {

	@RequestMapping("/test")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO �ڵ� ������ �޼ҵ� ����

		
		ModelAndView mav = new ModelAndView("WindowTest");
        //mav.addObject("", null);
        return mav;
	}

}
