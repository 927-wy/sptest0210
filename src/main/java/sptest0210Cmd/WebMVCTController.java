package sptest0210Cmd;

/*public class WebMVCTController {

}*/

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class WebMVCTController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		ModelAndView mvi = new ModelAndView();
		
		mvi.addObject("message", "Hello Wor!");
		
		mvi.setViewName("business");
		
		//String test = req.getParameter("test");
		//System.out.println(test);
		//resp.getWriter().write(test);
		String test = req.getParameter("username");
		System.out.println(test);
		mvi.addObject("userName",test);
		return mvi;
		
	}
	
}

