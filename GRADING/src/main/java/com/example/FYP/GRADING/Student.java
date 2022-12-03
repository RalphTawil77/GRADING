package com.example.FYP.GRADING;

import javax.persistence.*;
import javax.transaction.Transactional;

@Transactional
@Entity
@Table (name="students")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long student_id;

    private String student_name;
    private String student_email;
    private String student_password;

//    @ManyToOne
//    @JoinColumn(name = "groupe_grp_id")
//    @ManyToOne
//    @JoinColumn(name = "groupe_grp_id")
//    private Group groupe = new Group();
    private int GrpId;

    public Student(Long id ,String name,String email,String password,int GrpId) {
        super();
        // TODO Auto-generated constructor stub
        this.student_id=id;
        this.student_name=name;
        this.student_email=email;
        this.student_password=password;
        this.GrpId=GrpId;
    }

    public Student() {}

    public Long getStudent_Id() {
        return student_id;
    }

    public void setStudent_id(Long id) {
        this.student_id = id;
    }

    public String getStudent_name() {return student_name;}

    public void setStudent_name(String name) {
        this.student_name = name;
    }

    public String getStudent_email() {
        return student_email;
    }

    public void setStudent_email(String email) {
        this.student_email = email;
    }

    public String getStudent_password() {
       return student_password;
   }

   public void setStudent_password(String password) {this.student_password = password;}

  public int getGrpId() {
      return GrpId;
  }

   public void setGrpId(int grpId) {this.GrpId = grpId;}
}
