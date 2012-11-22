package kr.co.jkonury.test.service;

import java.util.List;

import kr.co.jkonury.test.model.Test;

public interface TestService {
	public List<Test> getAll() throws Exception;
	public void insert(Test test) throws Exception;
}
