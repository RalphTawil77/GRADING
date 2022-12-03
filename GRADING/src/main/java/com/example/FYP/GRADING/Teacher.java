package com.example.FYP.GRADING;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    private Long teacher_id;
    private String teacher_name;
    private String teacher_email;
    private String teacher_password;

    public Teacher(Long id , String name, String email, String password, int GrpId) {
        super();
        // TODO Auto-generated constructor stub
        this.teacher_id =id;
        this.teacher_name =name;
        this.teacher_email =email;
        this.teacher_password =password;
    }

    public Teacher() {}

    public Long getTeacher_Id() {
        return teacher_id;
    }

    public void setTeacher_id(Long id) {
        this.teacher_id = id;
    }

    public String getTeacher_name() {return teacher_name;}

    public void setTeacher_name(String name) {
        this.teacher_name = name;
    }

    public String getTeacher_email() {
        return teacher_email;
    }

    public void setTeacher_email(String email) {
        this.teacher_email = email;
    }

}


