/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.infoRetriever.studentDao.impl;

import com.leapfrog.infoRetriever.entity.Student;
import com.leapfrog.infoRetriever.studentDao.StudentDao;
import java.util.ArrayList;

/**
 *
 * @author chira
 */
public class StudentDaoImpl implements StudentDao {

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Student> studentListPerm = new ArrayList<>();

    @Override
    public boolean add(Student s) {

        studentList.add(s);

        return true;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Student> showAll() {
        //row new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return studentList;
    }



    @Override
    public boolean checkEmail(Student s) {
        int checkEmail = 0;
        for (Student std : studentList) {
            if (std.getEmail().equals(s.getEmail())) {
                checkEmail = 1;
            }

        }
        if (checkEmail == 1) {
            return true;
        } else {
            return false;

        }
    }

    @Override
    public boolean checkId(Student s) {
        int checkId = 0;
        for (Student std : studentList) {
            if (std.getId() == s.getId()) {
                checkId = 1;

            }

        }
        if (checkId == 1) {
            return true;
        } else {
            return false;
        }
    }

}
