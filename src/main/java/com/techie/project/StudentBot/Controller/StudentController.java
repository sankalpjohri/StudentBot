package com.techie.project.StudentBot.Controller;

import com.techie.project.StudentBot.Response.Response;
import com.techie.project.StudentBot.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    @Qualifier("com.techie.project.StudentBot.Service.impl.StudentServiceImpl")
    private StudentService studentService;

    @RequestMapping(path = "/student/{rollNo}/fees", method = RequestMethod.GET)
    public ResponseEntity<Response> getStudentFees(@PathVariable("rollNo") String rollNo) {
        Response responseObject = studentService.getStudentFees(rollNo);
        return new ResponseEntity<>(responseObject, HttpStatus.OK);
    }

}
