package kr.co.jkonury.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jkonury.test.dao.TestDao;
import kr.co.jkonury.test.model.Test;

@Service
public class TestServiceImpl implements TestService{
	@Autowired
	TestDao testDao;
	
	public List<Test> getAll() throws Exception {
		return testDao.getAll();
	}

	public void insert(Test test) throws Exception {
		testDao.insert(test);
	}

}
