package egovframework.example.welcomeWeb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.welcomeWeb.service.WelcomeWebService;
import egovframework.example.welcomeWeb.service.WelcomeWebVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("welcomeWebService")
public class WelcomeWebServiceImpl extends EgovAbstractServiceImpl implements WelcomeWebService {

	@Resource(name="welcomeWebMapper")
	private WelcomeWebMapper welcomeWebMapper;
	
	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> selectWelcomeWebServiceList() throws Exception {
		
		return welcomeWebMapper.selectWelcomeWebServiceList();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> selectPieChartList() throws Exception {
		
		return welcomeWebMapper.selectPieChartList();
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> selectWelcomeWebMapList(HashMap<String, Object> resMap)
			throws Exception {

		return welcomeWebMapper.selectWelcomeWebMapList(resMap);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> selectWelcomeWebStringList(String age) throws Exception {

		return welcomeWebMapper.selectWelcomeWebStringList(age);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<Map> selectWelcomeWebVOList(WelcomeWebVO vo) throws Exception{
		
		return welcomeWebMapper.selectWelcomeWebVOList(vo);
	}	
}