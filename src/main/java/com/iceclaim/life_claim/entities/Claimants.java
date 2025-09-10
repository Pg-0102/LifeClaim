package com.iceclaim.life_claim.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Claimants {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer claimantsId;

    private  String firstName;
    private  String lastname;
    private  String relationship;
    private  String contactNumber;

    @OneToMany
    private List<Claims> claimsList = new ArrayList<>();

}
