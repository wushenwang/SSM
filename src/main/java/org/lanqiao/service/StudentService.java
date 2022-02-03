package org.lanqiao.service;

import org.lanqiao.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;


public interface StudentService {
    public void addStudent(Student student);
    public Student sletcttest(int stuNo);
}
