package com.company.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name =  "Error Response",
        description = "schema to hold the error information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API Path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happening"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error happen"
    )
    private String errorMsg;

    @Schema(
            description = "Error time representing the when the error happen "
    )
    private LocalDateTime errorTime;

}
