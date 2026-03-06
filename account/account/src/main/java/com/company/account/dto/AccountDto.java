package com.company.account.dto;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountDto {

   @NotEmpty(message = "account number should not be empty")
   @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 12 digit")
   private Long accountNumber;

   @NotEmpty(message ="Account type can't be null or empty")
    private String accountType;

   @NotEmpty(message= "Branch Address can't be null or empty")
    private String branchAddress;

}
