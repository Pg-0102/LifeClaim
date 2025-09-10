package com.iceclaim.life_claim.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer policyId;
    private String policyNumber;
    private String policyType;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany
    private List<Claims> claims=new ArrayList<>();


}
