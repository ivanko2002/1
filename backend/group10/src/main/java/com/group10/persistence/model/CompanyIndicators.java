package com.group10.persistence.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "COMPANY_INDICATORS")
public class CompanyIndicators {
    private String sector;

    @Column(nullable = false)
    private String industry;

    @Column(nullable = false)
    private String companyName;

    @OneToMany
    @JoinColumn(name = "PERSON")
    @Column(nullable = false)
    private long personId;

    @Column(nullable = false)
    private boolean documentConfiscation;

    @Column(nullable = false)
    private boolean excessiveWorkingHours;

    @Column(nullable = false)
    private String livingConditions;

    @Column(nullable = false)
    private boolean lowOrNoSalary;

    @Column(nullable = false)
    private boolean forcedCriminalActivities;

    @Column(nullable = false)
    private boolean forcedTasksOrClients;

    @Column(nullable = false)
    private boolean forcedToLieToAuthorities;

    @Column(nullable = false)
    private boolean violenceOnVictims;

    @Column(nullable = false)
    private boolean deceivedOnJobDescription;
}
