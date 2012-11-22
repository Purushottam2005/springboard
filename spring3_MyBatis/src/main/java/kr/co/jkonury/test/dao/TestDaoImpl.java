package kr.co.jkonury.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jkonury.test.model.Test;

@Repository
public class TestDaoImpl implements TestDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<Test> getAll() throws Exception {
		
		return sqlSession.selectList("test.getAll");
	}

	public void insert(Test test) throws Exception {
		sqlSession.insert("test.insertTest", test);
	}
}
