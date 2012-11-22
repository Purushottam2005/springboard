package kr.co.jkonury.test.dao;

import java.util.List;

import kr.co.jkonury.test.model.Test;

public interface TestDao {
	public List<Test> getAll() throws Exception; 
	public void insert(Test test) throws Exception;
}
