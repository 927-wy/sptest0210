package sptest0210Cmd;

/*public class WebMVCTController {

}*/

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
public class LoginController implements Controller {
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		ModelAndView mvi = new ModelAndView();
		
		mvi.addObject("message", "Hello Wor!");
		
		mvi.setViewName("login");
		String test = req.getParameter("username");
		mvi.addObject("userName",test);
		//String test = req.getParameter("test");
		//System.out.println(test);
		//resp.getWriter().write(test);
		//
		//System.out.println(test);
		return mvi;
		
	}
	
}

