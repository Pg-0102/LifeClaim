package com.iceclaim.life_claim.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Claims {
    @Id
    private UUID id;

    @Embedded
    private BankDetails bankDetails;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private Policy policy;

    @OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="decesed_id")
    private  Deceased deceased;

    @ManyToOne
    @JoinColumn(name = "claimants_id")
    private  Claimants claimants;


}
