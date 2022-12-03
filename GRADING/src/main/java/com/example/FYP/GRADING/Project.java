package com.example.FYP.GRADING;


import javax.persistence.*;

@Entity
@Table(name="Groups_")
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ProjectID;
    private String Project_description;
    private String ProjectName;
    private String Supervisor;
    //OnetoOne()
    int GrpId;


    public Project() {
    }

    public Project(Long projectID, String project_description, String projectName, String supervisor) {
        super();
        ProjectID = projectID;
        Project_description = project_description;
        ProjectName = projectName;
        Supervisor = supervisor;
    }

}
