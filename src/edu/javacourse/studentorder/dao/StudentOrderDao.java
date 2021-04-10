package edu.javacourse.studentorder.dao;

import edu.javacourse.studentorder.domain.StudentOrder;
import edu.javacourse.studentorder.exception.DaoException;

import java.sql.SQLException;

public interface StudentOrderDao
{
    Long saveStudentOrder(StudentOrder so) throws DaoException, SQLException;
}
