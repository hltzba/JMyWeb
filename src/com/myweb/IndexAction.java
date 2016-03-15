package com.myweb;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class IndexAction implements Controller {

	public String view;
	public String getView() {
		return view;
	}
	public void setView(String view) {
		this.view = view;
	}
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv=new ModelAndView(view);
		mv.addObject("Hello","ÄãºÃ");		
		mv.addObject("username","Jimmy Wang");
		return mv;
	}
	
}
