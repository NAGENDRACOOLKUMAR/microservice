package com.company.account.controller;


import com.company.account.constant.AccountConstant;
import com.company.account.dto.CustomerDto;
import com.company.account.dto.ResponseDto;
import com.company.account.service.IAccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class AccountController {

    private IAccountService iAccountService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        iAccountService.createAccount(customerDto);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountConstant.STAUS_201, AccountConstant.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber) {
        CustomerDto customerDto = iAccountService.fetchAccount(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(customerDto);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAccountDetails(@RequestBody CustomerDto customerDto) {

        boolean isUpdated = iAccountService.updateAccount(customerDto);
        if (isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(AccountConstant.STATUS_200, AccountConstant.MESSAGE_200));
        } else {
            return ResponseEntity
                    .status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(new ResponseDto(AccountConstant.STATUS_500, AccountConstant.MESSAGE_500));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteAccountDetails(@RequestParam String mobileNumber) {
       boolean isDeleted =  iAccountService.deleteAccount(mobileNumber);
       if(isDeleted){
           return ResponseEntity
                   .status(HttpStatus.OK)
                   .body(new ResponseDto(AccountConstant.STATUS_200,AccountConstant.MESSAGE_200));
       } else{
           return ResponseEntity
                   .status(HttpStatus.INTERNAL_SERVER_ERROR)
                   .body(new ResponseDto(AccountConstant.STATUS_500,AccountConstant.MESSAGE_500));
       }
    }
}
