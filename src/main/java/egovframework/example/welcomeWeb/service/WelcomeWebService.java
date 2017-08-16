package egovframework.example.welcomeWeb.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WelcomeWebService {

	@SuppressWarnings("rawtypes")
	List<Map> selectWelcomeWebServiceList() throws Exception;
	
	@SuppressWarnings("rawtypes")
	List<Map> selectPieChartList() throws Exception;

	@SuppressWarnings("rawtypes")
	List<Map> selectWelcomeWebMapList(HashMap<String, Object> resMap) throws Exception;

	@SuppressWarnings("rawtypes")
	List<Map> selectWelcomeWebStringList(String age) throws Exception;


	@SuppressWarnings("rawtypes")
	List<Map> selectWelcomeWebVOList(WelcomeWebVO vo) throws Exception;
}

