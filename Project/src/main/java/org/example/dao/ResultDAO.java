package org.example.dao;

import org.example.model.Result;
import java.util.List;

public interface ResultDAO {
    int addResult(Result r) throws Exception;
    boolean updateResult(Result r) throws Exception;
    Result getResultByStudentId(int studentId) throws Exception;
    List<Result> getAllResults() throws Exception;
    boolean deleteResultByStudentId(int studentId) throws Exception;
}
