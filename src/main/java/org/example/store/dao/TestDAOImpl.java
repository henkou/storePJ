package org.example.store.dao;

import org.apache.ibatis.session.SqlSession;
import org.example.store.dto.TestDTO;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class TestDAOImpl implements TestDAO{
    @Inject
    private SqlSession sqlSession;

    @Override
    public List<TestDTO> selectAllTest() throws Exception {
        return sqlSession.selectList("org.example.store.dao.TestDAO.selectAllTest");
    }

//    @Override
//    public TestDTO selectTest(String username) throws Exception {
//        return sqlSession.selectOne("org.example.store.testMapper.getTest")
//    }

    @Override
    public void insertTest(TestDTO testInsert) throws Exception {

    }

    @Override
    public void updateTest(TestDTO testUpdate) throws Exception {

    }

    @Override
    public void deleteTest(String username) throws Exception {

    }
}
