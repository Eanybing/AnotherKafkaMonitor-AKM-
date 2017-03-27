package cc.triffic.wc.kafkamonitor.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Error Controller class
 * @author lajor
 *
 */
@Controller
@RequestMapping({ "/errors" })
public class ErrorPageController {
	@RequestMapping(value = { "/404" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView e404(HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/error/404");
		return mav;
	}

	@RequestMapping(value = { "/405" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView e405(HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/error/405");
		return mav;
	}

	@RequestMapping(value = { "/500" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView e500(HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/error/500");
		return mav;
	}

	@RequestMapping(value = { "/503" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView e503(HttpServletResponse response) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/error/503");
		return mav;
	}
}