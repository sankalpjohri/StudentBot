package com.techie.project.StudentBot.Entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString(doNotUseGetters = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENT_INFO")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ROLL_NO")
    private String rollNo;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FEES")
    private Double fees;
}
