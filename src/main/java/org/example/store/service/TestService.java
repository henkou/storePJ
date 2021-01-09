package org.example.store.service;

import org.example.store.dto.TestDTO;

import java.util.List;

public interface TestService {
    public List<TestDTO> selectAllTest() throws Exception;

    //public TestDTO selectTest(String username) throws Exception;

    public void insertTest(TestDTO testInsert) throws Exception;

    public void updateTest(TestDTO testUpdate) throws Exception;

    public void deleteTest(String username) throws Exception;
}
