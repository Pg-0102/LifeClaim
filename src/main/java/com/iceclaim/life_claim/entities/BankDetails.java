package com.iceclaim.life_claim.entities;

import jakarta.persistence.Embeddable;

@Embeddable

public class BankDetails {
    private String bankName;
    private String accountName;
    private String ifscCode;
    private String bankAddress;

}
