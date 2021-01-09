package org.example.store.service;

import org.example.store.dao.TestDAO;
import org.example.store.dto.TestDTO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class TestServiceImpl implements TestService{

    @Inject
    private TestDAO testDAO;

    @Override
    public List<TestDTO> selectAllTest() throws Exception {
        return testDAO.selectAllTest();
    }

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
