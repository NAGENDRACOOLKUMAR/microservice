package com.company.account.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Account",
        description = "Schema to hold Account information"
)
public class AccountDto {

    @Schema(
            description = "Account Number of Ezybank account"
    )
   @NotEmpty(message = "account number should not be empty")
   @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 12 digit")
   private Long accountNumber;

    @Schema(
            description = "Account type of Ezybank account", example="saving"
    )
   @NotEmpty(message ="Account type can't be null or empty")
    private String accountType;

    @Schema(
            description = "Ezybank branch Address"
    )
   @NotEmpty(message= "Branch Address can't be null or empty")
    private String branchAddress;

}
