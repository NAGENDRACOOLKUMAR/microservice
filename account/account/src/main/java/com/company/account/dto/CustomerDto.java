package com.company.account.dto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message = " Name can't be null")
    @Size(min = 6, max = 32, message = "the length of the customer should be between 6 and 32")
    private String name;

    @NotEmpty(message = "Email address  can't be null")
    @Email(message = " Email address should be valid value")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number must be 10 digit")
    private String mobileNumber;

    private AccountDto accountDto;
}
