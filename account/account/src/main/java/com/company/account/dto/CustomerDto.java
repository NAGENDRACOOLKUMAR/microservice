package com.company.account.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @Schema(

            description = "Name of the Customer", example = "Nagendra kumar"
    )
    @NotEmpty(message = " Name can't be null")
    @Size(min = 6, max = 32, message = "the length of the customer should be between 6 and 32")
    private String name;

    @Schema(

            description = "Email address of the Customer", example = "poonamkumari@gmail.com"
    )
    @NotEmpty(message = "Email address  can't be null")
    @Email(message = " Email address should be valid value")
    private String email;

    @Schema(

            description = "Mobile Number of the Customer", example = "8765432908"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "mobile number must be 10 digit")
    private String mobileNumber;

    @Schema(

            description = "Account details of the Customer"
    )
    private AccountDto accountDto;
}
