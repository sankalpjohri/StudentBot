package com.techie.project.StudentBot.Service.impl;

import antlr.StringUtils;
import com.techie.project.StudentBot.Entity.Student;
import com.techie.project.StudentBot.Repository.StudentRepository;
import com.techie.project.StudentBot.Response.Response;
import com.techie.project.StudentBot.Response.ResponseData;
import com.techie.project.StudentBot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("com.techie.project.StudentBot.Service.impl.StudentServiceImpl")
public class StudentServiceImpl implements StudentService{

    @Autowired
    @Qualifier("com.techie.project.StudentBot.Repository.StudentRepository")
    private StudentRepository studentRepository;

    @Override
    public Response getStudentFees(String rollNo) {
        Response responseObject = new Response();
        ResponseData responseData = new ResponseData("text", "No Data Found");
        responseObject.setData(responseData);
        if (rollNo != null && rollNo != "") {
            Student student = studentRepository.findByRollNo(rollNo);
            if (student != null) {
                responseData.setText(Double.toString(student.getFees()));
            }
        }
        return responseObject;
    }
}
