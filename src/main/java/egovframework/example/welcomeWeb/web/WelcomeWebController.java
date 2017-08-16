package egovframework.example.welcomeWeb.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;

@Controller
public class WelcomeWebController {

	@Resource(name = "welcomeWebService")
	private WelcomeWebService welcomeWebService;
	@SuppressWarnings("unused")
	private ServletRequest request;
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/welcomeWeb.do")
	public String welcomeWeb(HttpServletRequest request, ModelMap model) throws Exception {
		
		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebServiceList();
		
		List<Map> pieChartList = welcomeWebService.selectPieChartList();
		
		model.addAttribute("welcomeWebList", 	welcomeWebList);
		model.addAttribute("pieChartList", 		pieChartList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/welcomeWebMap.do")
	public String welcomeWebMap(HttpServletRequest request, ModelMap model) throws Exception {
		
		HashMap<String, Object> resMap = new HashMap<String, Object>();
		
		resMap.put("AGE", request.getParameter("AGE"));

		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebMapList(resMap);
		
		List<Map> pieChartList = welcomeWebService.selectPieChartList();
		
		model.addAttribute("welcomeWebList", 	welcomeWebList);
		model.addAttribute("pieChartList", 		pieChartList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/welcomeWebString.do")
	public String welcomeWebString(HttpServletRequest request, ModelMap model) throws Exception {

		String age = request.getParameter("AGE");

		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebStringList(age);
		
		List<Map> pieChartList = welcomeWebService.selectPieChartList();
		
		model.addAttribute("welcomeWebList", 	welcomeWebList);
		model.addAttribute("pieChartList", 		pieChartList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "/welcomeWebVO.do")
	public String welcomeWebVO(HttpServletRequest request, ModelMap model) throws Exception {

		WelcomeWebVO vo = new WelcomeWebVO();
		
		vo.setAge(request.getParameter("AGE"));

		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebVOList(vo);
		
		model.addAttribute("welcomeWebList", welcomeWebList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "requestParam.do")
	public String welcomeWebRqsParam(@RequestParam String AGE, String h123, ModelMap model) throws Exception {
		
		System.out.println(AGE);
		System.out.println(h123);
		
		String age = request.getParameter("AGE");

		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebStringList(age);
		
		List<Map> pieChartList = welcomeWebService.selectPieChartList();
		
		model.addAttribute("welcomeWebList", 	welcomeWebList);
		model.addAttribute("pieChartList", 		pieChartList);
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
	
	@SuppressWarnings({ "rawtypes" })
	@RequestMapping(value = "requestParam2.do")
	public String welcomeWebModelAttribute(@ModelAttribute("vo") WelcomeWebVO vo, ModelMap model) throws Exception {
		
		System.out.println(vo.getAge());
		System.out.println(vo.getH123());
	
		List<Map> welcomeWebList = welcomeWebService.selectWelcomeWebVOList(vo);
		
		List<Map> pieChartList = welcomeWebService.selectPieChartList(); 
		
		//model.addAttribute("vo", vo.getAge());
		
		return "welcomeWeb/welcomeWeb.tiles";
	}
}
