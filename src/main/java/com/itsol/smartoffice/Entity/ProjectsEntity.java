package com.itsol.smartoffice.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class ProjectsEntity {
    @Id
    private String id_project;
    private String name_project;
    private Date start_time;
    private Date end_time;
    @OneToMany(mappedBy = "projectsEntity", fetch = FetchType.LAZY)
    private List<Teamlead_projectEntity> teamlead_projectEntities;
}
